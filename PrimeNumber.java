import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The Number");
        int Number = obj.nextInt();
        boolean isprime = true;

        if(Number < 2){
        isprime = false;
        }
        for(int i=2; i<Number / 2;i++){
            if(Number % i == 0){
                isprime=false;
            }
        }
        if(isprime){
            System.out.println("prime number");
        }
        else
        {
            System.out.println("Not prime");
        }
    }
    
}
