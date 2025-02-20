
import java.util.Scanner;
public class prg12 {

    static int prime(int n){
        int i,count=0;
        for(i=2;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
        }
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int ans=prime(n);
           if(ans>1){
               System.out.println("the number is not a prime");
           }
           else{
               System.out.println("the number is a prime");
           }
        }
}



