import java.util.*;
import java.io.*;

public class dwite07c5p2 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		for(int i=0; i<5; i++) {
			int a = sc.nextInt();
			int count = 0;
			for(int j=2; j<=a; j++) {
				while(a%j==0) {
					count++;
					a/=j;
				}
			}
			if(count==1)count--;
			System.out.println(count);
		}

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