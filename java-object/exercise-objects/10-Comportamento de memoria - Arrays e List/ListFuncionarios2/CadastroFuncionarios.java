import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroFuncionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInforme a quantidade de funcionários para cadastro: ");
        Integer quantidade = scanner.nextInt();
        List <DadosFuncionarios> listaDeFuncionarios = new ArrayList<>();

        for (int cont = 1; cont <= quantidade; cont ++) {
            System.out.print("Informe o ID: ");
            Integer id = scanner.nextInt();

            while(procuraId (listaDeFuncionarios, id)){
                System.out.print("Erro! Id já cadastrado!\nInforme outro ID: ");
                id = scanner.nextInt();
            }
            System.out.print("Informe o nome: ");
            String nome = scanner.next();
            System.out.print("Informe o salário: ");
            Double salario = scanner.nextDouble();

            DadosFuncionarios funcionario = new DadosFuncionarios(id, nome, salario);
            listaDeFuncionarios.add(funcionario);
        }

        System.out.print("Informe o ID que recebera o aumento: ");
        Integer id = scanner.nextInt();

        DadosFuncionarios idParaAumento = listaDeFuncionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (idParaAumento == null){
            System.out.println("ID não localizado!");
        } else {
            System.out.print("Informe a porcentagem do aumento: ");
            Double percent = scanner.nextDouble();
            idParaAumento.aumentoSalarial(percent);
        }

        System.out.println("\n--- Lista de Funcionários ---\n");
        // for especial >> para cada item da lista de funcionarios imprima o item, no caso o funcionario
        int cont = 1;
        for (DadosFuncionarios item : listaDeFuncionarios){
            System.out.println("Empregado #" + cont + "\n"+item);
            cont ++;
        }
    }
    public static boolean procuraId (List<DadosFuncionarios> listaProcuraId, Integer id){
        DadosFuncionarios temId = listaProcuraId.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return temId != null;
    }
}