import java.util.Scanner;

public class SomaNumWhile{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n ***Informe números aleatoriamente e para ver a soma dos respectivos números digite 0 *** \n\n");
        int numInformado = 1;
        int i = 1;
        int soma = 0;

        while(numInformado != 0){
            System.out.printf(i + "° número informado: ");
            numInformado = scanner.nextInt();

            soma += numInformado; // soma = soma + numInformado;
            i++;
        }

        System.out.printf("\n\n Soma: " + soma + "\n\n");

    }
} 
