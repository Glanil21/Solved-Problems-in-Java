package Number_logics;

public class prg5 {
    public static int sum(int n) {
	 int sum=0;
	 while(n>0) {
		int res=n%10;
		 sum=sum+res;
		 n=n/10;
	 }
	 return sum;
 }
 public static void main(String[] args) {
	 int n=12345;
	 int ans=sum(n);
	 System.out.println(ans);
	 
 }
}


