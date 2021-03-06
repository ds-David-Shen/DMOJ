import java.util.*;
import java.io.*;

public class Height {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		int arr[] = new int[1005];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		int dp[] = new int[1005];
		for (int i = 0; i < a; i++) {
			dp[i] = arr[i];
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], arr[i] + dp[j]);
				}
			}
			count = Math.max(count, dp[i]);
		}
		System.out.println(count);

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
