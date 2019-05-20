import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static String isBalanced(String s) {
        int i,top;
        int length=s.length();
        char [] stack=new char [100000];
        top=-1;
        for(i=0;i<length;i++)
            {
            if((s.charAt(i)=='[') ||  (s.charAt(i)=='{') ||   (s.charAt(i)=='(' ) )
                {
                    stack[++top]=s.charAt(i);
                }
            if(s.charAt(i)==']')
                {
                if(top>=0 && stack[top]=='[') 
                    top-=1;
                else 
                    return "NO";
            }
            if(s.charAt(i)=='}')
                {
                if(top>=0 && stack[top]=='{') 
                    top-=1;
                else
                    return "NO";
            }
            if(s.charAt(i)==')')
                {
                if(top>=0 && stack[top]=='(') 
                    top-=1;
                else 
                    return "NO";
            }
        }
        if(top==-1)
            return "YES" ;
        else 
            return "NO";
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();
            String result = isBalanced(s);
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        scanner.close();
    }
}
