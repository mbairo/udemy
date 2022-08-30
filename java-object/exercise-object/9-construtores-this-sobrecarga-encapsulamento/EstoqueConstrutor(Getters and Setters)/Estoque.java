import java.util.Scanner; 

public class Estoque{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // *Instanciado apenas para exemplo*
        // Produtos p = new Produtos();
        
        System.out.println("\nInforme os dados do produto: ");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        // instanciado produtos com a classe Produtos
        Produtos produtos = new Produtos(nome, preco);

        // *** Alterando os dados do produto via Setters e Getters ***
        produtos.setNome("Computador");
        System.out.println("\n*****\nNome atualizado: " + produtos.getNome());
        produtos.setPreco(33);
        System.out.println("Preço atualizado: " + produtos.getPreco());
        System.out.println("Quantidade atualizada: " + produtos.getQuantidade() + "\n*****");         

        // Sempre que há um Obj no Println e printf o Método toString é chamado
        System.out.println("\nDados do produto: " + produtos);

        System.out.print("\nInforme o número de produtos que será adicionado no estoque: ");
        int quantidade = scanner.nextInt();
        produtos.addProdutos(quantidade); // passa a quantidade para a função addProdutos somar com o atual
        System.out.print("\nDados atualizados: " + produtos + "\n");
        
        System.out.print("\nInforme o número de produtos que será removido do estoque: ");
        quantidade = scanner.nextInt();
        produtos.removeProdutos(quantidade); // passa a quantidade para a função addProdutos somar com o atual
        
        System.out.print("\nDados atualizados: " + produtos + "\n\n");
    }
}