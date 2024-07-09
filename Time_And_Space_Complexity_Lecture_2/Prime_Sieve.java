package Time_And_Space_Complexity_Lecture_2;
public class Prime_Sieve {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primesieve(100);
	}
	// ith index pe true hai iska matlab i prime number hai
	public static void primesieve(int n) {
		boolean[]prime=new boolean[n+1];
		for(int i=2;i<prime.length;i++) {
			prime[i]=true;
		}
		for(int i=2;i*i<prime.length;i++) {
			if(prime[i]==true) { // i is prime number
			for(int j=2;j*i<prime.length;j++) {
				prime[i*j]=false;
			}
			}
		}
		for(int i=2;i<prime.length;i++) {
			if(prime[i]==true) { // i is prime
			System.out.print(i+" ");	
			}
		}
	}
}
