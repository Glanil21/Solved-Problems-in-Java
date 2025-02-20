import java.util.Scanner;
public class prg20 {

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void magicnumber(int n) {
        int sum = n;
        while (sum >= 10) {
            sum = sumOfDigits(sum);
        }
        if (sum == 1) {
            System.out.println(n + " is a magic number.");
        } else {
            System.out.println(n + " is not a magic number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        magicnumber(num);
    }
}

