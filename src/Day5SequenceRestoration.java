import java.util.*;
import java.io.*;

public class Day5SequenceRestoration {
    public static int[] arr;

    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //첫 째줄 입력

        arr = new int[(int) Math.pow(2, n)];

        for (int i = 0; i < Math.pow(2, n); i++) {
            arr[i] = sc.nextInt();  // 둘 째줄 입력
        }

        Arrays.sort(arr);   //정렬

        dfs(0, 1, 0);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                sb.append(arr[i]).append(" ");
            }
        }

        System.out.println(sb);
    }

    public static void dfs(int level, int start, int sum) {
        if (level == 2) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == sum) {
                    arr[i] = 0;
                    break;
                }
            }
        } else {
            for (int i = start; i < arr.length; i++) {
                if (arr[i] != 0) {
                    dfs(level + 1, i + 1, sum + arr[i]);
                }
            }
        }
    }
}


