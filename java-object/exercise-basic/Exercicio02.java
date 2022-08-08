import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in); // instanciar e inicializar a varivael "dados" * Letramaiuscula é classe

        String nome;

        System.out.println("Informe seu nome: ");
        nome = dados.next();

        int idade;
        System.out.println("Informe sua idade: ");
        idade = dados.nextInt();

        System.out.println("Nome: "+ nome);
        System.out.println("Idade: " + idade);

        dados.close();
    }
}