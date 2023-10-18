package Aula2;

import Aula2.Modelos.Filme;

public class Main {
    public static void main(String[] args) {
        System.out.println("Base pronta");
        var filmeTeste = new Filme(120, "O dia em que a terra parou", 1951, 10);
        System.out.println(filmeTeste.getNome());
        
    }
}

