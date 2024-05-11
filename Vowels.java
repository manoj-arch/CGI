public class Count {
    public static void main(String[] args) {
        String Name = "manoj";
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < Name.length(); i++) {
            char ch = Character.toLowerCase(Name.charAt(i));
            for (char vowel : vowels) {
                if (ch == vowel) {
                    count++;
                    break; // Break out of the inner loop once a vowel is found
                }
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
