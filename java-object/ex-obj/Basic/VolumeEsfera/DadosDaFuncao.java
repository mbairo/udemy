import java.lang.invoke.ConstantBootstraps;
  
public class DadosDaFuncao {
    public double raio;
    public final double PI = 3.14;
    public double circunferencia;
    public double volume;

    public void calculos(){
        circunferencia = 2 * PI * raio;
        volume = 4 * PI * Math.pow(raio, 3) / 3;
    }

    // Será retornada sempre que o Obj "dados" for chamado ("dados" foi instanciada com "DadosDaFuncao")
    public String toString(){
        return "Circunferência: " + circunferencia + "\nVolume: " + volume + "\nPi: " + PI +  "\n***********\n\n";
    }
}
