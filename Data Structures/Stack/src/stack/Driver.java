package stack;

/**
 *
 * @author mfrazier1
 */
public class Driver {

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(5);
        s1.push(10);
        s1.push(15);
        System.out.print(s1);
        
        s1.pop();
        System.out.print(s1);
       
        s1.push(15);
        s1.push(20);
        s1.push(25);
        s1.push(30);
        s1.push(35);
        s1.push(40);
        s1.push(45);
        s1.push(50);
        s1.push(55);
        s1.push(60);
        s1.push(65);
        s1.push(70);
        s1.push(75);
        
        System.out.print(s1);
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.peek();
        System.out.print(s1);
    }

}
