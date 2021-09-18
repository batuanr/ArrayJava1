import java.util.Scanner;

public class crossTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[][] arrayNumber;
        System.out.println("Enter size Array");
        size = scanner.nextInt();
        arrayNumber = new int[size][size];
        for (int i = 0; i < size; i++) {
            System.out.println("Row " + i);
            for (int j = 0; j < size; j++) {
                System.out.print("Enter element " + (1 + j) + ": ");
                arrayNumber[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Total duong cheo la: " + getTotal(arrayNumber));
    }
    public static int getTotal (int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i][i];
        }
        return total;
    }
}
