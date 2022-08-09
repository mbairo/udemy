import java.util.Scanner;

public class SitchCaseDiaDaSemana{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Informe o número do dia da semana: ");
        int numInformado = scanner.nextInt();
        String dia;
        
        switch(numInformado){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;                                
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "ATENÇÃO: Valor informado invalido!";
                break;
        }
        System.out.print("\n Dia da semana: " + dia + "\n");
    }
}