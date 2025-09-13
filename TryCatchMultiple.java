public class TryCatchMultiple {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int num[] = {1, 2, 3, 4, 5}; 

        try {
            int z = a/b;
            int index = 6;
            System.out.println(z);
            System.out.println("Value at index " + index + " :" + num[index]);
        } catch (ArithmeticException e) {
            System.out.println("Not Divisonable by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter from only 0 to 5");
        }
    }
}
