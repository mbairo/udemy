import java.util.Scanner;

public class Boletim{
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         FuncaoBoletim dados = new FuncaoBoletim();
         FuncaoBoletim primeiroBimestre = new FuncaoBoletim();
         FuncaoBoletim segundoBimestre = new FuncaoBoletim();
         FuncaoBoletim terceiroBimestre = new FuncaoBoletim();

         System.out.println("\n*** Informe os dados do aluno para verificar sua situação ***\n");

         System.out.print("Nome: ");
         dados.nome = scanner.next();
    
    //
         System.out.println("*Primeiro Bimestre*");

         System.out.print("Primeira nota: ");
         primeiroBimestre.nota1 = scanner.nextDouble();

         System.out.print("Segunda nota: ");
         primeiroBimestre.nota2 = scanner.nextDouble();

         System.out.print("Terceira nota: ");
         primeiroBimestre.nota3 = scanner.nextDouble();
         
         double mediaBimestre1 = 0;
         primeiroBimestre.calculoBimestre(mediaBimestre1);
         

         System.out.println(mediaBimestre1);
    //
         System.out.println("*Segundo Bimestre*");

         System.out.print("Primeira nota: ");
         segundoBimestre.nota1 = scanner.nextDouble();

         System.out.print("Segunda nota: ");
         segundoBimestre.nota2 = scanner.nextDouble();

         System.out.print("Terceira nota: ");
         segundoBimestre.nota3 = scanner.nextDouble();

    //
         System.out.println("*Terceiro Bimestre*");

         System.out.print("Primeira nota: ");
         terceiroBimestre.nota1 = scanner.nextDouble();

         System.out.print("Segunda nota: ");
         terceiroBimestre.nota2 = scanner.nextDouble();

         System.out.print("Terceira nota: ");
         terceiroBimestre.nota3 = scanner.nextDouble();


     }
 }
