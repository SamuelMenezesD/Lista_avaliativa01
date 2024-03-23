import java.util.Scanner;
//Leia dois números nas variáveis A e B e identifique se os valores são iguais oudiferentes. 
//Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.Caso sejam diferentes, 
//informe que são diferentes e qual número é o maior.

public class Exercicio_09 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o primeiro numero: ");
        double num1 = leitor.nextDouble();

        System.out.println("Insira o segundo numero: ");
        double num2 = leitor.nextDouble();

        if (num1 == num2) {
            System.out.println("Os numeros são iguais");
        }
        else{
            if (num1 > num2) {

                System.out.println("Os numeros são diferentes e o maior valor é " + num1);
                
            }
            else{
                System.out.println("Os numeros são diferentes e o maior valor é " + num2);
            }
        }
        leitor.close();
    }
}
