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

        Node mid = head;
        //reverse logic
        //find mid (total node/2)
        int c = 0;
        int midNodeCnt = midNodeCnt(head);
        while(c != midNodeCnt) {
            mid = mid.next;
            c++;
        }
        //reverse the list from mid till end
        //K->A->Y<-A<-K
        //A->B<-B<-A
        mid.next = null;  
        Node prev = mid;
        Node curr = mid.next;
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

         boolean res = isPalindrome(head, prev);
         System.out.println("isPalindrome ? "+ res);
    }

    private static boolean isPalindrome(Node s, Node e) {
        while(s != null && e != null) {   
            System.out.println(s.data + "," + e.data); 
            if(s.data != e.data) {
                return false;
            }         
             s = s.next;
             e = e.next;
        }
        return true;
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