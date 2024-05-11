class Birds{
    public void Sound(){
        System.out.println("Ko Ko Ko");
    }

}
 class Hen extends Birds{
    public void Sound(){
        System.out.println("Kornro");

    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Birds obj = new Birds();
        obj.Sound();

        obj=new Hen();
        obj.Sound();
    }
    
}
