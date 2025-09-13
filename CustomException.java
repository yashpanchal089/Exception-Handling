class YashException extends Exception
{
    public YashException(String string)
    {
            super(string);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int a = 20;
        int b = 21;

        try {
            b = a/b;
            if(b==0)
            throw new YashException("\n I don't want to print 0");

        } catch (YashException e) {
            b = 120/1;
            System.out.println("That's the default output" + e);
        } catch (Exception e){
            System.out.println("something went wrong");
        }
        System.out.println(b);
        System.out.println("bye");
    }
}
