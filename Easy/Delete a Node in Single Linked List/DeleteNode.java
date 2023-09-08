import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class DeleteNode {
    Node head;

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();

            DeleteNode llist = new DeleteNode();

            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }
            int x = sc.nextInt();

            GfG g = new GfG();

            Node result = g.deleteNode(llist.head, x);
            llist.printList(result);
            t--;
        }
    }
}

class GfG {
    Node deleteNode(Node head, int x) {

        if (head == null) {
            return head;
        }
        if (x == 1) {
            head = head.next;
            return head;
        }
        Node temp = null;
        Node current = head;

        for (int i = 1; i < x; i++) {
            if (current.next == null) {
                temp.next = null;
                return null;
            } else {
                temp = current;
                current = current.next;
            }
        }
        temp.next = current.next;
        return head;
    }
}
