import java.util.Scanner;

public class PositionNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de linhas da Matriz: ");
        Integer qdtLinhas = scanner.nextInt();
        System.out.print("Informe a quantidade de Colunas da Matriz: ");
        Integer qdtColunas = scanner.nextInt();

        Integer [][]matriz = new Integer[qdtLinhas][qdtColunas];
        for (Integer linha = 0; linha < qdtLinhas; linha++ ){
            for (Integer coluna = 0; coluna < qdtColunas; coluna++ ){
                System.out.println("Informe um número aleatorio: ");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        // Apenas para desenhar a Matriz / MAP
        System.out.println("MATRIZ");
        for (Integer linha = 0; linha < qdtLinhas; linha++ ){
            for (Integer coluna = 0; coluna < qdtColunas; coluna++ ){
                System.out.print(" "+ matriz[linha][coluna] + (" "));
                if (coluna == qdtColunas - 1){
                    System.out.print("\n");
                }
            }
        }        

        System.out.print("\nInforme um número que foi digitado anteriormente para saber seus vizinhos dentro da Matriz: ");
        Integer numero = scanner.nextInt();

        int x = 1;
        for (Integer linha = 0; linha < qdtLinhas; linha++ ){
            for (Integer coluna = 0; coluna < qdtColunas; coluna++ ){
                if (matriz[linha][coluna] == numero){                    
                    System.out.print("\n\nO "+ x +"º número " +numero+ " está na posição " + linha +","+ coluna + " da Matriz e seus respectivos vizinhos são:" );

                    if (coluna > 0) {
                        System.out.print("\nEsquerda: " + matriz[linha][coluna - 1]);
                    }
                    if (coluna < qdtColunas - 1) {
                        System.out.print("\nDireita: " + matriz[linha][coluna + 1]);    
                    }
                    if (linha < qdtLinhas -1) {
                        System.out.print("\nBaixo: " + matriz[linha + 1][coluna]);   
                    }                    
                    if (linha > 0) {
                        System.out.print("\nCima: " + matriz[linha - 1][coluna]);    
                    }
                    x++;
                }
            }
        }
        System.out.println("\n");
    }
}