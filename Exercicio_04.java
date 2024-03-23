import java.util.Scanner;

//Escreva um algoritmo que leia 
//dois números e ao final mostre a soma, subtração,multiplicação e a divisão dos números lidos.
public class Exercicio_04 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("insira valor 1: ");
        int num1 = leitor.nextInt();

        System.out.println("insira valor 2: ");
        int num2 = leitor.nextInt();

        System.out.println("A soma, subtração, multiplicação, e divisão são respectivamente: " + (num1 + num2) + " " +(num1 - num2) + " " + (num1 * num2)+ " " +(num1/num2) + " " );

        leitor.close();
    }
    
}
