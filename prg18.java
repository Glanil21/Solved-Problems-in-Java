import java.util.Scanner;
public class prg18 {
    
        public static void main(String[] args) {
                int n = 16;
                Abundant(n);
        }
    
        public static int Sum(int n){
            int sum = 0;
            for(int i = 1; i < n; i++){
                if(n % i == 0){
                    sum = sum + i;
                }
            }
            return sum;
        }
        public static void Abundant(int n){
            int sum = Sum(n);
            if(sum > n){
                System.out.println("The number is a abundant number");
            }
            else{
                System.out.println("The number is not an abundant number");
            }
    
    
        }
    }
    


