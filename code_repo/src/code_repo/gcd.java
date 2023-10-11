package code_repo;

public class gcd {

	public static void main(String[] args) {
		
		
	}
	
	 public int getgcd(int a,int b) {
			
			// if b=0, a is the GCD
			if (b == 0)
				return a;

			// call the gcd() method recursively by
			// replacing a with b and b with
			// modulus(a,b) as long as b != 0
			else
				return getgcd(b, a % b);
		
			
		}

}
// 1. if a||b ==1gcd=1;

