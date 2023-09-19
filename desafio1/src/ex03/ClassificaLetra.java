package ex03;

import java.util.ArrayList;

public class ClassificaLetra {
    private ArrayList<Character> vogais = new ArrayList<>();
    private ArrayList<Character> consoantes = new ArrayList<>();

    public String letraEhVogalOuConsoante(char letra){
        iniciarListasDeLetras();
        if(vogais.contains(letra)){
            return "a letra fornecida é vogal";
        } else if(consoantes.contains(letra)){
            return "a letra fornecida é consoante";
        } else return "o char fornecido não é uma letra";
    }

    private void iniciarListasDeLetras(){
        vogais.add('a');
        vogais.add('e');
        vogais.add('i');
        vogais.add('o');
        vogais.add('u');

        vogais.add('A');
        vogais.add('E');
        vogais.add('I');
        vogais.add('O');
        vogais.add('U');

        consoantes.add('b');
        consoantes.add('c');
        consoantes.add('d');
        consoantes.add('f');
        consoantes.add('g');
        consoantes.add('h');
        consoantes.add('j');
        consoantes.add('k');
        consoantes.add('l');
        consoantes.add('m');
        consoantes.add('n');
        consoantes.add('p');
        consoantes.add('q');
        consoantes.add('r');
        consoantes.add('s');
        consoantes.add('t');
        consoantes.add('v');
        consoantes.add('w');
        consoantes.add('x');
        consoantes.add('y');
        consoantes.add('z');

        consoantes.add('B');
        consoantes.add('C');
        consoantes.add('D');
        consoantes.add('F');
        consoantes.add('G');
        consoantes.add('H');
        consoantes.add('J');
        consoantes.add('K');
        consoantes.add('L');
        consoantes.add('M');
        consoantes.add('N');
        consoantes.add('P');
        consoantes.add('Q');
        consoantes.add('R');
        consoantes.add('S');
        consoantes.add('T');
        consoantes.add('V');
        consoantes.add('W');
        consoantes.add('X');
        consoantes.add('Y');
        consoantes.add('Z');
    }
}
