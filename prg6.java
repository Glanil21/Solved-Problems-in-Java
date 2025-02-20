
public class prg6 {
    public static int Reverse(int n){
        int ans = 0;
        int rem = 0;
        while(n > 0){
            rem = n % 10;
            ans = ans * 10 + rem;
            n /= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n =123456;
        int res=Reverse(n);
        System.out.println(res);
    }
}
