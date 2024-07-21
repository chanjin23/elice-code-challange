import java.util.*;

public class Day3StringDecompression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        int count=0;

        Stack<String> stack=new Stack<>();
        for(String c:s.split("")){
            if(!c.equals(")")){
                stack.push(c);
            }else{
                while(!stack.peek().equals("(")){
                    stack.pop();
                    count++;
                }

                stack.pop();    //(제거

                count=count*Integer.parseInt(stack.pop());
            }
        }
        count=count+stack.size();
        System.out.println(count);
    }
}
