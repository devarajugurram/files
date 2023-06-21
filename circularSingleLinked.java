import com.programs.LinkedNode;

public class circularSingleLinked {
    public static void main(String args[]) {
        Circular cir = new Circular();
        cir.linkedList(10);
        cir.insertNode(20);
        cir.insertNode(30);
        cir.insertNode(40);
        cir.insertNode(50);
        cir.insertNode(60);
        cir.insertNode(70);
        while(cir.head.next != null) {System.out.print(cir.head.value+" "); cir.head = cir.head.next; if(cir.head == cir.tail.next.next) break;}
    }
}
class Circular {
    LinkedNode head;
    LinkedNode tail;
    public void linkedList(int nodeValue) {
        LinkedNode node = new LinkedNode();
        node.value = nodeValue;
        head = node;
        tail = node;
        node.next = tail;
    }
    public void insertNode(int nodeValue) {
        LinkedNode node = new LinkedNode();
        if(head == tail.next) {
            node.value = nodeValue;
            tail.next = node;
            node.next = head;
            return;
        }else{
            tail = tail.next;
            insertNode(nodeValue);
        }
    }
}
