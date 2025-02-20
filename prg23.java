public class prg23 {
        public static void main(String[] args) {
            int n = 1124;
            spy(n);
        }
    
        public static void spy(int n) {
            int sum = 0, product = 1, temp = n;
    
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                product *= digit;
                temp /= 10;
            }
    
            if (sum == product) {
                System.out.println("Spy Number");
            } else {
                System.out.println("Not a Spy Number");
            }
        }
    }
    
