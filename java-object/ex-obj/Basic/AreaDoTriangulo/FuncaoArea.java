public class FuncaoArea{
    double a;
    double b;
    double c;

    public double area (){
       double perimetro = (a+b+c)/2;
        return Math.sqrt(perimetro *(perimetro - a) * (perimetro-b) * (perimetro - c));
    }
}