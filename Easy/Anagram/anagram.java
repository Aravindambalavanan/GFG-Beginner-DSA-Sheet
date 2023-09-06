package Anagram;

import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();
            String s1 = str.split(" ")[0];
            String s2 = str.split(" ")[1];

            if (Solution.isAnagram(s1, s2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}

class Solution {

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        int[] arr = new int[26];

        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'a']++;
            arr[b.charAt(i) - 'a']--;
        }
        for (int x : arr) {
            if (x != 0) {
                return false;
            }
        }
        return true;
    }
}