/*
Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
Explanation 1

Character	Frequency: anagramm	Frequency: marganaa
A or a	3	4
G or g	1	1
N or n	1	1
M or m	2	1
R or r	1	1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello
Sample Output 2

Anagrams
Explanation 2

Character	Frequency: Hello	Frequency: hello
E or e	1	1
H or h	1	1
L or l	2	2
O or o	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
*/
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean out = false;
        if(a.length() == b.length()){
            int len = a.length();
           int acount=0;
           int bcount=0;
           char[] acharr = a.toLowerCase().toCharArray();
           char[] bcharr = b.toLowerCase().toCharArray();
           for(int i=0;i<len;i++){
               for(char c : acharr){
                   acount=0;
                   bcount=0;
                   for(char c2 : acharr){
                       if (c == c2){
                           acount++;
                       }
                   }
                   for(char c3 : bcharr){
                       if (c==c3){
                           bcount++;
                       }
                   }
                   if (acount != bcount){
                       out=false;
                       return out;
                   }
                   else{
                       out=true;
                   }
               }
           }
           return out;
        }
        else
            return out;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}


/*
import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() == b.length()){
        Map<Character,Integer> map1 = new HashMap<Character,Integer>();
        Map<Character,Integer> map2 = new HashMap<Character,Integer>();
        for(int i=0; i<a.length(); i++){
            if(map1.putIfAbsent(a.charAt(i),0) != null){
                map1.put(a.charAt(i),map1.get(a.charAt(i))+1);
            }
            if(map2.putIfAbsent(b.charAt(i),0) != null){
                map2.put(b.charAt(i),map2.get(b.charAt(i))+1);
            }
        }
        return map1.equals(map2);
        }
        else
            return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

*/
