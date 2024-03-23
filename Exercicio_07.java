import java.util.Scanner;
//Escreva um algoritmo que leia um número e diga, através de uma mensagem,
// se este número está no intervalo entre 100 e 200. 
//Caso o número esteja fora do intervaloo usuário também deverá ser informado

public class Exercicio_07 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num = leitor.nextDouble();

        if (num>100 && num>200) {

            System.out.println("Este numero está entre 100 e 200");
            
        }
        else{
            System.out.println("O numero não está entre 100 e 200");
        }
        leitor.close();
        
    }

    
    
}
