// feito pelo professor
import java.util.Scanner;

public class MaiorNum{
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int higher = max(a, b, c);
        
        showResult(higher);

        sc.close();
    }

    public static int max(int x, int y, int z){ // retorna o valor no aux
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z){
            aux = y;
        }else {
            aux = z;
        }
        System.out.println("O maior número digitado foi o: " +aux);
        return aux;



    }
    public static void showResult(int value){ // Recebe o valor, no caso o higher mas não retorna nada "void", apenas imprime na tela a msg com o value/higher.
        System.out.println("Higher = " + value);
    }
}




