/**
 * 
 * Verify whether LinkedList is palindrome or not?
 * K->A->Y->A->K
 * K->A->Y<-A<-K
 * 
 */

public class LinkedListPalindrome {
    public static void main(String[] args) {
        Node _k = new Node('K');
        Node _a = new Node('A');
        Node _y = new Node('Y');
        Node _a1 = new Node('A');
        Node _k1 = new Node('K');

        Node head = _k;
        _k.next = _a;
        _a.next = _y;
        _y.next = _a1;
        _a1.next = _k1;

        Node mid = _k;
        //reverse logic
        //find mid (total node/2)
        int c = 0;
        int midNodeCnt = midNodeCnt(head);
        while(c != midNodeCnt) {
            mid = mid.next;
            c++;
        }
        //reverse the list from mid till end
        //K->A->Y->A->K
        //       <-   
        Node prev = mid;
        Node curr = mid.next;
        Node next = curr.next;
        while(curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
           // next = curr.next;
        }
        Node d = head;
        while(d != null) {
            System.out.println(d.data);
            d = d.next;
        }
    }

    //kayak
    public static int midNodeCnt(Node node) {
        int c = 0;
        while(node != null) {
            node = node.next;
            c++;
        }
        return c/2;
    }
}

class Node {
    char data;
    Node next;

    public Node(char data) {
        this.data = data;
    }
}