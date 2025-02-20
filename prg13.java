    
import java.util.Scanner;
public class prg13 {


	static boolean perfectsquare(int n) {
		int i=0;
		while(n<0) {
			return false;
		}
		while(i*i<n) {
			i++;
		}
		return i*i==n;
		
	}
	
		
	
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	boolean res=perfectsquare(n);
	if(res) {
		System.out.println("perfect square");
	}
	else {
		System.out.println("not a perfect square");
	}
	
}
}

