package OOPS;

public class Person {
    
    public String Name(String v){
        return "The name is: " + v;
    }
}

 class Message {
        
    public static void main(String[] args){
        String value = "MANOJ";
        Person person = new Person();
        String r = person.Name(value);
        System.out.println(r);
    }
}
