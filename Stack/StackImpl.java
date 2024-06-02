package Stack;

import java.util.ArrayList;
import java.util.Stack;

/*
 * @author akanksha
 */
public class StackImpl {
    private ArrayList<Integer> items;
    private StackImpl(){
        items = new ArrayList<>();
    }
    // push operation
    public void push(int item){
        items.add(item);
    }
    //pop operation
    public int pop(){
        if(isEmpty()){
            return items.removeLast();
        }
        return 0;
      }

      // peek operation
    public int peek(){
        if(isEmpty()){
            return items.getLast();
        }
        return 0;
    }

    //isEmpty
    public boolean isEmpty(){
        return !items.isEmpty();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("top element"+ stack.peek());
        System.out.println("pop element"+ stack.pop());
        stack.push(30);
        System.out.println("popped element"+ stack.pop());
    }
}
