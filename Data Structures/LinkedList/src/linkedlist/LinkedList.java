package linkedlist;

/**
 *
 * @author mfrazier1
 */
class LinkedList {

    Node head, current, previous;

    LinkedList(Node h) {
        head = h;
    }

    public boolean isEmpty() {
        return (head == null);
    }
    
    public void addToFront(Node newNode) {
        newNode.next = head;
        head = newNode;
    }
    
    //  Iterative approach
    public int size(Node current) {
        current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    //  Iterative approach
    public void addToEnd(Node newNode) {
        current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    //  Iterative approach
    public void addAtIndex(Node newNode, int index) {
        int count = 0;
        current = head;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        count += 1;
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else if (index > count) {
            current.next = newNode;
        } else {
            current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    //  Iterative approach
    public void insertith(Node head, int value, int index) {
        int count = size(head);
        if (index > count + 1 || index < 1) {
            //return head;
        }
        Node newNode = new Node(value);
        if (index == 1) {
            newNode.next = head;
        } else {
            Node previous = head;
            count = 1;
            while (count < index - 1) {
                previous = previous.next;
                count++;
            }
        }
        Node current = previous.next;
        newNode.next = current;
        previous.next = newNode;
    }

    //  Iterative approach
    public void removeNode(Node deleteNode) {
        if (!isEmpty()) {
            current = head;
            while (current.next != null) {
                if (current.next.data == deleteNode.data) {
                    current.next = current.next.next;
                }
                current = current.next;
            }
        }
    }

    //  Iterative approach
    public void removeFromEnd() {
        if (!isEmpty()) {
            current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    // Iterative approach 
    public Node reverseLL(Node node) {
        previous = null;
        current = node;
        Node temp = null;
        while (current != null) {
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        node = previous;
        return node;
    }

    //  Iterative approach
    public Node mergeTwoSortedLists(Node head1, Node head2) {
        current = head1;
        Node result = null;
        while (current.next != null) {
            current = current.next;
        }
        if (current.data < head2.data) {
            current.next = head2;
            return head1;
        }
        return result;
    }

    public void removeFromFront() {
        head = head.next;
    }

    //  Recursive approach
    public int length(Node head) {
        if (head == null) {
            return 0;
        } else {
            return size(head.next) + 1;
        }
    }

    //  Recursive approach
    public Node reverseLL(Node current, Node previous) {
        /* If last node mark it head*/
        if (current.next == null) {
            head = current;
            /* Update next to prev node */
            current.next = previous;
            return null;
        }
        Node temp = current.next;
        current.next = previous;
        reverseLL(temp, current);
        return head;
    }

    @Override
    public String toString() {
        String list = "";
        System.out.print("Linked List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        return "null\n";
    }

}
