package Number_logics;

public class prg2 {
    public static void main(String[]args){
        int n =5;
       float res = fact(n);
        System.out.println(res);
    }
    public static float fact(int n){
        int fact =1;
        for(int i =1;i<=n;i++){
            fact =fact*i;
            
        }
        float res = 1/(float)fact;
        return res;
    }
    
}
