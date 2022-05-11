// feito pelo professor
import java.util.Scanner;

public class MaiorNum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n\nInforme números aleatorios e para ver o maior digitado aperte 0: \n");

        funcaoMaior();
    }

    public static void funcaoMaior(){
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int numInformado;
        do {
            numInformado = scanner.nextInt();
        
            if(maior < numInformado){
                maior = numInformado;
            }

        }while(numInformado != 0);

        System.out.println("\n\nO maior número digitado foi o: " + maior + "\n\n");
    }

}




