package Aula2.Modelos;

public class Filme {
    
    float duracaoEmMinutos;
    String nome;
    int anoDeLancamento;
    int avaliacao;
    
    public Filme(float duracaoEmMinutos, String nome, int anoDeLancamento, int avaliacao) {
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.avaliacao = avaliacao;
    }
    public float getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(float duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    
}
