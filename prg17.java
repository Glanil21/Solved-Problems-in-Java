import java.util.Scanner;
public class prg17 {

    public static void harshad(int n) {
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (n % sum == 0) {
            System.out.println(n + " is a harshad number.");
        } else {
            System.out.println(n + " is not a harshad number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        harshad(num);
    }
}
