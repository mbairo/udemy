public class Produtos{ 
     String nome;
     private double preco;
     private int quantidade; 
 
     // Construtor padrão criado para exemplo onde foi instanciado na "aba" Estoque.java Obj "p"
     public Produtos(){
     }

     public Produtos(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
     }

     // Sobre carga = Mesma versão da mesma operação porém com outros parâmetros
     public Produtos(String nome, double preco){
      this.nome = nome;
      this.preco = preco;
     }

     // Setters and Getters utilizados para acessar/alterar variaveis do tipo private
     public void setNome (String novoNome){
      this.nome = novoNome;
     }   
     public String getNome(){
         return nome;
     }

     public void setPreco (double novoPreco){
         this.preco = novoPreco;
     }
     public double getPreco(){
         return preco;
     }

     public int getQuantidade (){
         return quantidade;
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

     // Converter Obj para String
     // O método toString sempre é chamado de forma automática quando um objeto é passado para println, printf, para o operador de concatenação de Strings ou para assert, ou exibido por um depurador.
     public String toString(){ 
         return nome + ", $ " + String.format("%.2f", preco) + ", "+ quantidade+ " unidades, Total: $ " + String.format("%.2f", valorTotalNoEstoque());
     }
 }
