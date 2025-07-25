package estruturacontrole;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso (kg): ");
        double peso = scanner.nextDouble(); // Peso em kg
        
        System.out.println("Digite sua altura (m): ");
        double altura = scanner.nextDouble(); // Altura em metros

        double imc = calcularIMC(peso, altura);
        
        
        System.out.printf("Seu IMC é: %.2f%n", imc);
        
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Classificação: Peso ideal");
        } else if (imc < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 34.9) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc < 39.9) {
            System.out.println("Classificação: Obesidade grau II (Severa)");
        } else {
            System.out.println("Classificação: Obesidade III (Mórbida)");
        }

        double pesoIdealMax = 24.0 * (altura * altura); // Peso ideal baseado no IMC de 24
        double pesoIdealMin = 18.5 * (altura * altura); // Peso ideal mínimo baseado no IMC de 18.5
        System.out.printf("Peso ideal aproximado entre %.2f kg e %.2f kg%n", pesoIdealMin, pesoIdealMax);

        scanner.close();
    }

    private static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
        
    }
}
