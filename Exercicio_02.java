//Escreva um algoritmo que leia dois números digitados pelo usuário e exiba oresultado da sua soma.
import java.util.Scanner;
public class Exercicio_02 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o resultado da sua soma.");

        System.out.println("insira o primeiro numero: ");
        double  num1 = leitor.nextDouble();

        System.out.println("insira o segundo valor: ");
        double num2 = leitor.nextDouble();

        System.out.println("A soma dos valores é " + (num1 + num2));


        leitor.close();
    }
}
