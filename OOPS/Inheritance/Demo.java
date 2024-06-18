package OOPS.Inheritance;


class Demo {
 
    public static void main(String[] args) {
       Single var1 = new Single();
       int var2 = var1.add(2, 3);
       int var3 = var1.sub(4, 4);
       int var4 = var1.mul(2, 4);
       double var5 = var1.power(3,5);
       System.out.println("The Outputs Are :" + var2 + " : " + var3 + " : "+ var4);
       System.out.println(" "+ var5);
    }
 }
 