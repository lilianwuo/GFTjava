package estruturacontrole;

import java.util.Scanner;

public class Tabuada {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        Tabuada tabuada = new Tabuada();
        tabuada.calcularTabuada();
    }

    public void calcularTabuada() {
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
