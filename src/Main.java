import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha a operação (+, -, * ou /)");
        char operacao = scanner.next().charAt(0);

        double resultado = 0.0;

        switch (operacao){
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operação inválida!");
        }

        System.out.println(numero1 + " " + operacao + " " + numero2 + " = " + resultado);
    }
}