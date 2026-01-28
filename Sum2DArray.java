// Q4. Create a two dimensional array of integers and display: 
// 1. sum of all elements of each column 
// 2. sum of all elements of each row

class Sum2DArray {

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        // Sum of each row
        System.out.println("Sum of each row:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        // Sum of each column
        System.out.println("\nSum of each column:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += arr[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }
    }
}

