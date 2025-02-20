

public class prg8 {
	    static int gcd(int x, int y) {
	        int small, gcd = 0;
	        if (x > y)
	            small = y;
	        else
	            small = x;
	        
	        for (int i = 1; i <= small; i++) {
	            if (x % i == 0 && y % i == 0) {
	                gcd = i;
	            }
	        }
	        return gcd;
	    }
	    static int lcm(int x, int y) {
	        int gcdValue = gcd(x, y);
	        return (x * y) / gcdValue;
	    }

	    public static void main(String[] args) {
	        int x = 10;
	        int y = 15;
	        
	        int lcmvalue = lcm(x, y);
	        System.out.println(lcmvalue);
	    }
	}

