import java.util.Scanner;
//Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de operador em outra 
//variável do tipo CARACTERE. Imprima o resultado da operação
//de A por B se o operador aritmético for válido; caso contrário deve ser 
//impresso uma mensagem de operador não definido. Tratar erro de divisão por zero

public class Exercicio_13 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double num1 = leitor.nextInt();

        System.out.println("Digite o segundo valor: ");
        double num2 = leitor.nextInt();

        System.out.println(("Digite o operador + (para adição) - (para subtração) * (para multiplicação) / (para divisão)"));
        String op = leitor.nextLine();

        switch (op) {
            case "+":
                double soma = num1 + num2;
                System.out.println("O resultado é " + soma);
                
                break;

            case "-":
                double subtracao = num1 - num2;
                System.out.println("O resultado é " + subtracao);
                
                break;

            case "*":
                double multiplicacao = num1 * num2;
                System.out.println("O resultado é " + multiplicacao);
                
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("Divisão por zero!!!");
                    
                }
                else{
                double divicao = num1 / num2;
                System.out.println("O resultado é " + divicao);
                }
                
                break;
                

            
        
            default:
                System.out.println(" Valor não definido");
                break;
        }

       leitor.close();
        
    }
    
}
