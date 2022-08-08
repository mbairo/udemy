import java.util.Scanner;

public class AreaTriangulo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n*** Informe as medidas dos lados dos triângulos X e Y ***\n");

        System.out.println("Triangulo X:");
        System.out.printf("a = ");
        double xa = scanner.nextDouble();
        System.out.printf("b = ");
        double xb = scanner.nextDouble();
        System.out.printf("c = ");
        double xc = scanner.nextDouble();

        System.out.println("\n --- --- --- --- --- \n");

        System.out.println("Triangulo Y:");
        System.out.printf("a = ");
        double ya = scanner.nextDouble();
        System.out.printf("b = ");
        double yb = scanner.nextDouble();
        System.out.printf("c = ");
        double yc = scanner.nextDouble();

        // Calculo de P
        double xp = (xa+xb+xc) /2;
        // Area do x
        double areaX = Math.sqrt(xp*(xp-xa)*(xp-xb)*(xp-xc));

        // Calculo de P
        double yp = (ya+yb+yc) /2;
        // Area do x
        double areaY = Math.sqrt(yp*(yp-ya)*(yp-yb)*(yp-yc));

        System.out.printf("\n Área do triangulo X: %.4f\n", areaX);
        System.out.printf("Área do triangulo Y: %.4f\n", areaY);

        String maior = (areaX > areaY) ? "X":"Y";
        System.out.println("A maior área é do triangulo " + maior + "\n");
    }
} 
