//Q7. WAP showing try, multi-catch and finally blocks.

class MultiCatch {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;          // ArithmeticException
            int[] arr = new int[2];
            arr[5] = 100;            // ArrayIndexOutOfBoundsException
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception handled using multi-catch block");
        }

        System.out.println("Program continues...");
    }
}
