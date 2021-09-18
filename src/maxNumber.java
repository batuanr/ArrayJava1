public class maxNumber {
    public static void main(String[] args) {
         int arrayNumber[][] = {
                 {5, 7, 9, 22, 56},
                 {3, 66, 28, 6, 8},
                 {1, 4, 62, 33, 44},
                 {52, 18, 27, 38, 2}
         };
         int max = arrayNumber[0][0];
        for (int i = 0; i < arrayNumber.length; i++) {
            for (int j = 0; j < arrayNumber[i].length; j++) {
                if (max < arrayNumber[i][j]) {
                    max = arrayNumber[i][j];
                }
            }
        }
        System.out.println("Max: " + max);
    }
}
