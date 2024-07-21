import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day7 {
    static int len,k,temp;
    static String[] arr,answer;
    static String realAnswer;
    static ArrayList<String> list;
    static boolean ok;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        len = n.length();
        k = sc.nextInt();

        arr = new String[k];
        answer = new String[len];
        list = new ArrayList<>();
        for (int i = 0; i < k; ++i) {
            arr[i] = String.valueOf(i);
        }
        temp = Integer.parseInt(n);

        dfs(0);

        Collections.sort(list);

        for (String s : list) {
            if (Integer.parseInt(s) > temp) {
                System.out.println(s);
                return;
            }
        }
    }


    public static void dfs(int level) {
        if (level == len) {
            StringBuilder sb = new StringBuilder();
            boolean[] check = new boolean[k];
            boolean realCheck=false;

            for (String s : answer) {
                check[Integer.parseInt(s)] = true;
                sb.append(s);
            }

            for (boolean b : check) {
                if(!b) {
                    realCheck=true;
                    break;
                }
            }

            if(!realCheck){
                list.add(sb.toString());
            }
        }else{
            for (int i = 0; i < arr.length; ++i) {
                answer[level] = arr[i];
                dfs(level+1);
            }
        }
    }
}
