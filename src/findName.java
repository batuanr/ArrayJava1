import java.util.Scanner;

public class findName {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah"};
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student:");
        String inputName = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.printf("Học sinh %s nằm ở vị trí %d trong danh sách", inputName, i);
                check = true;
                break;
            }
        }
        if (!check){
            System.out.printf("Học sinh %s không có trong danh sách", inputName);
        }
    }
}
