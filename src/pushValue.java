import java.util.Scanner;

public class pushValue {
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
//        input value
        int value;
        int index;
        System.out.println("\nEnter Value");
        value = scanner.nextInt();
        System.out.println("Enter index");
        index = scanner.nextInt();
        System.out.println("New Array sau khi push value:");
        pushValue(number, value, index);
    }
    public static void pushValue (int arr[], int value, int index) {
        int newArray[] = new int[arr.length+1];
        for (int i = 0, j = 0; i < newArray.length; i++, j++) {
            if (i == index) {
                newArray[i] = value;
                j--;
                continue;
            }
            newArray[i] = arr[j];
        }
        for (int element: newArray) {
            System.out.print(element + "\t");
        }
    }
}
