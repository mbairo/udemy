// Acrescentado validação para ver se quarto está disponível
import java.util.Scanner; 

public class ProgramaPrincipal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DadosCadastrais [] arrayQuartos = new DadosCadastrais [10];

        System.out.println("--- Aluguel de Quartos ---");
        System.out.print("Quantos quartos serão alugados? ");
        int quantidade = scanner.nextInt();

        for (int cont = 1; cont <= quantidade; cont++){
            System.out.print("\nHospede #" + cont );
            System.out.print("\nNome: ");
            // utilizado nextLine para que possa ser possivel utilizar espaços nos nomes Ex: Marcos Bairo
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("\nE-mail: ");
            String email = scanner.next();
            System.out.print("\nQuarto: ");
            int numQuarto = scanner.nextInt();
            // Verifica se quarto está disponível
            if (arrayQuartos[numQuarto] == null) {
                arrayQuartos[numQuarto] = new DadosCadastrais(nome, email, numQuarto);
            } else {
                System.out.println("Quarto ocupado! Este cadastro foi invalidado!");
                cont--;
            }            
        }
        
        System.out.println("\n--- Quartos ocupados ---");
        for (int i = 0; i < arrayQuartos.length; i++) {
            if (arrayQuartos[i] != null){
                System.out.print( arrayQuartos[i]);
            }
        }
    }
}
