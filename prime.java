import java.util.Scanner;

/**
 * prime
 */
public class prime {

    public static void main(String[] args) {
        System.out.println("Enter The Number");
        Scanner obj = new Scanner(System.in);
        int num= obj.nextInt();

        boolean isprime = true;

        if(num <=2){
            isprime=false;
        }
        else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num % i == 0){
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime){
            System.out.println("Prime Number");

        }else{
            System.out.println("Not prime Number");
        }
    }
}