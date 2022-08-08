import java.util.Scanner;

public class MatrizNumeros{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de linhas e colunas da Matriz: ");
        int qdt = scanner.nextInt();
        int [][] matriz = new int [qdt][qdt];
        int numerosNegativos = 0;
        for (int coluna = 0; coluna < matriz.length; coluna++) {
            for (int linha = 0; linha < matriz.length; linha++) {
                System.out.print("\nInforme um número: ");
                matriz[linha][coluna] = scanner.nextInt();
                if (matriz[linha][coluna] <0){
                    numerosNegativos += 1;
                }
            }
        }
        System.out.print("Diagonal Priciapal da Matriz");
        for (int cont = 0; cont < matriz.length; cont++) {            
            System.out.print( "\n" + matriz[cont][cont]);
        }
        System.out.print("\nQuantidade de números negativos: " + numerosNegativos + "\n\n");
        }

}            