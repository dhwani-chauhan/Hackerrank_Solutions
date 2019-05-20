import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
             return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        int [] temp = new int [Character.MAX_VALUE];
        int summ = 0;
        for (int i = 0; i < a.length(); i++){
            summ += ++temp [a.charAt(i)] <= 0 ? -1 : 1;
            summ += --temp [b.charAt(i)] >= 0 ? -1 : 1;
            }
        if(summ == 0){
            return true;
            }
        else{
            return false;
            }
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
