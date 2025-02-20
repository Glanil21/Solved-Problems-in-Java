public class prg21 {
   
        public static void main(String[] args) {
            int n1 = 220;
            int n2 = 284;
            friendlyCheck(n1, n2);
        }
    
        public static void friendlyCheck(int n1, int n2){
            int sumofDivisorsn1 = 0, sumofDivisorsn2 = 0;
            for (int i = 1; i < n1; i++){
                if( n1 % i == 0){
                sumofDivisorsn1 = sumofDivisorsn1 + i;
    
            }
    
            }
    
          for( int i = 1; i < n2; i++ ){
              if(n2 % i == 0){
                  sumofDivisorsn2 = sumofDivisorsn2 + i;
    
              }
          }
          if(sumofDivisorsn1 == n2 && sumofDivisorsn2 == n1){
              System.out.println("Friendly pairs");
          }
          else{
              System.out.println("Not friendly pairs");
          }
        }
    }
    

