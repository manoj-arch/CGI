class Human {
    private int age; // Private member variable to encapsulate age

    // Getter method to access the age
    public int getAge() {
        return age;
    }

    // Setter method to set the age
    public void setAge(int n) {
        age = n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        int age = 12;

        Human obj = new Human();
        obj.setAge(age); // Set the age using setter method
        System.out.println("The age of the Human is " + obj.getAge());
    }
}
