import java.util.Scanner;

//Escreva um algoritmo que leia um número e mostre uma mensagem caso este
//número seja maior ou igual a 50, outra se ele for menor que 50.


public class Exercicio_08 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num = leitor.nextDouble();

        if (num >= 50) {
            System.out.println("O numero é maior ou igual a 50");

            
        }
        else {
            System.out.println("O numero é menor que 50");
        }
        leitor.close();
    }
    
}
