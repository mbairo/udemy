public class Dados {
    private int numConta;
    private String nome;
    private float saldoEmConta;    
    Dados(){
    }
    public Dados (int numConta, String nome, Float saldoEmConta){
        this.numConta = numConta;
        this.nome = nome;
        this.saldoEmConta = saldoEmConta;
    }

    // retorna o valor contido no "private numConta" desta página
    public int getNumConta(){
        return numConta;
    }

    // atualiza o valor contido na variável "private nome" desta página
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    // retorna o valor contido no "private nome" desta página
    public String getNome(){
        return nome;
    }
    
    // atualiza o valor contido na variável "private nome" desta página
    public void setSaldoEmConta(float alteraSaldo){
        this.saldoEmConta = alteraSaldo;
    }
    // retorna o valor contido no "private nome" desta página
    public float getSaldoEmConta(){
        return saldoEmConta;
    }



    public String toString(){
        return "\nNome: "+ nome +"\nSaldo em Conta: " + saldoEmConta;
    }



}




