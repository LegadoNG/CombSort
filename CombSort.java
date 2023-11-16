import java.util.Scanner;

public class CombSort {
    void combSort(int arr[]) {
        int n = arr.length;
        int gap = n;
        double shrink = 1.3;
        boolean swapped = true;

        while (gap > 1 || swapped) {
            gap = (int) (gap / shrink);
            if (gap < 1) {
                gap = 1;
            }

            swapped = false;

            for (int i = 0; i < n - gap; i++) {
                if (arr[i] > arr[i + gap]) {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    swapped = true;
                }
            }
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = scanner.nextInt();

        int arr[] = new int[size];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        CombSort combSort = new CombSort();

        System.out.println("Arreglo original:");
        combSort.printArray(arr);

        combSort.combSort(arr);

        System.out.println("Arreglo ordenado:");
        combSort.printArray(arr);

        scanner.close();
    }
}
