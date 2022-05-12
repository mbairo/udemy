 public class FuncaoBoletim{
     public String nome;
     public double nota1;
     public double nota2;
     public double nota3;
     
     public double mediaBimestre1;

     public void calculoBimestre(double mediaBimestre1){
        mediaBimestre1 = (nota1 +nota2 + nota3) / 3;
     }
 }
