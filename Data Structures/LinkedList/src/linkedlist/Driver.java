package linkedlist;

/**
 *
 * @author mfrazier1
 */
public class Driver {

    public static void main(String[] args) {
        
        //  Driver to test various Linked Lists functions
        Node node = new Node(10);
        node.next = new Node(20);
        node.next.next = new Node(30);
        node.next.next.next = new Node(40);

        LinkedList ll = new LinkedList(node);
        System.out.print(ll);
        ll.addToFront(new Node(99));
        System.out.print(ll);
        ll.addToEnd(new Node(1000));
        System.out.print(ll);
        ll.removeNode(new Node(30));
        System.out.print(ll);
        ll.removeFromFront();
        System.out.print(ll);
        ll.removeFromEnd();
        System.out.print(ll);

        node.next.next.next = new Node(50);
        node.next.next.next.next = new Node(60);
        node.next.next.next.next.next = new Node(70);
        node.next.next.next.next.next.next = new Node(80);
        
        
        System.out.print(ll);
        ll.addAtIndex(new Node(55555), 2);
        System.out.print(ll);
        ll.addAtIndex(new Node(777), 6);
        System.out.print(ll);
        ll.addAtIndex(new Node(888), 5);
        System.out.print(ll);
        ll.addAtIndex(new Node(3333333), 55);
        System.out.print(ll);
        ll.addAtIndex(new Node(0000), 0);
        System.out.print(ll);
        ll.addAtIndex(new Node(984), 0);
        System.out.print(ll);
        
        //////////////////////////
        //                      //
        // Reverse Linked Lists //
        //                      //
        //////////////////////////
        
        ll.reverseLL(ll.head, null);        //  Recursive
        System.out.print(ll);        
        ll.head = ll.reverseLL(ll.head);    //  Iterative
        System.out.print(ll);
        
        ////////////////////////////
        //                        //
        // Merge Two Sorted Lists //
        //                        //
        ////////////////////////////
        
        Node merge1 = new Node(10);
        merge1.next = new Node(20);
        merge1.next.next = new Node(30);
        
        Node merge2 = new Node(40);
        merge2.next = new Node(50);
        merge2.next.next = new Node(60);

        LinkedList l2 = new LinkedList(merge1);
        LinkedList l3 = new LinkedList(merge2);
        
        l2.mergeTwoSortedLists(merge1, merge2);
        System.out.print(l2);
        
        ll.insertith(node, 69, 5);
        System.out.print(ll);
        System.out.println(ll.size(merge1));
        System.out.println(ll.size(merge2));
        System.out.println(ll.size(node));
        
    }

}
