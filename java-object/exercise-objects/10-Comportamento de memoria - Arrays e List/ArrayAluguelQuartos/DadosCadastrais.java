public class DadosCadastrais {
    private String nome;
    private String email; 
    private int numQuarto;

    public DadosCadastrais(String nome, String email, int numQuarto){
        this.nome = nome;
        this.email = email;
        this.numQuarto = numQuarto;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String novoEmail){
        this.email = novoEmail;
    }

    public int getNumQuarto(){
        return numQuarto;
    }
    public void setNumQuarto(int novoNumQuarto){
        this.numQuarto = novoNumQuarto;
    }

    public String toString(){
        return numQuarto + ": " + nome + ", " + email + "\n";
    }
}
