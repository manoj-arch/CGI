package OOPS.Encapsulation;

public class Human {

    private int age;
    private String Name;


    public int getage(){
        return age;
    }

    public void  setage(int a)
    {
        age = a;
    }

    public String getName(){
        return Name;
    }

    public void  setName(String n)
    {
        Name = n;
    }

    
}

class innerHuman
{
    public static void main(String[] args) {
        
        Human obj = new Human();
        obj.setage(20);
        obj.setName("MANOJ");
        System.out.println(obj.getage() + ":" + obj.getName());
    }
}
