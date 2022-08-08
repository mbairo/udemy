import java.util.Scanner;

public class ArrayEstoque{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de produtos: ");
        int quantidade = scanner.nextInt();

        Produtos [] arrayProdutos = new Produtos[quantidade];

        double media = 0;
        for (int cont = 0; cont < arrayProdutos.length; cont ++){
            System.out.print("\nNome do produto: ");
            String nome = scanner.next();
            System.out.print("Informe o preço: ");
            double preco = scanner.nextDouble();

            arrayProdutos[cont] = new Produtos(nome, preco);
            media += arrayProdutos[cont].getPreco() / arrayProdutos.length;
        }
        System.out.println("\nMédia do preço dos produtos: " + media);       
    }
}