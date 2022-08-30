public class Dados {
    private int numConta;
    private String nome;
    private double saldoEmConta;    

    public Dados (int numConta, String nome, double movimentacao){
        this.numConta = numConta;
        this.nome = nome;
        deposito(movimentacao);
    }

    // Getters and Setters
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
    public void setSaldoEmConta(double alteraSaldo){
        this.saldoEmConta = alteraSaldo;
    }
    // retorna o valor contido no "private nome" desta página
    public double getSaldoEmConta(){
        return saldoEmConta;
    }

    public void deposito(double movimentacao) {
        saldoEmConta += movimentacao;
    }

    public void saque(double movimentacao) {
        saldoEmConta -= movimentacao  + 5;
    }

    public String toString(){
        return "\n*** Dados Atualizados ***\nConta: " + numConta + "\nNome: "+ nome +"\nSaldo em Conta: " +  String.format("%.2f",saldoEmConta) + "\n";
    }
}