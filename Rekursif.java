public class Rekursif {
    // Program mencetak angka n sampai 1 (decrement)
    // Program mencetak angka 1 sampai n (increment)
    // Faktorial
    // Pangkat
    // Fibonacci
    
        public static void main(String[] args) {
            // decrement(5);
            // increment(1,10);
        }
    
        static void decrement(int n) {
            if (n <= 0) {
                return;
            }
            System.out.println(n);
            decrement(--n);
        }

        static void increment(int start, int target) {
            if (start == target+1) {
                return;
            }
            System.out.println(start);
            increment(start+1, target);
        }
    }
