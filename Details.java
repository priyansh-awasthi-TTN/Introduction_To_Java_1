//Q1. Write a class with FirstName, LastName & age field. Print Firstname, LastName & age
// using static block, static method & static variable respectively.

public class Details {

    static String firstName;
    static String lastName;
    static int age;

    static {
        firstName = "Priyansh";
        System.out.println("First Name: " + firstName);
    }

    static void printLastName() {
        lastName = "Awasthi";
        System.out.println("Last Name: " + lastName);
    }

    public static void main(String[] args) {
        printLastName();
        age = 21;
        System.out.println("Age: " + age);
    }
}
