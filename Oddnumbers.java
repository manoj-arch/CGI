public class Oddnumbers {
    
    public static void main(String[] args) {
        int num = 100;
        int add = 0;

        for(int i = 0; i < num; i++){
            if(i % 2 == 0){
                System.out.println("The Even Numbers is:" + i);
                add += i;
            }       
    }
    System.out.print("The sum of Add numbers is: " + add);
        }
}
