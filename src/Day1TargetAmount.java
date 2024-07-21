import java.util.*;

public class Day1TargetAmount {
    static String[] arr,answer;
    static boolean[] check;
    static int len;
    static ArrayList<String> list;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String n=sc.nextLine();
        len=n.length();

        arr=n.split("");
        answer=new String[len];
        check=new boolean[len];
        list=new ArrayList<>();

        dfs(0);

        Collections.sort(list);
//        System.out.println(list);
        for(int i=0;i<list.size();++i){
            try{
                if(list.get(i).equals(n)) {
                    System.out.println(Integer.parseInt(list.get(i+1)));
                    return;
                }
            }catch(Exception e){
                System.out.println(0);
                return;
            }
        }

    }

    public static void dfs(int level){
        if(level==len){
            String result="";
            for(String s:answer){
                result+=s;
            }
            if(list.contains(result)) return;
            list.add(result);
        }else{
            for(int i=0;i<len;++i){
                if(check[i]) continue;

                answer[level]=arr[i];
                check[i]=true;
                dfs(level+1);
                check[i]=false;
            }
        }
    }
}
