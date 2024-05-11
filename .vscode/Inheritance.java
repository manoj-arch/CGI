
class Calculator{
    
    public int add(int n1,int n2){
        return n1+n2;
    }
     public int sub(int n1,int n2){
        return n1-n2;
    }
    
    
    
    
}
public class Inheritance {
    public static void main(String args[]){
        int num1=50;
        int num2=30;
        
       AdvanceCal obj=new AdvanceCal();
       
       int r1= obj.add(num1,num2);
       int r2= obj.sub(num1,num2);
       int r3= obj.multi(num1,num2);
       int r4= obj.div(num1,num2);
       System.out.println(r1+" " +r2+" "+r3+" "+r4);
    }
    
}
