import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------- CALCULADORA DE CONSUMO MÉDIO DE AUTOMÓVEL ----------");

        try {
            int distancia;
            double combustivelConsumido;

            System.out.print("Digite a distancia total percorrida em KM: ");
            distancia = scanner.nextInt();

            System.out.print("Digite o total combustível consumido em litros: ");
            combustivelConsumido = scanner.nextDouble();

            BigDecimal consumoMedio = ConsumoMedioAutomovel.retornaConsumoMedioCombustivel(distancia, combustivelConsumido);

            System.out.println("\nConsumo médio: " + consumoMedio + "km/l");

        }catch (InputMismatchException exception){
            System.err.println("\nERRO: Para calcular o consumo médio do automóvel, você a distancia em inteiro e o total do combustível em real (usando vírgula).");
        }
    }
}
