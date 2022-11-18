package Algos.Anagram;

public class AnagramOfString {
    public static void main(String[] args) {

        // Anagram means two strings have same no. of character and used same no. of
        // times

        // Time complexity of below approach will be n^2

        String a = "Abc";
        String b = "abc";
        boolean isAnagram = false;

        boolean visited[] = new boolean[b.length()];

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                isAnagram = false;

                for (int j = 0; j < b.length(); j++) {
                    if (b.charAt(j) == c && !visited[j]) {
                        
                        visited[j] = true;

                        isAnagram = true;

                        break;
                    }

                }
                if (!isAnagram) {
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.err.println("Not Anagram");

        }

    }
}
