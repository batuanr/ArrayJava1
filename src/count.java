import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        String a = "hkghhsdkhjksfhhlhjksddsgtbn468ui3asoghkme";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character");
        char x = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (x == a.charAt(i)){
                count++;
            }
        }
        System.out.printf("ky tu %s xuat hien %d lan", x, count);
    }
}
