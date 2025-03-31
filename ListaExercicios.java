import java.util.Scanner; import java.util.Random;

public class ListaExercicios { public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

System.out.println("Digite três números:");
    double num1 = scanner.nextDouble();
    double num2 = scanner.nextDouble();
    double num3 = scanner.nextDouble();
    double maior = Math.max(num1, Math.max(num2, num3));
    double menor = Math.min(num1, Math.min(num2, num3));
    double media = (num1 + num2 + num3) / 3;
    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);
    System.out.println("Média: " + media);

    System.out.println("Digite o valor da compra e o valor pago:");
    int valorCompra = scanner.nextInt();
    int valorPago = scanner.nextInt();
    if (valorPago < valorCompra) {
        System.out.println("Quantia insuficiente.");
    } else {
        int troco = valorPago - valorCompra;
        int[] notas = {50, 20, 10, 5, 2, 1};
        System.out.println("Troco: R$" + troco);
        for (int nota : notas) {
            int quantidade = troco / nota;
            if (quantidade > 0) {
                System.out.println("Notas de R$" + nota + ": " + quantidade);
                troco %= nota;
            }
        }
    }

    System.out.println("Digite os coeficientes a, b e c:");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    if (a == 0 && b == 0 && c != 0) {
        System.out.println("Coeficientes incorretos.");
    } else if (a == 0) {
        System.out.println("Raiz: " + (-c / b));
    } else {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Sem raízes reais.");
        } else if (delta == 0) {
            System.out.println("Raiz única: " + (-b / (2 * a)));
        } else {
            System.out.println("Raízes: " + ((-b + Math.sqrt(delta)) / (2 * a)) + " e " + ((-b - Math.sqrt(delta)) / (2 * a)));
        }
    }

    System.out.println("Digite um código (1-Perímetro, 2-Área, 3-Volume) e o raio:");
    int opcao = scanner.nextInt();
    double raio = scanner.nextDouble();
    double pi = 3.141592;
    switch (opcao) {
        case 1:
            System.out.println("Perímetro: " + (2 * pi * raio));
            break;
        case 2:
            System.out.println("Área: " + (pi * raio * raio));
            break;
        case 3:
            System.out.println("Volume: " + ((4.0 / 3.0) * pi * Math.pow(raio, 3)));
            break;
        default:
            System.out.println("Código inválido.");
    }
    
    System.out.println("Digite dois números e um operador (+, -, *, /, ^):");
    double numA = scanner.nextDouble();
    double numB = scanner.nextDouble();
    char operador = scanner.next().charAt(0);
    switch (operador) {
        case '+': System.out.println("Resultado: " + (numA + numB)); break;
        case '-': System.out.println("Resultado: " + (numA - numB)); break;
        case '*': System.out.println("Resultado: " + (numA * numB)); break;
        case '/': System.out.println(numB != 0 ? "Resultado: " + (numA / numB) : "Erro: divisão por zero"); break;
        case '^': System.out.println("Resultado: " + Math.pow(numA, numB)); break;
        default: System.out.println("Operador inválido.");
    }
    
    System.out.println("Digite dois números inteiros para sorteio:");
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    int min = Math.min(n1, n2);
    int max = Math.max(n1, n2);
    Random rand = new Random();
    int sorteado = rand.nextInt(max - min + 1) + min;
    System.out.println("Número sorteado: " + sorteado + " (" + (sorteado % 2 == 0 ? "par" : "ímpar") + ")");

    scanner.close();
}

}

