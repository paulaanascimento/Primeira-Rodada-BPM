package ex05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {
    public static List<Integer> ordenaNumerosEmDescrescente(ArrayList<Integer> listaNumeros){
        Collections.sort(listaNumeros);
        Collections.reverse(listaNumeros);
        return listaNumeros;
    }
}
