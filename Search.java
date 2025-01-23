public class Search {
    static int[] arr = {1,2,3,4,5,6,7,8,9,};
    static int target = 5;
    public static void main(String[] args) {
        linearSearch();
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
}
