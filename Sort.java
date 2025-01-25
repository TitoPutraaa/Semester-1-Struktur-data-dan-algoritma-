import java.util.Arrays;

public class Sort {
    static int[] arr = {9,8,7,6,5,4,3,2,1};
    public static void main(String[] args) {
        // bubble();
        // insertion();
        selection();
        System.out.println(Arrays.toString(arr));
    }

    static void bubble() {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
    }

    static void insertion() {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;

            while (j >=0 && arr[j] > key) {
                arr[j+1] = arr[j]; 
                j--;
            }
            arr[j+1] = key;
        }
    }

    static void selection() {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tem = arr[i];
            arr[i] = arr[min];
            arr[min] = tem;
        }
    }
}
