//Elabore um algoritmo que receba três 
//notas de um aluno e retorne a sua média aritmética.
// Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83
import java.util.Scanner;

public class Exercicio_16 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double nt1 = leitor.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double nt2 = leitor.nextDouble();

        System.out.println("Insira a terça nota: ");
        double nt3 = leitor.nextDouble();

        double media = (nt1 + nt2 + nt3)/3;

        System.out.println("A media das notas é: " + media);


        leitor.close();
    }
    
}
