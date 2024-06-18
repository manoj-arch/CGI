import java.util.Scanner;
public class OddAdd {
    public static void main(String[] args) {

        System.out.println("Enter the number of Elements");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();



        System.out.println("Enter The Numbers:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= obj.nextInt();
        }

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2 != 0){
                sum = sum + arr[i];
            }

        }
        System.out.println("Sum:" + sum);
        obj.close();
    }
    
    
}
