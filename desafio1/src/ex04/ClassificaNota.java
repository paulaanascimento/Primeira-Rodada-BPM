package ex04;

public class ClassificaNota {
    public static String classificarNota(double nota){
        if(nota < 0 || nota > 10){
            return "Por favor, informe uma nota entre 0 e 10";
        } else if(nota >= 8){
            return "Aprovado";
        } else if(nota >=6){
            return "Em recuperação";
        } else return "Reprovado";
    }
}
