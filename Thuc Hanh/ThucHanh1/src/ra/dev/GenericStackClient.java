package ra.dev;

public class GenericStackClient {
    private static void stackOfIsString(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 size of stack after push operation : " + stack.size());
        System.out.println("1.2 Pop element from stack : ");
        while ((!stack.isEmpty())){
            System.out.printf(" %s, ", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operation : "  + stack.size());
    }

    private static void stackOfInterger(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 kich thuoc cua stack sau khi them : "  + stack.size());
        System.out.println("2.1 dung phuong thuc pop cho stack : ");
        while (!stack.isEmpty()){
            System.out.printf( " %d, ", stack.pop());
        }
        System.out.println("\n3.3 kich thuoc sau khi dung Pop : " + stack.size());

    }

    public static void main(String[] args) {
        System.out.println( "1. stack if interger .");
        stackOfInterger();
        System.out.println("2.stack of string .");
        stackOfIsString();
    }


}
