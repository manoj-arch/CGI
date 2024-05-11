abstract class Animal{
    public abstract void Sound();
    public abstract void Eat();
}

class Lion extends Animal{

    public void Sound(){
        System.out.println("Roaring....");
    }
    public void Eat(){
        System.out.println("Dinner....");
    }

}

public class abstraction{
    public static void main(String[] args) {
        Animal obj = new Lion();
        obj.Sound();
        obj.Eat();
    }
}