import java.util.Scanner;
public class Search {
    static Scanner sc = new Scanner(System.in);
    static int[] arr = {1,2,3,4,5,6,7,8,9,};
    static int target = 11;
    public static void main(String[] args) {
        do {
            System.out.println("\nwelcome to search algoritma");
            System.out.println("1 : use linear search algoritma");
            System.out.println("2 : use binary search algoritma");
            System.out.println("3 : EXIT");
            System.out.print("menu : ");
            int pick = sc.nextInt();
            switch (pick) {
                case 1:
                    linearSearch();
                    break;
                case 2:
                    binarySearch();
                    break;
                case 3:
                    return;
            
                default:
                    System.out.println("plis input the right menu ");
                    break;
            }

        } while (true);
    }

    static void linearSearch() {
        System.out.println("\nLINEAR SEARCH");
        System.out.println("target is : " + target);
        boolean find = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("target in index : " + i);
                find = true;
            }
        }
        if (!find) {
            System.out.println("target not found");
        }
    }

    static void binarySearch() {
        System.out.println("\nBINARY SEARCH");
        boolean find = false;
        int left = 0;
        int right = arr.length-1;
        System.out.println("target is : " + target);
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == arr[mid]) {
                System.out.println("target in index : " + mid);
                find = true;
            }
            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (!find) {
            System.out.println("target not found");
        }
    }
    
}
