public class DadosFuncionarios {
    private Integer id;
    private String nome;
    private Double salario;

    public DadosFuncionarios(){
    }
    public DadosFuncionarios(Integer id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId (){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getNome (){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }

    public Double getSalario (){
        return salario;
    }
    public void setSalario (Double salario){
        this.salario = salario;
    }

    public void aumentoSalarial(Double percent){
        salario += salario * percent / 100;
    }

    @Override
    public String toString(){
        return "\nId: " + id + "\nNome: " + nome + "\nSalário: " + salario + "\n----------";
    }    
}
