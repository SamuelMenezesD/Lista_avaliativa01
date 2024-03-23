import java.util.Scanner;

//Elabore um algoritmo que receba três notas de um aluno e retorne a sua médiaharmônica


public class Exercicio_18 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double nt1 = leitor.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double nt2 = leitor.nextDouble();

        System.out.println("Insira a terceira nota: ");
        double nt3 = leitor.nextDouble();

        double mediahar = (3)/(1/nt1)+(1/nt2)+(1/nt3);

        System.out.println("A media harmonica é: " + mediahar);

        leitor.close();
    }
    
}
