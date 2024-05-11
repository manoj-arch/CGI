public class MatchNumber {
    
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 2, 5,5,1};

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) { // Use == for comparison, not =
                    System.out.println(num[i]);
                    break; // Exit the inner loop once a match is found
                }
            }
        }
    }
}
