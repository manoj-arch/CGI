import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter marks for Subject 1:");
        int sub1 = scanner.nextInt();
        
        System.out.println("Enter marks for Subject 2:");
        int sub2 = scanner.nextInt();
        
        System.out.println("Enter marks for Subject 3:");
        int sub3 = scanner.nextInt();
        
        // Calculate total marks
        int totalMarks = sub1 + sub2 + sub3;
        
        // Calculate percentage
        double percentage = (totalMarks / 300.0) * 100;
        
        // Check if student passes or fails
        if (percentage >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
            System.out.println("Congratulations! You passed.");
        } else {
            System.out.println("Sorry, you failed.");
        }
        
        scanner.close();
    }
}
