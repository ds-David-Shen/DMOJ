// Java program to print all primes smaller than or equal to 
// n using Sieve of Eratosthenes 

public class SieveOfEratosthenesPrimes {
	void sieveOfEratosthenes(int n) {
		// Create a boolean array "prime[0..n]" and initialize
		// all entries it as true. A value in prime[i] will
		// finally be false if i is Not a prime, else true.
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i < n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++) {
			// If prime[p] is not changed, then it is a prime
			if (prime[p] == true) {
				// Update all multiples of p
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}

		// Print all prime numbers
		int count=0;
		for (int i = 2; i <= n; i++) {
			if (prime[i] == true) {
				count++;
				System.out.println(i);
			}
		}
	}

	// Driver Program to test above function
	public static void main(String args[]) {
		int n = 1000000;
		SieveOfEratosthenesPrimes g = new SieveOfEratosthenesPrimes();
		g.sieveOfEratosthenes(n);
	}
}