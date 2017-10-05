package 搜狐;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String str = scanner.nextLine();

    }

    public static String jianhuaPath(String path){
        String[] paths = path.split("/");
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i <paths.length ; i++) {
            if (".".equals(paths[i])||"".equals(paths[i]))
                continue;
            if ("..".equals(paths[i])){
                if (!stack.empty())
                    stack.pop();
            }else {
                stack.push(paths[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()){
            sb.insert(0,stack.pop());
            sb.insert(0,"/");
        }
        if (sb.length()==0){
            sb.append("/");
        }
        return sb.toString();
    }
}
