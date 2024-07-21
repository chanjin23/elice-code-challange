import java.util.*;

public class Day2Organized {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<m;++i){
            int first=sc.nextInt();
            int last=sc.nextInt();
            int index=sc.nextInt();
            ArrayList<Integer> list=new ArrayList<>();

            for(int j=first-1;j<=last-1;j++){
                list.add(arr[j]);
            }

            Collections.sort(list);

            System.out.println(list.get(index-1));
        }
    }
}
