package Aula2.Modelos;

import java.util.ArrayList;

public class Serie extends Filme {
    ArrayList<Episodio> episodios = new ArrayList<>();
    public Serie(int duracaoEmMinutos, String nome, int anoDeLancamento, int avaliacao, ArrayList<Episodio> episodios) {
        super(duracaoEmMinutos, nome, anoDeLancamento, avaliacao);
        this.episodios = episodios;
    }

}
