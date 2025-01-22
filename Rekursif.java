public class Rekursif {
    // Program mencetak angka n sampai 1 (decrement)
    // Program mencetak angka 1 sampai n (increment)
    // Faktorial
    // Pangkat
    // Fibonacci
    
        public static void main(String[] args) {
            // decrement(5);
        }
    
        static void decrement(int n) {
            if (n <= 0) {
                return;
            }
            System.out.println(n);
            decrement(--n);
        }
    }
