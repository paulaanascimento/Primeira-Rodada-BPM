
public class FatorialSimples {
    public static int retornaFatorial(int numero){
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}