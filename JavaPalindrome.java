import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] charr = A.toCharArray();
        int l = A.length();
        String op="";
        for (int i=0;i<l;i++){
            op+=charr[l-i-1];
        }
        System.out.println((A.equals(op))?"Yes":"No");
        
    }
}
