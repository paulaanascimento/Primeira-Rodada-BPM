import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------- CALCULADORA DE FATORIAL ----------");

        try{
            int numero;

            do{
                System.out.print("Digite um número inteiro de 1 a 12: ");
                numero = scanner.nextInt();
                if(numero < 1 || numero > 12){
                    System.out.println("\nPor favor, digite um número dentro do intervalo fornecido.\n");
                } else {
                    int resultado = FatorialSimples.retornaFatorial(numero);
                    System.out.println("\nO fatorial do número " + numero + " é " + resultado);
                }
            } while (numero < 1 || numero > 12);


        } catch (InputMismatchException exception){
            System.err.println("\nERRO: Para calcular o fatorial, você deve informar um número inteiro!");
        }
    }
}
