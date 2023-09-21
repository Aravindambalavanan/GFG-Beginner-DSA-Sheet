import java.io.*;
import java.util.*;
import java.math.*;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class GFG {
    static Node buildTree(String str) {

        if (str.length() == 0 || str.equals("N"))
            return null;
        String[] s = str.split(" ");

        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i < s.length) {

            Node currNode = q.remove();

            String currVal = s[i];

            if (!currVal.equals("N")) {

                currNode.left = new Node(Integer.parseInt(currVal));

                q.add(currNode.left);
            }

            i++;
            if (i >= s.length)
                break;
            currVal = s[i];

            if (!currVal.equals("N")) {

                currNode.right = new Node(Integer.parseInt(currVal));

                q.add(currNode.right);
            }

            i++;
        }

        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            int key = Integer.parseInt(br.readLine().trim());
            Solution T = new Solution();
            root = T.insert(root, key);
            inorder(root);
            System.out.println();
            t--;
        }
    }

    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class Solution {

    Node insert(Node root, int Key) {

        if (root == null) {
            return new Node(Key);
        }
        if (Key < root.data) {
            root.left = insert(root.left, Key);
        }
        if (Key > root.data) {
            root.right = insert(root.right, Key);
        }
        return root;
    }
}