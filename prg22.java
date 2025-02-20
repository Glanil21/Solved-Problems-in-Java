public class prg22 {
    
        public static void main(String[] args) {
            int n = 15;
            neon(n);
        }
    
    
        public static void neon(int n){
            int square = n * n;
            int sum = 0;
            while(square > 0){
                int rem = square % 10;
                sum = sum + rem;
                square = square /10;
            }
    
            if(sum == n){
    
                System.out.println("Neon number");
    
            }
    
            else{
                System.out.println("Not a neon number");
            }
        }
    }
    

