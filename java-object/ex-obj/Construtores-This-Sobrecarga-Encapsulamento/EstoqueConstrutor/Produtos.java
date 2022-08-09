public class Produtos{
     public String nome;
     public double preco;
     public int quantidade;

     public Produtos(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
     }

     public double valorTotalNoEstoque(){
         return preco * quantidade;
     }

     public void addProdutos(int quantidade){
        this.quantidade += quantidade;
     }

     public void removeProdutos(int quantidade){
        this.quantidade -= quantidade;
     }
     
     // Envia 
     public String toString(){ 
         return nome + ", $ " + String.format("%.2f", preco) + ", "+ quantidade+ " unidades, Total: $ " + String.format("%.2f", valorTotalNoEstoque());
     }
 }
