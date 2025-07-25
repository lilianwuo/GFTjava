import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


// recebe nome e data de nascimento e calcula a idade
public class DefineIdade {
    public static void main(String[] args) throws Exception {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
        
            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();
            
            System.out.println("Digite sua data de nascimento: ");
            String dataNascimento = scanner.nextLine();
            
            // formata data em dia, mes e ano
            DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataDeNascimento = LocalDate.parse(dataNascimento, formatoBrasileiro);
            
            LocalDate dataDeHoje = LocalDate.now();
            
            int idade = dataDeHoje.getYear() - dataDeNascimento.getYear();
            if (dataDeHoje.isBefore(dataDeNascimento.withYear(dataDeHoje.getYear()))) { 
                idade--;
            } // Ajusta a idade se ainda não tiver feito aniversário neste ano

            System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
        }

    }
}
