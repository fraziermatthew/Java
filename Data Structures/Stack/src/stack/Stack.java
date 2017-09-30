package stack;

/**
 * @author mfrazier1
 */
public class Stack {

    public int n;          //  # of elements in the stack
    public int[] stack;    //  stack of non-negative ints

    Stack() {
        this.stack = new int[15];
    }

    /**
     * @param item the element to enter the stack
     */
    public void push(int item) {
        if (!isFull()) {
            this.stack[n++] = item;
        } else {
            System.out.println("The stack is full.");
        }
    }

    /**
     * @return top item on stack
     */
    public int pop() {
        if (!isEmpty()) {
            return stack[n--];
        } else {
            System.out.println("The stack is empty.\n");
        }
        return -1;
    }

    /**
     * @return true if stack is empty, else false
     */
    public boolean isEmpty() {
        return (n < 0);
    }

    /**
     * @return true if stack is full, else false
     */
    public boolean isFull() {
        return (stack.length - 1 == n);
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println(stack[n - 1]);
        } else {
            System.out.println("The stack is empty.");
        }
    }

    @Override
    public String toString() {
        int temp = n - 1;
        while (temp > -1) {
            System.out.println(stack[temp--]);
        }
        return "Stack structure\n";
    }

}   //  end Stack class
