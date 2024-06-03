public class palindrome {
    public static void main(String[] args) {
        String Name = "radara";
        String Reverse="";

        for (int i=0;i<Name.length();i++){

            Reverse = Name.charAt(i)+Reverse;

        }
        System.out.println(Reverse);

        if(Name.equals(Reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    
}
