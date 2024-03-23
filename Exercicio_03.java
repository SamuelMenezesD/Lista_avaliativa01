import java.util.Scanner;
//Escreva um algoritmo que leia os valores de dois números inteiros distintos nas 
//variáveis A e B e informe qual deles é o maior. 
//Caso os números sejam iguais informarao usuário que a sequência de números informados é inválida.

public class Exercicio_03 {
    public static void executar(){
        Scanner leitor = new Scanner (System.in);

        System.out.println("insira valor 1: ");
        int maior = leitor.nextInt();

        System.out.println("insira valor 2: ");
        int num2 = leitor.nextInt();

        if (maior <= num2) {
            if (maior == num2) {
                System.out.println("Numeros informados não são validos");

            }
            else{
                maior = num2;
            }
            
            
        }
        System.out.println("O maior numero é: " + maior);
            
        
        leitor.close();



    }
}
