import java.util.ArrayList;
import java.util.Random;

public class Lambda2 {
    public static void main(String[] args) {
        ArrayList<Integer>numeros = new ArrayList<Integer>();
        ArrayList<Integer>impar = new ArrayList<Integer>();
        ArrayList<Double>doublle = new ArrayList<Double>();

        Random geradorNumeros = new Random();

        for (int cont = 1; cont <=10; cont ++){
            numeros.add(geradorNumeros.nextInt(10)+1);
            doublle.add(geradorNumeros.nextDouble(10)+1);
        }

        numeros.forEach((value)->{
            if (value % 2 != 0) {
                impar.add (value);
            }
        });

        System.out.println("Todos os Números: " + numeros);
        System.out.println("Números impares: " + impar);
        System.out.println("Números Double: " + doublle);
    }
}
