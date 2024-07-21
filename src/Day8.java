import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Day8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] elice = {"E", "L", "I", "C", "E"};

        int n = Integer.parseInt(br.readLine());

        int[][] maze = new int[n + 1][n + 1];
        String[][] eliceMaze = new String[n + 1][n + 1];
        for (int i = 1; i <= n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; ++j) {
                maze[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            eliceMaze[x][y] = elice[i];
        }

        Queue queue = new LinkedList<>();

    }
}
