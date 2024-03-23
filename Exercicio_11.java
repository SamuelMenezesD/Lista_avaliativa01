import java.util.Arrays;
import java.util.Scanner;
//Escreva um algoritmo que leia três valores inteiros distintos e escreva-os emordem crescente
public class Exercicio_11 {
    public static void executar (){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        int num1 = leitor.nextInt();

        System.out.println("Insira o segundo valor: ");
        int num2 = leitor.nextInt();


        System.out.println("Insira o terceiro valor: ");
        int num3 = leitor.nextInt();

        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);

        System.out.println("Os números em ordem crescente são: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        





        
    }
    
}
