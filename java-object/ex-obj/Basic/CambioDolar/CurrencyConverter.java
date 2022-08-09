public class CurrencyConverter{
    public static double cost(double dollarPrice, double purchase){
        return dollarPrice * purchase * 1.06;  // 1.06 = 6% de IOF/Imposto
    }
}
