public class concat {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5};
        int array2[] = {6, 7, 8, 9, 10};
        System.out.print("Array 1: ");
        for (int element: array1) {
            System.out.print(element + "\t");
        }
        System.out.print("\nArray 2: ");
        for (int e: array2) {
            System.out.print(e + "\t");
        }
        System.out.println("\nNew array = array 1 + array 2");
        newConcat(array1, array2);
    }
    public static void newConcat (int arr1[], int arr2[]) {
        int newArray[] = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArray[arr1.length + i] = arr2[i];
        }
        for (int e: newArray) {
            System.out.print(e + "\t");
        }
    }
}
