import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoonMakeMaze {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n + 1][n + 1];
        for (int i = 1; i <= n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; ++j) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
