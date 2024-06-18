package OOPS.Overriding;

public class Car {

    public void show(){

        System.out.println("Car is  Moving");

    }

    
}

class Jeep extends Car {

    public void show(){
        System.out.println("Jeep is Moving");
    }
}

class Demo{
    public static void main(String[] args) {
         
        Jeep obj = new Jeep();
        obj.show();
        Car obj1 = new Car();
        obj1.show();
    }
}
