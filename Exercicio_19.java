import java.util.Scanner;

// Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seuvolume calculado de acordo 
//com a seguinte fórmula:
// volume = 3.14 * raio2 * altura;Exemplo: raio = 10, altura = 15. Volume = 4710


public class Exercicio_19 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o valor da altura do cilindro: ");
        double h = leitor.nextDouble();

        System.out.println("Insira o valor da raio da base do cilindro: ");
        double r = leitor.nextDouble();

        double vol = 3.14 * r * r * h;

        System.out.println("O volume do cilindro é: " + vol);

        

        leitor.close();
    }
    
}
