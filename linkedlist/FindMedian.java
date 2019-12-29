/** 
  Find the middle or median element in a LinkedList with both
  even or odd number of nodes.

  1->2->3->4->5->6->7 //Odd nodes
           ^     
                    ^
  1->2->3->4->5->6->7->8 //Even nodes
              ^
                         ^
*/

class FindMedian {
  public static void main(String[] args) {
    Node _1 = new Node(1);
    Node _2 = new Node(2);
    Node _3 = new Node(3);
    Node _4 = new Node(4);
    Node _5 = new Node(5);
    Node _6 = new Node(6);
    Node _7 = new Node(7);
    Node _8 = new Node(8);

    _1.next = _2;
    _2.next = _3;
    _3.next = _4;
    _4.next = _5;
    _5.next = _6;
    _6.next = _7;
    _7.next = _8;

    // Find middle, initialize 2 pointers
    Node slow = _1;
    Node fast = _1;
    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    System.out.println("mid : " + slow.data);
  }
}

class Node {
  public int data;
  public Node next;

  public Node(int data) {
    this.data = data;
  }
}