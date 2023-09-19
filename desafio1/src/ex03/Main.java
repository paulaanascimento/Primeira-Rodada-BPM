package ex03;

public class Main {
    public static void main(String[] args) {
        ClassificaLetra classificaLetra = new ClassificaLetra();
        String classificacao = classificaLetra.letraEhVogalOuConsoante('v');
        System.out.println(classificacao);
    }
}
