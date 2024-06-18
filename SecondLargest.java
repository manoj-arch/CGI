public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 6}; // Example array
        int largest = findLargest(numbers);
        System.out.println("The largest element is: " + largest);
    }

    public static int findLargest(int[] array) {
        int max = array[0]; // Assume first element is the largest initially
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if current element is larger
            }
        }
        return max;
    }
}
