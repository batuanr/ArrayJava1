import java.util.Scanner;

public class totalColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arrayNumber;
        int column;
        int row;
        System.out.print("Enter column: ");
        column = scanner.nextInt();
        System.out.print("Enter row: ");
        row = scanner.nextInt();
        arrayNumber = new int[row][column];
        for (int i = 0; i < row; i++) {
            System.out.println("Row " + i + ": ");
            for (int j = 0; j < column; j++) {
                System.out.print("Enter element " + (1 + j) + ": ");
                arrayNumber[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter column ");
        int x = scanner.nextInt();
        System.out.printf("Total column %d : %d", x, getTotal(arrayNumber, x));
    }
    public static int getTotal (int[][] arr, int x) {
        int total = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            total += arr[i][x];
        }
        return total;
    }
}
