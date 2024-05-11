public class Revese {
    public static void main(String[] args) {
        String Name = "MANOJ";
        String Reverse= " ";

        for(int i = 0; i<Name.length();i++){
            Reverse= Name.charAt(i)+Reverse;
        }
        System.out.println(Reverse);
    }
    
}
