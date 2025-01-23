public class Search {
    static int[] arr = {1,2,3,4,5,6,7,8,9,};
    static int target = 11;
    public static void main(String[] args) {
        // linearSearch();
        binarySearch();
    }

    static void linearSearch() {
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
