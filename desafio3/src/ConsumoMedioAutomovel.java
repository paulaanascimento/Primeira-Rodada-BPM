import java.math.BigDecimal;

public class ConsumoMedioAutomovel {
    public static BigDecimal retornaConsumoMedioCombustivel(int distancia, double combustivelConsumido){
        return BigDecimal.valueOf(distancia/combustivelConsumido).setScale(3, BigDecimal.ROUND_HALF_EVEN);
    }
}