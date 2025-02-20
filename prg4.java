
public class prg4 {
    public static void main(String[] args) {
        int n =78958;
        int c = NoofDigits(n);
        System.out.println(c);

    }
    public static int NoofDigits(int a){
        int count=0;
        while(a>0){
            a/=10;
            count++;
        }
        return count;
    }
}
