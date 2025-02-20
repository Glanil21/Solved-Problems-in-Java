public class prg19 {
        public static void main(String[] args) {
            int n = 6;
            Automorphic(n);
        }
        public static int NoofDigitsofNumber(int n){
           int count = 0;
            while(n > 0){
                n = n / 10;
                count++;
    
            }
            return count;
        }
    public static int pow(int b, int e){
            int power = 1;
            while(e > 0){
                power = power * b;
                e--;
            }
    
            return power;
    }
        public static void Automorphic(int n){
            int x = NoofDigitsofNumber(n);
            int square = n * n;
            int lastdigits = square % pow(10, x);
    
            if(lastdigits == n){
                System.out.println(n + " " + "is an Automorphic number");
            }
            else{
                System.out.println(n + " " + "is not an Automorphic number");
            }
        }
    
    }
