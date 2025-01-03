package lession11.bt1;

public class GenericStackClient {

    public static void main(String[] args) {
        System.out.println("1. Stack of intergers");
        stackOfIntergers();
        System.out.println("--------");
        System.out.println("2. Stack of strings");
        stackOfStrings();
    }
    private static void stackOfStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " +stack.size());
        System.out.println("1.2 Pop elements from stack: ");
        if(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("1.3 Size of stack after pop operations: " +stack.size());
    }

    private static void stackOfIntergers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1.1 Size of stack after push operations: " +stack.size());
        System.out.println("1.2 Pop elements from stack: ");
        if(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("1.3 Size of stack after pop operations: " +stack.size());
    }
}
