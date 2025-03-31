import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite dois números: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /, ^): ");
        char operacao = scanner.next().charAt(0);

        switch (operacao) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0)
                    System.out.println("Resultado: " + (num1 / num2));
                else
                    System.out.println("Erro: divisão por zero.");
                break;
            case '^':
                System.out.println("Resultado: " + Math.pow(num1, num2));
                break;
            default:
                System.out.println("Símbolo de operação inválido.");
        }
        scanner.close();
    }
}
