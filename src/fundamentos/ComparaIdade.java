package fundamentos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//comparar idades de várias pessoas
public class ComparaIdade {
    public static void main(String[] args) throws Exception {
        // define formato de data brasileiro
        try (Scanner scanner = new Scanner(System.in)) {
            // define formato de data brasileiro
            DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.println("Quantas pessoas deseja cadastrar? ");
            int numeroDePessoas = Integer.parseInt(scanner.nextLine());

            // armazena idades e nomes em arrays
            int[] idades = new int[numeroDePessoas];
            String[] nomes = new String[numeroDePessoas];

            // loop para receber dados de cada pessoa
            for (int i = 0; i < numeroDePessoas; i++) {
                System.out.println("Pessoa " + (i + 1) + ":"); // define qual pessoa está sendo cadastrada

                System.out.print("Digite seu nome: ");
                nomes[i] = scanner.nextLine();

                System.out.print("Digite sua data de nascimento: ");
                String dataNascimento = scanner.nextLine();

                LocalDate dataDeNascimento = LocalDate.parse(dataNascimento, formatoBrasileiro);
                LocalDate hoje = LocalDate.now();

                // calcula idade
                int idade = hoje.getYear() - dataDeNascimento.getYear();
                if (hoje.isBefore(dataDeNascimento.withYear(hoje.getYear()))) {
                    idade--;
                }
                // armazena idade no array
                idades[i] = idade;
                System.out.println(nomes[i] + " possui " + idades[i] + " anos.");
            }

            // Exibe todas as diferenças possíveis entre as pessoas
            if (numeroDePessoas > 1) {
                System.out.println("\n💡 Diferenças de idade entre as pessoas:");
                for (int i = 0; i < numeroDePessoas - 1; i++) {
                    for (int j = i + 1; j < numeroDePessoas; j++) {
                        int diferencaIdade = Math.abs(idades[i] - idades[j]);
                        System.out.println("- " + nomes[i] + " e " + nomes[j] + ": " + diferencaIdade + " anos");
                    }
                }
            }

            System.out.println("\nCadastro finalizado com sucesso! ✅");
        }
    }
}
