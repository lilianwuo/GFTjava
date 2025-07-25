package fundamentos;

import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a altura do retângulo em metros: ");
            double altura = scanner.nextDouble();
            System.out.print("Digite o comprimento do retângulo emm metros: ");
            double comprimento = scanner.nextDouble();

            double area = calcularArea(altura, comprimento);
            System.out.println("A área do quadrado é: " + area + "m²");
        }
    }

    public static double calcularArea(double altura, double comprimento) {
        return altura * comprimento;
    }

}
