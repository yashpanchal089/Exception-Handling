class A 
{
    public void show() throws ClassNotFoundException
    {
        
            Class.forName("Demo");

    }
}

class Test
{
    void readFile() throws java.io.IOException 
    {
        throw new java.io.IOException("File Not Found");
    }
}

public class ThrowsException {
    // static{
    //     System.out.println("Class loaded");
    // }
    public static void main(String[] args) {

        Test t = new Test();
        try {
            t.readFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // A obj = new A();
        // try {
        //     obj.show();
        // } catch (ClassNotFoundException e) {

        //     e.printStackTrace();
        // }
    }
    
}


