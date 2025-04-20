import java.util.*;

class StackClass<T>{
    private ArrayList<T> stack;

    StackClass(){
        this.stack=new ArrayList<>();
    }

    void push(T item){
        stack.add(item);
        System.out.println("Pushed " + item + " onto the stack.");
    }

    T pop(){
        if (!stack.isEmpty()) {
            T item = stack.remove(stack.size() - 1);
            System.out.println("Popped " + item + " from the stack.");
            return item;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
    }

    T peek() {
        if (!stack.isEmpty()) {
            T item = stack.get(stack.size() - 1);
            System.out.println("Peeked at the stack. Top element is " + item + ".");
            return item;
        } else {
            System.out.println("Stack is empty. Nothing to peek.");
            return null;
        }
    }
}


public class StackImplement{
    public static void main(String[] args) {
        StackClass<Integer> intStack = new StackClass<Integer>();
        intStack.push(10);
        intStack.push(20);
        intStack.peek();
        intStack.pop();
        intStack.pop();
        intStack.pop();

        StackClass<String> stringStack = new StackClass<String>();
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.peek();
        stringStack.pop();
        stringStack.pop();
        stringStack.pop();
    }
}