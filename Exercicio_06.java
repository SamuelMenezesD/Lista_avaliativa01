import java.util.Scanner;
//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.

public class Exercicio_06 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira temperatura em graus Celsius:");
        double celsius = leitor.nextDouble();

        double fahrenheit = ((celsius * 9)/5) + 32;

        System.out.println("O valor em Fahrenheit é:" + fahrenheit);

        leitor.close();

    }
    
}
