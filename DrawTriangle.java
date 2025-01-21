import java.util.Scanner;

public class DrawTriangle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("\nTRIANGLE DRAW | PICK THE MENU BELOW");
            System.out.println("1 : triangle down");
            System.out.println("2 : triangle up");
            System.out.println("3 : triangle left");
            System.out.println("4 : triangle right");
            System.out.println("5 : EXIT");
            System.out.print("pick : ");
            int pick = sc.nextInt();

            switch (pick) {
                case 1:
                    downTriangle();
                    break;
                case 2:
                    upTriangle();
                    break;
                case 3:
                    leftTriangle();
                    break;
                case 4:
                    rightTriangle();
                    break;
                case 5:
                    System.out.println("===THANKS===");
                    return;
            
                default:
                    break;
            }
        } while (true);
    }

    static void downTriangle() {
        System.out.print("triangle size : ");
        int size = sc.nextInt();
        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size && j >= 0; j--) {
                System.out.print("  ");
            }
            for (int j = i; j < size && j >= 0; j++) {
                System.out.print("+ ");
            }
            for (int j = i; j < size; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }

    static void upTriangle() {
        System.out.print("triangle size : ");
        int size = sc.nextInt();
        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < size && j>= 0; j--) {
                System.out.print("+ ");
            }
            for (int j = i; j < size && j>= 0; j--) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }

    static void leftTriangle() {
        System.out.print("triangle size : ");
        int size = sc.nextInt();
        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < size && j >= 0; j--) {
                System.out.print("+ ");
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size && j >= 0; j--) {
                System.out.print("  ");
            }
            for (int j = i; j < size; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
    
    static void rightTriangle() {
        System.out.print("triangle size : ");
        int size = sc.nextInt();
        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size && j >= 0 ; j--) {
                System.out.print("+ ");
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}