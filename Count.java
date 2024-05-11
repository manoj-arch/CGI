public class Count {
    public static void main(String[] args) {
        String Name = " manoj";
        int count = 0;

        for (int i = 0; i < Name.length(); i++) {
            if (Name.charAt(i)!= ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
