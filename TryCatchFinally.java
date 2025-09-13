
public class TryCatchFinally {
    public static void main(String[] args) {
        // try {
        //     int data = 25/0;
        //     System.out.println(data);
            
        // } catch (ArithmeticException e) {
        //     System.out.println("Not disionable by zero");
        //     System.out.println(e);
        // }
        // finally{
        //     System.out.println("Finally block execute");
        // }

        int a = 10;
        int b = 0;

        try {
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        } finally{
            System.out.println("Program Contunues...");
        }
    }
}
