
public class ContractBased
{
    public static double divide(double a, double b){
        if(b == 0.0){
            throw new IllegalArgumentException("Denominator should not be zero");
        }
        double result = a/b;
        return result;
    }

        public static void main(String[] args) {
            // MathOps d1 = new MathOps();
            // d1.divide(10.00, 5.00);
            System.out.println(divide(10.00, 2.00));
        }
    
}

