import java.util.Scanner;

public class ProgramaPrincipal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Cadastro de Conta Bancaria ---");
        System.out.print("Número da conta: ");
        int numConta = scanner.nextInt();
        System.out.print("Nome do títular: ");
        String nome = scanner.next(); 
        System.out.print("Deposito inicial (s/n)? ");
        char resposta = scanner.next().charAt(0);

        double movimentacao;
        if (resposta == 's'){
            System.out.print("Informe o valor do primeiro depósito: ");
            movimentacao = scanner.nextDouble();
        } else {
            movimentacao = 0;
        }
        
        Dados atualizaDados = new Dados(numConta, nome, movimentacao);
        System.out.println(atualizaDados);
        System.out.println("\n*** Informe o número da opção desejada ***");
        System.out.println("0 - Sair\n1 - Deposito \n2 - Saque");
        System.out.print("\nOpção: ");
        int option = scanner.nextInt();

        while (option != 0){
            switch (option){
                case 1:
                System.out.print("Valor que deseja depositar: ");
                movimentacao = scanner.nextDouble();
                atualizaDados.deposito(movimentacao);
                System.out.println(atualizaDados);
                break;
                case 2:
                System.out.print("Valor que deseja sacar: ");
                movimentacao = scanner.nextDouble();
                atualizaDados.saque(movimentacao);
                System.out.println(atualizaDados);
                break;
            }
            System.out.println("\n*** Informe o número da opção desejada ***");
            System.out.print("0 - Sair\n1 - Deposito \n2 - Saque");
            System.out.print("\nOpção: ");
            option = scanner.nextInt();
        }
    }
}