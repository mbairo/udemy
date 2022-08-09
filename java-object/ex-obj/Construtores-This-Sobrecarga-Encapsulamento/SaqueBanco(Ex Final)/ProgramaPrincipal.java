import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

public class ProgramaPrincipal{
    public static void main(String[] args) {
        Dados dados = new Dados();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de Conta Bancaria");
        System.out.print("Número da conta: ");
        int numConta = scanner.nextInt();
       
        System.out.print("Nome do títular: ");
        String nome = scanner.next(); 
        dados.setNome(nome);
        System.out.print("Deposito inicial? (s/n)");
        String optionDeposito = scanner.next();

        float saldoEmConta;
        if (optionDeposito == "s"){
            System.out.print("Informe o valor do primeiro depósito: ");
            saldoEmConta = scanner.nextFloat();
            dados.setSaldoEmConta(saldoEmConta);
        } else {
            saldoEmConta = 0;
        }

        System.out.println("*** Informe o número da opção desejada ***");
        System.out.println("0 - Sair\n1 - Deposito \n2 - Saque");
        System.out.print("\nOpção: ");
        int option = scanner.nextInt();

        while (option != 0){
            switch (option){
                case 1:
                System.out.print("Valor que deseja depositar: ");
                saldoEmConta += scanner.nextFloat();
                dados.setSaldoEmConta(saldoEmConta);
                System.out.println("Número da conta: " + numConta + dados);
                break;

                case 2:
                System.out.print("Valor que deseja sacar: ");
                saldoEmConta = (saldoEmConta - 5) - scanner.nextFloat();
                dados.setSaldoEmConta(saldoEmConta);
                System.out.println("Número da conta: " + numConta + dados);
                break;
            }
            System.out.println("*** Informe o número da opção desejada ***");
            System.out.print("0 - Sair\n1 - Deposito \n2 - Saque");
            System.out.print("\nOpção: ");
            option = scanner.nextInt();

        }
    }
}