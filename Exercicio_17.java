import java.util.Scanner;

// Elabore um algoritmo que receba três notas de um aluno os pesos referentes acada nota e 
//retorne a sua média ponderada. Veja o cálculo da média ponderada:
//Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3peso1 + peso2 + peso3Exemplo: nota1 = 10,
// nota2 = 5.5, nota3 = 8,
// peso1 = 5, peso2 = 3, peso3 = 2Média ponderada = 8.25

public class Exercicio_17 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o valor da nota um: ");
        double nt1 = leitor.nextDouble();
        System.out.println("Insira o peso da nota um: ");
        double ps1 = leitor.nextDouble();

        System.out.println("Insira o valor da nota dois: ");
        double nt2 = leitor.nextDouble();
        System.out.println("Insira o peso da nota dois: ");
        double ps2 = leitor.nextDouble();

        System.out.println("Insira o valor da nota tres: ");
        double nt3 = leitor.nextDouble();
        System.out.println("Insira o peso da nota tres: ");
        double ps3 = leitor.nextDouble();

        double mediap = ((nt1 * ps1) + (nt2 * ps2) + (nt3 * ps3)) / ps1 + ps2 + ps3;

        System.out.println("A media ponderada é: " + mediap);


        leitor.close();

    }
    
}
