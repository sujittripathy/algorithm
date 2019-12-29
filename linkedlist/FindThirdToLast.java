/**
    1->2->3->4->5->6->7  (Odd nodes)
                      ^
                 ^
    The third to last element is 5

    1->2->3->4->5->6->7->8 (Even nodes)
                         ^
                   ^
    The third to last element is 6
 */
public class FindThirdToLast {
    public static void main(String[] args) {
        ListNode _1 = new ListNode(1);
        ListNode _2 = new ListNode(2);
        ListNode _3 = new ListNode(3);
        ListNode _4 = new ListNode(4);
        ListNode _5 = new ListNode(5);
        ListNode _6 = new ListNode(6);
        ListNode _7 = new ListNode(7);
        ListNode _8 = new ListNode(8);


        _1.next = _2;
        _2.next = _3;
        _3.next = _4;
        _4.next = _5;
        _5.next = _6;
        _6.next = _7;
        _7.next = _8;


        ListNode slow = _1;
        ListNode fast = _1.next.next;
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println("3rd Node from last : " + slow.data);
    }
}

class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
    }
}