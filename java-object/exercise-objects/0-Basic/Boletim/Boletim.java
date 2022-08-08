import java.util.Scanner;

public class Boletim{
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         FuncaoBoletim dados = new FuncaoBoletim();

         System.out.println("\n*** Informe os dados do aluno para verificar sua situação ***\n");

         System.out.print("Nome: ");
         dados.nome = scanner.next();

         System.out.printf("\nMédia do primeiro bimestre: ");
         dados.mediaBimestre1 = scanner.nextDouble();

         System.out.printf("Média do segundo bimestre: ");
         dados.mediaBimestre2 = scanner.nextDouble();

         System.out.printf("Média do terceiro bimestre: ");
         dados.mediaBimestre3 = scanner.nextDouble();

         dados.calculoFinal();
         System.out.println("\n" + dados.resultadoFinal());



    //
     }
 }
