import java.util.Scanner;

public class CelsiusToFahrenheitDoWhile{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("\n\n***Graus Celsius para Fahrenheit***\n\n");
        
        char continuar;
        do{ 
            System.out.printf("\nInforme a temperatura em graus Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = 9 * celsius / 5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f\n", fahrenheit);
            System.out.printf("Deseja repetir (s/n)? ");
            continuar = scanner.next().charAt(0);

        }while(continuar == 's');
    }
} 
