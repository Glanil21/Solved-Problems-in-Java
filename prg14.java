

public class prg14 {
    public class Armstrong {
	static int pow(int a,int b)
	{
		int m1=1;
		while(b>0)
		{
			m1=m1*a;
			b--;
		}
		return m1;
	}
	
	static int length(int a)
	{
		int count=0;
		while(a>0)
		{
			count++;
			a/=10;
		}
		return count;
	}
	
	static boolean isArmstrong(int n)
	{
		int num=0,rem,n1=n;
		int x=length(n);
		while(n>0)
		{
			rem=n%10;
			num=num+pow(rem,x);
			n/=10;
		}
		if(n1==num)
			return true;
		else
			return false;
	}
	
	public static void main(String args[])
	{	
		int n=153;
		if(isArmstrong(n))
		System.out.println("Number is a Armstrong Number");
		else
			System.out.println("Number is Not a Armstrong");
	
	}
}
}
