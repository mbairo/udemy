// https://www.youtube.com/watch?v=CV5mehlxNtM

import java.util.ArrayList;
//import java.util.function.Consumer;
public class Lambda{
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<Integer>();
        ArrayList<Integer> dobro = new ArrayList<Integer>();
        ArrayList<Integer> par = new ArrayList<Integer>();
        ArrayList<Integer> impar = new ArrayList<Integer>();
               
        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);

        //Consumer<Integer> dobrar = (elemento)->{dobro.add(elemento * 2);}; // Cria o esquema e joga para dentro de dobrar o qual será repetido dentro do forEach
        //valores.forEach(dobrar);
        // Percorrer os elementos/valores de qualquer lista. No exemplo será da lista "valores"
        // forEach percorre por padrão todos os indices da lista pegando o elemento/valor em cada loop
        
        valores.forEach((elemento)->{dobro.add(elemento*2);
            if (elemento % 2 == 0){
                par.add(elemento);                
            } else {
                impar.add(elemento);
            }
        });

        System.out.println("Valores: " + valores);
        System.out.println("Dobro: " + dobro);
        System.out.println("Par: " + par);
        System.out.println("Impar: " + impar);
    }
}