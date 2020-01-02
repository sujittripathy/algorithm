/**
 * 
 * Reverse a LinkedList in place
 * 
 *   1->2->3->4
 *   ^  ^  ^
 *p  c  n
 */

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node _1 = new Node(1);
        Node _2 = new Node(2);
        Node _3 = new Node(3);
        Node _4 = new Node(4);

        _1.next = _2;
        _2.next = _3;
        _3.next = _4;

        print(_1);
        Node rev = reverse(_1);
        print(rev);
    }

    private static void print(Node n) {
        while(n != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println("\n");
    }

    private static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        //Iterate till current becomes null
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //return prev because thats the last node in the LinkedList
        return prev;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}