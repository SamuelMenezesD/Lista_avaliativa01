// Escreva um algoritmo que leia um número digitado pelo usuário e mostre amensagem “Número maior do que 10!”, caso este número seja maior, ou “Númeromenor ou igual a 10!”, caso este número seja menor ou igual.

import java.util.Scanner;

public class Exercicio_01 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = leitor.nextInt();

        if (num1 < 10) {
            System.out.println("numero menor que 10!");
            
        }
        else{
            System.out.println("Número menor ou igual a 10!");
        }
        leitor.close();
        

    }

}
