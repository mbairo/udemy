import java.security.PublicKey;
import java.util.function.IntFunction;

import javax.print.DocFlavor.STRING;

public class FuncaoBoletim{
   public String nome;
   public double mediaBimestre1;
   public double mediaBimestre2;
   public double mediaBimestre3;

   public double calculoFinal(){
     return (mediaBimestre1 + mediaBimestre2 + mediaBimestre3) /3;
   }

   public String resultadoFinal(){
      if(calculoFinal () >= 6) {
        return "******************\nMédia Final: " + String.format("%.2f", calculoFinal()) + "\nSituação atual: Aprovado! \n******************\n\n";
      } else {
         double pontosParaPassar = 6 - calculoFinal();
        return "******************\nMédia Final: " + String.format("%.2f", calculoFinal()) + "\nSituação atual: Insuficiente \nPara ser aprovado faltam: " + String.format("%.2f", pontosParaPassar) + " pontos\n******************\n\n";
      }
   }
}


