import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    static int[] arr = {9,8,7,6,5,4,3,2,1};
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        do { 
        System.out.println("\nCurent arrays is : " + Arrays.toString(arr));
        System.out.println("SELECT SORT ALGORITHM");
        System.out.println("1 : Bubble sort");
        System.out.println("2 : Insertion sort");
        System.out.println("3 : Selection sort ");
        System.out.println("4 : EXIT");
        System.out.print("PICK : ");
        int pick = sc.nextInt();

            switch (pick) {
                case 1:
                    bubble();
                    break;
                    case 2:
                    insertion();
                    break;
                    case 3:
                    selection();
                        break;
                    case 4:
                        return;
                default:
                    System.out.println("please pick the right menu ");
                        break;
                }
        } while (true);
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
        System.out.println(Arrays.toString(arr));
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
        System.out.println(Arrays.toString(arr));
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
        System.out.println(Arrays.toString(arr));
    }
}
