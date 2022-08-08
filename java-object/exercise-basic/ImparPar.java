import java.util.Scanner;

public class ImparPar{
    public static void main(String[] args) {
       Scanner dadosDigitados = new Scanner(System.in);
        
        int num;

        System.out.println("Informe um número para ver se ele é PAR ou IMPAR e para sair do programa digite 00");
        
        do {
            System.out.println("Informe um número: ");
            num = dadosDigitados.nextInt();

            if(num % 2 == 0){
                System.out.println("Número digitado é par!");
            }else{
                System.out.println("Número digitado é impar!");
            }
        } while (num != 00);

    }
}