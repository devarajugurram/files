import com.programs.LinkedNode;
public class Stack {
    // push() isEmpty() pop() peek()
    public static void main(String[] args) throws Exception{
       operation op = new operation();
       op.push(10);
       op.push(20);
       op.pop();
       System.out.println(op.peek());
    }
}
class operation extends Exception{
    LinkedNode head;
    LinkedNode tail;
    public boolean isEmpty(){
        return tail == null;
    }
    public void push(int nodeValue){
        LinkedNode node = new LinkedNode();
        if(tail == null){
            node.value = nodeValue;
            node.next = null;
            node.prev = null;
            head = node;
            tail = node;
        }else if(tail.next == null){
            node.value = nodeValue;
            node.next = null;
            node.prev = tail;
            tail.next = node;
        }else {
            tail = tail.next;
            push(nodeValue);
        }
    }
    public void pop(){
            while (tail.next != null) tail = tail.next;
            tail = tail.prev;
            tail.next = null;
        }
    public int peek(){
        while(tail.next != null) tail = tail.next;
        return tail.value;
    }
}