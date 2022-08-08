public class Calcular{
    double largura;
    double altura;

    public double area(){
        double area = largura * altura;
        return area;
    }

    public double perimetro(){
        double perimetro = 2*(largura + altura);
        return perimetro;
    }

    public double diagonal(){
        double diagonal =  Math.sqrt(largura*largura + altura * altura);
        return diagonal;
    }
}
