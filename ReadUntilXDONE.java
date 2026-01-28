//Q2. Write a program to read user input until user writes XDONE 
// and then show the entered text by the user on command line


import java.util.Scanner;

class ReadUntilXDONE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        while (true) {
            String line = sc.nextLine();

            if (line.contains("XDONE")) {
                result.append(line.substring(0, line.indexOf("XDONE")));
                break;
            }

            result.append(line).append("\n");
        }

        sc.close();

        System.out.println("Entered text:");
        System.out.print(result.toString());
    }
}
