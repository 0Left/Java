package ApiTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Aula2.Modelos.Filme;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String chave = getKey() ;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do filme para busca: ");
        var busca = leitura.nextLine();
        leitura.close();

        String endereco = "https://www.omdbapi.com/?t=" +busca + "&apikey=" +chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
       
        Gson gson = new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        .create();
        // Filme meuFilme = gson.fromJson(response.body(), Filme.class);
        TituloOmdb meuFilmeOmdb = gson.fromJson(response.body(), TituloOmdb.class);
        System.out.println(meuFilmeOmdb);
    }
    static String getKey() throws FileNotFoundException, IOException{
        Properties properties = new Properties();
        FileInputStream fileInput = new FileInputStream("config.properties");
        properties.load(fileInput);
        String chave = properties.getProperty("api.key");
        return chave;
    }
}
