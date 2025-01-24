import java.util.Arrays;

public class Sort {
    static int[] arr = {9,8,7,6,5,4,3,2,1};
    public static void main(String[] args) {
        bubble();
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
}
