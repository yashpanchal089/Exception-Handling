

public class TryCatch{
    public static void main(String[] args) {
        // // 1) A scenario where ArithmeticException occurs
        // int i = 10;
        // int j = 0;

        // try {
        //     int z = i/j;
        //     System.out.println(z);
            
        // } catch (Exception e) {
        //     System.out.println("division by zero not alowed");
        // }

        // System.out.println("Bye");

        // // 2) A scenario where NullPointerException occurs
        // String str = null;

        // try {
        //     int length = str.length();
        //     System.out.println(length);
        // } catch (NullPointerException e) {
        //     System.out.println("String can't be null");
        // }

        // System.out.println("It should not be null");

        // // 3) A scenario where NumberFormatException occurs
        
        // String str = "abc";

        // try {
        //     int num = Integer.parseInt(str);
        //     System.out.println(num);
        // } catch (NumberFormatException e) {
        //     System.out.println("unable to pass string as an interger");
        // }

        // 4) A scenario where ArrayIndexOutOfBoundsException occurs
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try {
            int index = 11;
            System.out.println("Value at index " + index + " : " + num[index]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter index from 0 to 9 only");
        }
        System.out.println("bye");

    }
}