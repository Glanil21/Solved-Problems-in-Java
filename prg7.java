package Number_logics;

public class prg7 {
static int mod(int x,int y) {
	int sml;
	int gcd = 0;
	if(x<y)
		sml = x;
	else
		sml = y;
	for(int i=1;i<=sml;i++) {
		if(x%i==0 && y%i==0) 
			gcd = comp(i);
		
	}
	return gcd;

}
static int comp(int i) {
	int grt = 1;
	if(i>0) {
		
		if (i>grt) {
			grt = i;
		}
		else {
			grt = grt;
			
		}
	}
	return grt;
}
public static void main ( String[] args) {
	int a=9;
	int b = 3;
	int res = mod(a,b);
	System.out.println(res);
}
}

