import java.util.Scanner;

public class pushVariable {
    public static void main(String[] args) {
        int size;
        int number[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của mảng:");
        size = scanner.nextInt();
        number = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (1 + i) + ": ");
            number[i] = scanner.nextInt();
        }
        System.out.println("Your Array:");
        for (int element: number) {
            System.out.print(element + "\t");
        }
        System.out.println("");
    }
}
