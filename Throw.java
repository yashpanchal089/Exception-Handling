
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

// public class Throw {
//     public static void main(String[] args) {
//         int a = 20;
//         int b = 21;

//         try {
//             b = a/b;
//             if(b==0)
//             throw new ArithmeticException("\n I don't want to print 0");

//         } catch (ArithmeticException e) {
//             b = 120/1;
//             System.out.println("That's the default output" + e);
//         } catch (Exception e){
//             System.out.println("something went wrong");
//         }
//         System.out.println(b);
//         System.out.println("bye");
//     }
    
// }

// // Example 1: Throwing an Unchecked Exception

// public class Throw{
//     public static void validate(int age){
//         if(age<18){
//             throw new ArithmeticException("Person is not eligible to vote");
//         } else {
//             System.out.println("person is eligible to vote");
//         }
//     }
//     public static void main(String[] args) {
//         validate(14);
//         System.out.println("Happy Voting");
//     }
// }

// // Example 2: Throwing a Checked Exception
// public class Throw{
//     public static void method() throws FileNotFoundException {
//         FileReader file = new FileReader("C:\\Users\\Yash\\Desktop\\abc.txt");
//         BufferedReader fileInput = new BufferedReader(file);

//         throw new FileNotFoundException();
//     }    
//     public static void main(String[] args) {
//         try {
//             method();
//         } catch (FileNotFoundException e) {
//             e.printStackTrace();
//         }
//         System.out.println("Bye");
//     }
// }

//Example 3: Throwing User-Defined Exception