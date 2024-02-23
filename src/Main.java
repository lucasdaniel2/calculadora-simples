
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Basica");
        System.out.println(); //adiciona um espaço em branco
        System.out.println("Qual operação gostaria de fazer ? Tecle:");
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4-Divisão");

        int escolha = scanner.nextInt();

        System.out.println("Digite o primeiro numero:");
        int numA = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        int numB = scanner.nextInt();

        int resultado;

        switch (escolha) {
            case 1:
                resultado = numA + numB;
                System.out.println("A soma de " + numA + " + " + numB + " é igual a " + resultado);
                break;

            case 2:
                resultado = numA - numB;
                System.out.println("A subtração de " + numA + " - " + numB + " é igual a " + resultado);
                break;

            case 3:
                resultado = numA * numB;
                System.out.println("A multiplicação de "+ numA + " X " + numB + " é igual a " + resultado);
                break;

            case 4:
                resultado = numA / numB;
                System.out.println("A divisão de " + numA + " / " + numB + " é igual a "+ resultado);
                break;

            default:
                System.out.println("Opção Invalida !");
        }




    }
}
