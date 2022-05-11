 public class Funcao{
     public String nome;
     public double salarioGrosso;
     public double imposto;

     public double salarioComDescontoImposto(){
        return salarioGrosso - imposto;
     }

    public String toString(){
        return nome + ", $ " + String.format("%.2f", salarioComDescontoImposto());
     }

     public void aumentoPorcentagemSalario(double porcentagem){
        salarioGrosso += salarioGrosso * porcentagem / 100;  
     }
 }
