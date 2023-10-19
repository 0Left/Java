package Aula2;

import java.util.ArrayList;

import Aula2.Modelos.Filme;

public class Main {
    public static void main(String[] args) {
        var filme1 = new Filme(92, "O dia em que a terra parou", 1951, 10);
        var filme2 = new Filme(91,"A Casa Monstro",2006,9);
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        System.out.println(listaDeFilmes);
    }
}

