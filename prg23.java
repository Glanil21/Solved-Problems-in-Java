public class prg23 {

        public static void main(String[] args) {
            int n = 124;
            spy(n);
        }
    
        public static void spy(int n){
    
    
            int sum = 0; int product = 1;
            while(n > 0){
                int rem = n % 10;
                sum = sum + rem;
                product = product * rem;
                n = n / 10;
            }
            if(sum == product){
                System.out.println("The number is a Spy number");
            }
            else {
                System.out.println("Not a spy number");
            }
    
        }
    }
    
    
    
