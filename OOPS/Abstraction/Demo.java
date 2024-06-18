package OOPS.Abstraction;

 abstract class Car{

    public abstract void drive();
    

    public void Music(){
        System.out.println("Playing Music...");
    }


}

class BMW extends Car{

    
    public void drive() {
        
        System.out.println("Driving.....");
    }

    
}


public class Demo {

    public static void main(String[] args) {
        

        Car obj = new BMW();
         obj.Music();
         obj.drive();

            
         
    }
    
}
