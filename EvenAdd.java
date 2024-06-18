import java.util.Scanner;

public class EvenAdd {
    public static void main(String[] args) {

        System.out.println("Enter the Number of Elements:");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the Numbers:");
        for(int i= 0; i<n; i++){
            arr[i]=obj.nextInt();
        }


        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        
        System.out.println("Sum of Even Numbers: " + sum);
         obj.close();
    }
}
