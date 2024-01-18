package Exams;
import java.util.Arrays;

public class bubble_sort {

    public static void main(String[] args) {

        int arr[] = {100, 27, 32, 2, 12, 14};
        Bubble_sort(arr);

        System.out.println("The array after performing the bubble sort algorithm is: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void Bubble_sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("Array after iteration " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }
}
