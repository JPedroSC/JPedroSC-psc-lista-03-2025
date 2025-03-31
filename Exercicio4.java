import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código da operação (1 - perímetro, 2 - área, 3 - volume): ");
        int opcao = scanner.nextInt();
        System.out.print("Digite o raio: ");
        double r = scanner.nextDouble();
        double pi = 3.141592;

        switch (opcao) {
            case 1:
                System.out.println("Perímetro: " + (2 * pi * r));
                break;
            case 2:
                System.out.println("Área: " + (pi * r * r));
                break;
            case 3:
                System.out.println("Volume: " + ((4.0 / 3.0) * pi * r * r * r));
                break;
            default:
                System.out.println("Código da operação inválido.");
        }
        scanner.close();
    }
}
