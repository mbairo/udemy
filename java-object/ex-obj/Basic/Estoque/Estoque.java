import java.util.Scanner;

public class Estoque{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produtos produtos = new Produtos();

        System.out.println("\nInforme os dados do produto: ");

        System.out.print("Nome: ");
        produtos.nome = scanner.nextLine();

        System.out.print("Preço: ");
        produtos.preco = scanner.nextDouble();

        System.out.print("Quantidade em estoque: ");
        produtos.quantidade = scanner.nextInt();


        System.out.println("\nDados do produto: " + produtos);


        System.out.print("\nInforme o número de produtos que será adicionado no estoque: ");
        int quantidade = scanner.nextInt();
        produtos.addProdutos(quantidade); // passa a quantidade para a função addProdutos somar com o atual
        System.out.print("\nDados atualizados: " + produtos + "\n");
        
        System.out.print("\nInforme o número de produtos que será removido do estoque: ");
        quantidade = scanner.nextInt();
        produtos.removeProdutos(quantidade); // passa a quantidade para a função addProdutos somar com o atual


        System.out.print("\nDados atualizados: " + produtos + "\n");



    }
}