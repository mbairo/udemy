import java.util.Scanner;

public class ProgramaPricipal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Conta Bancaria ---");
        System.out.print("Número da conta: ");
        int numConta = scanner.nextInt();
        System.out.print("Nome do títular: ");
        String nome = scanner.next(); 
        System.out.print("Deposito inicial (s/n)? ");
        char depositoInicial = scanner.next().charAt(0);

        double saldoEmConta = 0;
        double deposito =0;
        double saque = 0;

        Dados dados = new Dados(numConta, nome, saldoEmConta);

        if (depositoInicial == 's'){
            System.out.print("Informe o valor do primeiro depósito: ");
            deposito = scanner.nextDouble();   
            dados.deposito(deposito);                     
        }     
        
        System.out.println(dados);

        System.out.println("\n*** Informe o número da opção desejada ***");
        System.out.println("0 - Sair\n1 - Deposito \n2 - Saque");
        System.out.print("\nOpção: ");
        int option = scanner.nextInt();

        while (option != 0){
            switch (option){
                case 1:
                System.out.print("Valor que deseja depositar: ");
                deposito = scanner.nextDouble();
                dados.deposito(deposito);
                System.out.println(dados);
                break;
                case 2:
                System.out.print("Valor que deseja sacar: ");
                saque = scanner.nextDouble();
                dados.saque(saque);
                System.out.println(dados);
                break;
            }
            System.out.println("\n*** Informe o número da opção desejada ***");
            System.out.print("0 - Sair\n1 - Deposito \n2 - Saque");
            System.out.print("\nOpção: ");
            option = scanner.nextInt();
        }
    }
}