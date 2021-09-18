import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        int size;
        int number[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array");
        size = scanner.nextInt();
        number = new int[size];
        System.out.println("Enter element");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (1 + i) + ": ");
            number[i] = scanner.nextInt();
        }
        System.out.print("Array: ");
        for (int e: number) {
            System.out.print(e + "\t");
        }
        System.out.println("\nMin: " + findMin(number));
    }
    public static int findMin (int arr[]) {
        int min = arr[0];
        for (int e: arr) {
            if (min > e) {
                min = e;
            }
        }
        return min;
    }
}
