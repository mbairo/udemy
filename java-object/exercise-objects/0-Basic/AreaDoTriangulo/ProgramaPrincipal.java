// Versão comentada - rePraticando¹

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FuncaoArea x = new FuncaoArea(); // Dizendo que x é do tipo FuncaoArea (Função criada com esse nome no outro arquivo) e instanciando = iniciar = criar
        FuncaoArea y = new FuncaoArea(); // Dizendo que y é do tipo FuncaoArea (Função criada com esse nome no outro arquivo) e instanciando = iniciar = criar

        // Outra maneira de se INSTANCIAR
        // FuncaoArea x, y;
        // x = new FuncaoArea();
        // y = new FuncaoArea();
        
        // Dessa forma o x e o y vão funcionar como "layers/camadas" diferentes - "Camada x.a/b/c" e "Camada y.a/b/c"
        System.out.println("\n*** Informe as medidas dos lados dos triângulos X e Y ***\n");
    
        System.out.println("Triangulo X:");
        System.out.printf("a = ");
        x.a = scanner.nextDouble(); // Momento em que o cursor fica parado esperando a entrada pelo usuário
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

        double areaX = x.area(); // Como se etivesse abrindo a layer/Pagina  "Triangulo x" somente com os valores armazenados de x.a x.b x.c
        double areaY = y.area(); // Como se etivesse abrindo a layer/Pagina  "Triangulo y" somente com os valores armazenados de y.a y.b y.c

        System.out.printf("\nÁrea do triangulo X: %.4f\n", areaX);
        System.out.printf("Área do triangulo Y: %.4f\n", areaY);
                
        String maior = (areaX > areaY) ? "X":"Y"; // Ternario é o If/Else porém resumido e mais prático "SE areaX for maior que areaY ENTÃO 'maior' recebe X senão 'maior' recebe Y"
        System.out.println("A maior área é do triangulo " + maior + "\n");
    }
}
