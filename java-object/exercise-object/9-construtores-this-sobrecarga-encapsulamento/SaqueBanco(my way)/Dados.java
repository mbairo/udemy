public class Dados {
    private int numConta;
    private String nome;
    private double saldoEmConta;

    public Dados (int numConta, String nome, double saldoEmConta) {
        this.numConta = numConta;
        this.nome = nome;
        this.saldoEmConta = saldoEmConta;
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldoEmConta() {
        return saldoEmConta;
    }
    public void setSaldoEmConta(double saldoEmConta) {
        this.saldoEmConta = saldoEmConta;
    }

    public void deposito(double deposito){
        saldoEmConta += deposito;
    }
    public void saque(double saque){
        saldoEmConta -= saque + 5;
    }

    public String toString (){
        return "\n*** Dados Atualizados ***\nConta: " + numConta + "\nNome: "+ nome +"\nSaldo em Conta: " +  String.format("%.2f",saldoEmConta) + "\n";
    }
}