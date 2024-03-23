import java.util.Scanner;
//Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor da variável 
//A passe a ser o valor da variável B e o valor da variável B passe a ser ovalor da variável A.
// Apresentar uma mensagem com o valor original de cada variávele outra com os valores trocados

public class Exercicio_05 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira primeira variavel: ");
        double A = leitor.nextDouble();

        System.out.println("Insira segunda variavel: ");
        double B = leitor.nextDouble();

        System.out.println("As variaveis iniciais são respectivamente: " + A + "|| " + B + "\n");

        double C = A;

        A = B;

        B = C;

        System.out.println("As variaveis trocadas são respectivamente são: " + A + "|| " + B + "\n") ;

        leitor.close();

    }
}
