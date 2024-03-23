import java.util.Scanner;
//Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em uma viagem,
// utilizando um automóvel
// que faz 12km por litro e considerando que são fornecidos o tempo em hora e a velocidade média da viagem.


public class Exercicio_20 {
    public static void executar(){
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Insira a velocidade media: ");
    double velomedia = leitor.nextDouble();

    System.out.println("Insira o tempo da viagem: ");
    double tempo = leitor.nextDouble();

    double litrosgasto = (velomedia * tempo) /12;

    System.out.println("O gasto do carro nesta viagem foi de " + litrosgasto + "litros");

    leitor.close();

    }
}
