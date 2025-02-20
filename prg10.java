
import java.util.Scanner;
public class prg10 {
  
    public static void primefactors(int n) {
        System.out.print("Prime factors: ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        primefactors(num);
    }
}


