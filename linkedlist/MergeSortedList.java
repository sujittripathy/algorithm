/**
    Merge two sorted LinkedList.
    List a = 1 -> 2 -> 6
    List b = 1 -> 4 -> 5

    Final list = 1 -> 1 -> 2 -> 4 -> 5 -> 6
 */
public class MergeSortedList {
    public static void main(String[] str) {
    //     ListNode l1 = new ListNode(1);
    //     ListNode _2 = new ListNode(2);
    //     ListNode _6 = new ListNode(6);
    //     l1.next = _2;
    //     _2.next = _6;

    //     ListNode l2 = new ListNode(1);
    //     ListNode _4 = new ListNode(4);
    //     ListNode _5 = new ListNode(5);
    //     l2.next = _4;
    //     _4.next = _5;

    //    ListNode ll = mergeTwoLists(l1, l2);
    //    while(l1 != null) {
    //        System.out.print(l1.data + "->");
    //        l1 = l1.next;
    //    }
    }

    // public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //     if(l1 == null) {
    //         return l2;
    //     }
    //     if(l2 == null) {
    //         return l1;
    //     }
    //     ListNode ptr1 = l1;
    //     ListNode ptr2 = l2;
    //     ListNode l3 = null;
    //     ListNode head = null;
    //     while(l1 != null & l2 != null) {
    //         if(l1.data == l2.data) {
    //             if(l3 == null) {
    //                 l3 = l1;
    //                 head = l3;
    //             } else {
    //                 l3.next = l1;
    //                 l3 = l3.next;
    //             }
    //             l1 = l1.next;
    //         } else if(l1.data < l2.data) {
    //             if(l3 == null) {
    //                 l3 = l1;
    //                 head = l3;
    //             } else {
    //                 l3.next = l1;
    //                 l3 = l3.next;
    //             }
    //             l1 = l1.next;
    //         } else {
    //             if(l3 == null) {
    //                 l3 = l2;
    //                 head = l3;
    //             } else {
    //                 l3.next = l2;
    //                 l3 = l3.next;
    //             }
    //             l2 = l2.next;
    //         }
    //     }
    //     if(l1 != null) {
    //         l3.next = l1;
    //     }         
    //     if(l2 != null) {
    //         l3.next = l2;
    //     }         
    //     return head;
    // }
}


// class ListNode {
//     public int data;
//     public ListNode next;

//     public ListNode(int data) {
//         this.data = data;
//     }
// }