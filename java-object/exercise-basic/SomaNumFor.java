import java.util.Scanner;

public class SomaNumFor{
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\n Informe a quantidade de números que deseja somar: ");
        int qdtNumeros = scanner.nextInt();
        int soma = 0;

        for(int contador = 1 ; contador <= qdtNumeros ; contador++){
            System.out.printf("Informe o "+contador+"° número para somar: ");
            int numInformado = scanner.nextInt();
            soma += numInformado;
        }
        System.out.printf("\nSoma: " + soma + "\n\n");  
    }
}



