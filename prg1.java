
import java.util.*;
public class prg1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        sum(n);
        System.out.println(sum(n));

    }
    public static int sum(int n){
        int sum=0;
        int i=0;
        for(i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }

}
