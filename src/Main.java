public class Main {
    public static void main(String[] args) {
        QuickSort sorter = new QuickSort();

        int N1 = 5;
        int[] arr1 = {4, 1, 3, 9, 7};
        sorter.quickSort(arr1, 0, N1 - 1);
        printArray(arr1);

        int N2 = 9;
        int[] arr2 = {2, 1, 6, 10, 4, 1, 3, 9, 7};
        sorter.quickSort(arr2, 0, N2 - 1);
        printArray(arr2);
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
