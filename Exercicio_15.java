import java.util.Scanner;

//Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2,y2), 
//calcule e retorne a distância entre eles. A fórmula que efetua tal cálculo é:
// d = raiz(((x2 - x1)2) + ((y2 - y1)2)). Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03

public class Exercicio_15 {
    public static void executar(){
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite o valor de x1");
        double x1 = leitor.nextDouble();
        System.out.println("Digite o valor de x2");
        double x2 = leitor.nextDouble();

        System.out.println("Digite o valor de y1");
        double y1 = leitor.nextDouble();
        System.out.println("Digite o valor de y2");
        double y2 = leitor.nextDouble();

        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("A distancia entre os pontos é: " + d);

        leitor.close();
    }
    
}
