import java.util.*;
import java.io.*;

public class dwite08c2p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		for(int t=0; t<5; t++) {
			for(int i=0; i<7; i++) {
				String a = sc.next();
				int count = 0;
				for(int j=0; j<a.length(); j++) {
					if(a.charAt(j)=='#') {
						count++;
					}
				}System.out.print(count);
			}System.out.println();
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