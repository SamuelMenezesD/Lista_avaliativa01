import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menu de Opções:");
        System.out.println("1. exercicio 1");
        System.out.println("2. exercicio 2");
        System.out.println("3. exercicio 3");
        System.out.println("4. exercicio 4");
        System.out.println("5. exercicio 5");
        System.out.println("6. exercicio 6");
        System.out.println("7. exercicio 7");
        System.out.println("8. exercicio 8");
        System.out.println("9. exercicio 9");
        System.out.println("10. exercicio 10");
        System.out.println("11. exercicio 11");
        System.out.println("12. exercicio 12");
        System.out.println("13. exercicio 13");
        System.out.println("14. exercicio 14");
        System.out.println("15. exercicio 15");
        System.out.println("16. exercicio 16");

        System.out.print("Escolha uma exercicio: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a Exercicio 1");
                Exercicio_01.executar();
                break;
            case 2:
                System.out.println("Você escolheu a Exercicio 2");
                Exercicio_02.executar();
                break;
            case 3:
                System.out.println("Você escolheu a Exercicio 3");
                Exercicio_03.executar();
                break;
            case 4:
                System.out.println("Você escolheu a Exercicio 4");
                Exercicio_04.executar();
                break;
            case 5:
                System.out.println("Você escolheu a Exercicio 5");
                Exercicio_05.executar();
                break;
            case 6:
                System.out.println("Você escolheu a Exercicio 6");
                break;
            case 7:
                System.out.println("Você escolheu a Exercicio 7");
                break;
            case 8:
                System.out.println("Você escolheu a Exercicio 8");
                break;
            case 9:
                System.out.println("Você escolheu a Exercicio 9");
                break;
            case 10:
                System.out.println("Você escolheu a Exercicio 10");
                break;
            case 11:
                System.out.println("Você escolheu a Exercicio 11");
                break;
            case 12:
                System.out.println("Você escolheu a Exercicio 12");
                break;
            case 13:
                System.out.println("Você escolheu a Exercicio 13");
                break;
            case 14:
                System.out.println("Você escolheu a Exercicio 14");
                break;
            case 15:
                System.out.println("Você escolheu a Exercicio 15");
                break;
            case 16:
                System.out.println("Você escolheu a Exercicio 16");
                break;
            default:
                System.out.println("Exercicio inválida!");
                break;
        }

        scanner.close();
        
        
    }

}
