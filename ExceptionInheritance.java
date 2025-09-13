
class Parent{
    void show(){
        System.out.println("Parent Method");
    }
}
class Child extends Parent{
    // @Override
    void show() throws ArithmeticException{
        System.out.println("Child Method with ArithmeticException ");
    }
}


public class ExceptionInheritance {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}
