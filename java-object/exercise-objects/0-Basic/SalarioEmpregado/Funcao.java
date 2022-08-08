public class Funcao{
   public String nome;
   public float salarioBruto;
   public float imposto;


   public float dadosAtualizado(){
      return salarioBruto - imposto;
   }

   public void aumentoSalarial(float porcentagem){
      salarioBruto += salarioBruto * porcentagem /100;
   }


   public String toString(){
      return "\n************************************************\nDados atualizados: \nNome: " + nome +  "\nSalário: R$ " + String.format("%.2f", dadosAtualizado()) + "\n************************************************\n";
   } 
 }
