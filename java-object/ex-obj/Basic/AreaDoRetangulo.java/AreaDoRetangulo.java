import java.util.Scanner;
 
public class AreaDoRetangulo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calcular dadosInformados = new Calcular();
       
        System.out.println("\n*** Informe os dados solicitados para realizar os calculos do Retângulo*** \n");
        
        System.out.print("Informe a largura: ");
        dadosInformados.largura = scanner.nextDouble();

        System.out.print("Informe a altura: ");
        dadosInformados.altura = scanner.nextDouble();

        double areaCalculada = dadosInformados.area();
        System.out.println("Área do retângulo: "+ areaCalculada);

        double perimetroCalculado = dadosInformados.perimetro();
        System.out.println("Perimetro do retângulo: "+ perimetroCalculado);

        double diagonalCalculada = dadosInformados.diagonal();
        System.out.println("Diagonal do retângulo: "+ diagonalCalculada + "\n");

        scanner.close();
    }
}