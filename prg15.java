import java.util.Scanner;
public class prg15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();

        Strong(n);

    }



    public static int fact(int n){
        int factorial  = 1;
        for(int i = 1; i <= n; i++){
            factorial = factorial * i ;
        }
        return factorial;
    }

    public static void Strong(int n){

        int sum = 0;
        int n1 = n;

        while(n > 0){
            int rem = n % 10;
            sum = sum + fact(rem);
            n = n / 10;
        }
        if(sum == n1){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a strong number");
        }
    }
}
