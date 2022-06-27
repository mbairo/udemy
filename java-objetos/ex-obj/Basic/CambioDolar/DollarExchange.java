import java.util.Scanner;

public class DollarExchange{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n*** Currency Exchange ***\n");        
        
        System.out.printf("What is the Dollar value in Reais? ");
        double dollarPrice = scanner.nextDouble();
        
        System.out.printf("How many dollars will be bought? ");
        double purchase = scanner.nextDouble();

        System.out.printf("Amount to be paid in Reais: " + CurrencyConverter.cost(dollarPrice, purchase) +"\n\n");
    
    }
}