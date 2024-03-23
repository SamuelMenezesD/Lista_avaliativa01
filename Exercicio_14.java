import java.util.Scanner;

//A expressão an = a1 + (n – 1) * r é denominada termo geral da ProgressãoAritmética (PA). Nesta fórmula, 
//temos que an é o termo de ordem n (n-ésimo termo),r é a razão e a1 é o primeiro termo da Progressão Aritmética.
// Escreva um algoritmoque encontre o n-ésimo termo de uma progressão aritmética. 
//Exemplo: a1 = 10, n =7, r = 3. Resultado: an = 28

public class Exercicio_14 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o primeiro termo da PA: ");
        int a1 = leitor.nextInt();

        System.out.println("Insira a razão da PA: ");
        int r = leitor.nextInt();

        System.out.println("Insira o numero de termos: ");
        int n = leitor.nextInt();

        int an = a1 + (n - 1) * r;

        System.out.println("O ultimo termo da PA é: " + an);

        

        leitor.close();

    }
}
