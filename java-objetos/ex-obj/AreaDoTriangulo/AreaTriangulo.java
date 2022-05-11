import java.util.Scanner;

public class AreaTriangulo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n*** Informe as medidas dos lados dos triângulos X e Y ***\n");
        
        Triangulo x, y;
        x = new Triangulo(); // instanciar = iniciar = criar
        y = new Triangulo();

        System.out.println("Triangulo X:");
        System.out.printf("a = ");
        x.a = scanner.nextDouble(); // cursor fica parado esperando a entrada pelo usuário
        System.out.printf("b = ");
        x.b = scanner.nextDouble();
        System.out.printf("c = ");
        x.c = scanner.nextDouble();

        System.out.println("\n --- --- --- --- --- \n");

        System.out.println("Triangulo Y:");
        System.out.printf("a = ");
        y.a = scanner.nextDouble();
        System.out.printf("b = ");
        y.b = scanner.nextDouble();
        System.out.printf("c = ");
        y.c = scanner.nextDouble();

        double areaX = x.area();
        double areaY = y.area();


        System.out.printf("\n Área do triangulo X: %.4f\n", areaX);
        System.out.printf("Área do triangulo Y: %.4f\n", areaY);

        String maior = (areaX > areaY) ? "X":"Y";
        System.out.println("A maior área é do triangulo " + maior + "\n");
    }
} 
