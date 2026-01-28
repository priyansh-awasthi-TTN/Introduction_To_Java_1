//Q3. Write a java program to show following menu to the user: 
// *******Menu******* 
// 1. Calculate Area of Circle 
// 2. Calculate Circumference of a Circle 
// 3. Exit. 
// Choose an option (1-3): Take radius as user input. 
// Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static

import java.util.Scanner;

class CircleMenu {

    static double calculateArea(double r) {
        return Math.PI * r * r;
    }

    static double calculateCircumference(double r) {
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("******* Menu *******");
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Circumference of a Circle");
        System.out.println("3. Exit");
        System.out.print("Choose an option (1-3): ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r1 = sc.nextDouble();
                System.out.println("Area of Circle: " + calculateArea(r1));
                break;

            case 2:
                System.out.print("Enter radius: ");
                double r2 = sc.nextDouble();
                System.out.println("Circumference of Circle: " + calculateCircumference(r2));
                break;

            case 3:
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
