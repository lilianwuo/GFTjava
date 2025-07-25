package fundamentos;

import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o lado do quadrado em metros: ");
            double lado = scanner.nextDouble();
            double area = calcularArea(lado);
            System.out.printf("A área do quadrado é: %.2f m²", area);
        }
    }

    public static double calcularArea(double lado) {
        return lado * lado;
    }

}
