import java.util.Scanner;
import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Digite dois números inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        int sorteado = random.nextInt(maior - menor + 1) + menor;

        System.out.println("Número sorteado: " + sorteado);
        System.out.println("O número é " + (sorteado % 2 == 0 ? "par" : "ímpar"));

        scanner.close();
    }
}
