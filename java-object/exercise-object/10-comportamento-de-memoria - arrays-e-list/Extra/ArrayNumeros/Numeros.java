import java.util.Scanner;

public class Numeros{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nInforme quantos números serão armazenados: ");
        Integer qdtNumeros = scanner.nextInt();
        double [] vetor = new double[qdtNumeros];

        for (int cont = 0; cont < qdtNumeros; cont++) {
            System.out.print("Digite um número: ");
            vetor[cont] = scanner.nextDouble(); 
        }
        System.out.println("--------------------");
        System.out.println("\n--- Negativos ---");
        for (int cont = 0; cont < qdtNumeros; cont++) {            
            if (vetor[cont] < 0) {
                System.out.printf("%.0f%n", vetor[cont]);
            }            
        }

        System.out.println("\n--- Pares ---");
        for (int cont = 0; cont < qdtNumeros; cont++) {            
            if (vetor[cont] % 2 == 0) {
                System.out.printf("%.0f%n", vetor[cont]);
            }            
        }
        
        System.out.println("\n--- Impares ---");
        for (int cont = 0; cont < qdtNumeros; cont++) {            
            if (vetor[cont] % 2 != 0) {
                System.out.printf("%.0f%n", vetor[cont]);
            }            
        }

        double soma = 0;
        int cont;
        for (cont = 0; cont < qdtNumeros; cont++) {            
            soma += vetor[cont];
        }

        System.out.print("\nSoma: " + soma);
        System.out.print("\nMédia: " + soma/cont + "\n\n");
    }
}
