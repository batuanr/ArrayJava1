import java.util.Scanner;

public class deleteIndex {
    public static void main(String[] args) {
      int num[] = {2, 5, 4, 33, 25, 88, 50, 74, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số muốn xóa");
        int x = scanner.nextInt();
        if (checkNumber(num, x)) {
            newArray(num, x);
        }
        else {
            System.out.printf("Không có số %d trong mảng", x);
        }
    }
    public static boolean checkNumber (int a[], int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return true;
        }
        return false;
    }
    public static void newArray (int a[], int x) {
        int newArray[];
        newArray = new int[a.length -1];
        for (int i = 0,j =0; j < a.length; i++, j++) {
            if (a[j] == x) {
               ++j;
            }
           newArray[i] = a[j];
        }
        for (int element:newArray) {
            System.out.print(element + "\t");
        }
    }
}
