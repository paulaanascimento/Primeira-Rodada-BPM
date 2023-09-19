package ex05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(5);
        listaNumeros.add(9);
        listaNumeros.add(1);

        System.out.println(Ordenacao.ordenaNumerosEmDescrescente(listaNumeros));
    }
}
