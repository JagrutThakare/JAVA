package Algos;

import java.util.Scanner;

public class ReverseString {
    public static void reverseWords() {
    
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(),ans = null;

        int i = s.length() - 1;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            
            int j = i;
            
            if (i < 0)
                break;
                
            while (i >= 0 && s.charAt(i) != ' ')
                i--;

            if (ans.isEmpty()) {
                ans = ans.concat(s.substring(i + 1, j + 1));
            } else {
                ans = ans.concat(" " + s.substring(i + 1, j + 1));
            }
        }
        System.out.println(ans);
        sc.close();
    }

    public static void main(String[] args) {

        reverseWords();

    }

}
