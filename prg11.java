

public class prg11 {

        public static void main(String[] args) {
    
            int n = 121;
            Res(n);
        }
    
    
        public static void Res(int n) {
    
            int reverseNumber = reverse(n);
            if(n == reverseNumber){
                System.out.println("Pallindrome");
            }
            else{
                System.out.println("Not a Pallindrome");
            }
        }
        public static int reverse(int n){
            int res = 0;
            while(n > 0){
                int rem = n % 10;
                res = res * 10 + rem;
                n = n / 10;
            }
            return res;
        }
    }
    
            
