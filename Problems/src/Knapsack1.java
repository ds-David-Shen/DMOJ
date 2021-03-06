import java.io.*;
import java.util.*;

public class Knapsack1 {

	static long KnapSack(long val[], int wt[], int N, int W) {
		long[] dp = new long[W + 1];
		for (int i = 0; i < N; i++) {
			for (int j = W; j >= wt[i]; j--) {
				dp[j] = Math.max(dp[j], val[i] + dp[j - wt[i]]);
			}
		}
		return dp[W];
	}


	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int N = sc.nextInt();
		int W = sc.nextInt();
		long val[] = new long[N];
		int wt[] = new int[N];
		
		for(int i=0; i<N; i++) {
			wt[i] = sc.nextInt();
			val[i] = sc.nextLong();
		}
		System.out.println(KnapSack(val,wt,N,W));
	}
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}