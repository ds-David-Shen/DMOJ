import java.util.*;
import java.io.*;

public class vmss7wc16c3p3 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int m = sc.nextInt();
		int b = sc.nextInt() - 1;
		int q = sc.nextInt();

		int grid[][] = new int[n][n];

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			int z = sc.nextInt();

			grid[x][y] = z;
			grid[y][x] = z;

		}
		int[] step = new int[n];
		Arrays.fill(step, 1 << 30);
		LinkedList<Integer> queue = new LinkedList<Integer>();

		step[b] = 0;
		queue.add(b);

		while (!queue.isEmpty()) {
			int cur = queue.poll();

			for (int c = 0; c < n; c++) {
				if (grid[cur][c] != 0 && step[c] > step[cur] + grid[cur][c]) {
					step[c] = step[cur] + grid[cur][c];
					queue.add(c);
				}
			}
		}
		while (q-- > 0) {
			int a = sc.nextInt() - 1;
			
			System.out.println(step[a] == 1 << 30 ? -1 : step[a]);
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
