

public class prg9 {
    public static void main(String[]args){
        int n =5;
        fact(n);
        System.out.println(fact(n));
    }
    public static int fact(int n){
        int fact = 1;
        for(int i =1;i<=n;i++){
            fact =fact*i;
            
        }
        return fact;
}
}
