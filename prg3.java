package Number_logics;

public class prg3 {
    public static void main(String[] args) {
        int n=5;
        int e=3;
        result(n,e);
    }
    public static float pow(int b,int e){
        float res =1;
        while (e>0){
            res = res*b;
            e--;
        }
        return res;

    }
    public static float fact(int n){
        float fact=1;
        for(int i=1;i<=n;i++){
            fact =fact*i;
        }
        return fact;
    }
    public static void result(int a, int e){
        float power = pow(a, e);
        float fact = fact(a);
        float res =power/fact;
        System.out.println(res);
    }

}
