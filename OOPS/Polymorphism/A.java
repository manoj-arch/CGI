package OOPS.Polymorphism;

public class A {

    public void show(){
        System.out.println("A in show");
    }
    
}

class B extends A{
    public void show(){
        System.out.println("B in show");
    }
}


 class Demo {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        obj=new B();
        obj.show();
        
    }

    
}