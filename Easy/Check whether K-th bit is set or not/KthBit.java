import java.io.*;
import java.util.*;

class CheckBit {

    static boolean checkKthBit(int n, int k) {

        return ((n & (1 << k)) != 0);
    }

}

class GFG {
    static int n;
    static int k;

    // Driver Code
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {

            n = Integer.parseInt(br.readLine());
            k = Integer.parseInt(br.readLine());

            CheckBit obj = new CheckBit();

            if (obj.checkKthBit(n, k))
                System.out.println("Yes");

            else
                System.out.println("No");

            t--;
        }
    }

}
