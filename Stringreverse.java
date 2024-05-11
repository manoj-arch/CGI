public class Stringreverse {
    public static void main(String[] args) {
        String Name="manoj";


         System.out.println("Before sort");
        for(int i=0;i<Name.length();i++){
            System.out.print(Name.charAt(i));
           
        }
        
        System.out.println("After sort");
        for(int i = Name.length()-1;i>=0;i--){
            System.out.print(Name.charAt(i));

        }
        
    }
    
}
