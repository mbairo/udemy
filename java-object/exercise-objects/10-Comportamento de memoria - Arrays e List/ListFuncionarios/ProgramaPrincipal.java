import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class ProgramaPrincipal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro de Funcionários ---\n");
        System.out.print("Informe a quantidade de funcionários para cadastro: ");
        Integer quantidade = scanner.nextInt();

        List <DadosFuncionarios> listaDeFuncionarios = new ArrayList<>();

        for (int cont = 1; cont <= quantidade; cont ++) {
            System.out.println("\n"+ cont + "° Funcionário");            
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            
            while (procucaId(listaDeFuncionarios, id)) {
                System.out.print("ID já existe.\nFavor informar outro: ");
                id = scanner.nextInt();
            }

            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Salário: ");
            Double salario = scanner.nextDouble();
            DadosFuncionarios funcionario = new DadosFuncionarios(id, nome, salario);
            listaDeFuncionarios.add(funcionario);
            // System.out.print("\nItem: " + listaDeFuncionarios);
        }

        System.out.print("Informe o Id do funcionário que recebera o aumento: ");
        Integer id = scanner.nextInt();

        DadosFuncionarios idParaAumento = listaDeFuncionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        // (Cod 1) Modo tradicional
        // Integer positionNaLista = procuraNaLista(listaDeFuncionarios, id);
        // if(positionNaLista == null){
        //     System.out.println("Id não localizado");
        // } else {
        //     System.out.print("Informe a porcentagem do aumento: ");
        //     Double percent = scanner.nextDouble();
        //     listaDeFuncionarios.get(positionNaLista).aumentoSalarial(percent);
        // }

        if(idParaAumento == null){
            System.out.println("Id não localizado");
        } else {
            System.out.print("Informe a porcentagem do aumento: ");
            Double percent = scanner.nextDouble();
            idParaAumento.aumentoSalarial(percent);
        }

        System.out.println("\n--- Lista de Funcionários ---\n");
        // for especial >> para cada item da lista de funcionarios imprima o item, no caso o funcionario
        for (DadosFuncionarios item : listaDeFuncionarios){
            System.out.println(item);
        }
    }

    // Verifica se ID está disponível
    public static boolean procucaId(List<DadosFuncionarios> novaLista, int id){
            DadosFuncionarios localizado = novaLista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            // enquanto verdadeiro (localizado for diferente de null)
		    return localizado != null;
    }
    // (Cod 1) Modo tradicional
    // public static Integer procuraNaLista(List<DadosFuncionarios> novaLista, int id){
    //     for (int indice = 0; indice < novaLista.size(); indice ++) {
            //elemento na posição "indice".pega o id dessa posição e se for igual ao id procurado...
    //         if (novaLista.get(indice).getId() == id) {
    //             return indice;
    //         }
    //     }
    //     return null;
    // }
}
