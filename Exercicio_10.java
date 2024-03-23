import java.util.Scanner;
//Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso.
// Casoo usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número inválido!”
public class Exercicio_10 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 5: ");
        int op = leitor.nextInt();

        switch (op) {
            case 1:
                System.out.println("numero um");    

                break;
            case 2:
                System.out.println("numero dois");
                break;

            case 3:
                System.out.println("numero três");
                break;
            
            case 4:
                System.out.println("numero quatro");
                break;

            case 5:
                System.out.println("numero cinco");

                break;
        
            default:
                System.out.println("Numero invalido");
                break;
        }


        leitor.close();

    }
    
}
