package OOPS;

public class Computer {

    public void playMusic(){
        System.out.println("playing Music");
    }

    public String getMepen(int cost){
        if (cost>=10){
        return "pen";
        }
    else{
        return "nothing";

    }
    
}
}
 class InnerComputer {
    public static void main(String[] args) {
         int rate = 1;

        Computer obj = new Computer();

        obj.playMusic();
        String str = obj.getMepen(rate);
        System.out.println(str);
    }

    
}