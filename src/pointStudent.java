import java.util.Scanner;

public class pointStudent {
    public static void main(String[] args) {
        int size;
        int[] point;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("How many students ?");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Not exceed 30 students");
            }
        }while (size > 30);
        point = new int[size];
        for (int i = 0; i < point.length; i++) {
            System.out.print("Enter a mark for student " + (1 + i) + ": ");
            point[i] = scanner.nextInt();
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int e: point) {
            System.out.print(e + "\t");
            if (e >= 5 && e <= 10) {
                count++;
            }
        }
        System.out.println("\nThe number of students passing the exam is " + count);
    }
}
