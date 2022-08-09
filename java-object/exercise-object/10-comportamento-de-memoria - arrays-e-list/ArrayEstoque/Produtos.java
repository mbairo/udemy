// *Não foi utilizado os Setters no exemplo - Criado apenas para futuras alterações
public class Produtos {
    private String nome;
    private double preco;

    public Produtos(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
}


