public class TryCatchNested {
    public static void main(String[] args) {
        try {
            try {
                int a = 10;
                int b = 5;
                int z = a/b;
                System.out.println(z);
            } catch (ArithmeticException e) {
                System.out.println("not diviible by zero");
            }
            try {
                int num[] = {1, 2, 3, 4, 5};
                int index = 2;
                System.out.println("value at index " + index + " : " + num[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("enter from 0 to 4 only");
            }
        } catch (Exception e) {
            System.out.println("handled the exception (outer catch)");
        }
        System.out.println("Normal");
    }
}
