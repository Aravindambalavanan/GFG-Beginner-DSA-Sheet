import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long[] res = new Solution().printFibb(n);

            for (int i = 0; i < res.length; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}

class Solution {

    public static long[] printFibb(int n) {

        if (n <= 0) {
            return new long[0];
        }

        long[] arr = new long[n];
        long a = 0, b = 1;

        for (int i = 0; i < n; i++) {

            long temp = a + b;
            a = b;
            b = temp;
            arr[i] = a;
        }
        return arr;
    }
}