import com.programs.LinkedNode;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoubleLL dl = new DoubleLL();
        dl.createLinkedList(10);
        dl.insertLinkedList(20);
        dl.insertLinkedList(30);
        dl.insertLinkedList(40);
        dl.insertLinkedList(50);
        dl.insertLinkedList(60);
        while(dl.head != null){System.out.print(dl.head.value+" "); if(dl.head.next == null) break; else dl.head = dl.head.next;}
        System.out.println();
        while(dl.head != null){System.out.print(dl.head.value+" "); if(dl.head.prev == null) break; else dl.head = dl.head.prev;}
    }
}
class DoubleLL {
    LinkedNode head,tail;
    public void createLinkedList(int nodeValue) {
        LinkedNode node = new LinkedNode();
        node.value = nodeValue;
        node.next = null;
        node.prev = null;
        head = node;
        tail = node;
    }

    public void insertLinkedList(int nodeValue) {
        LinkedNode node = new LinkedNode();
        if(tail.next == null){
            node.value = nodeValue;
            node.prev = tail;
            tail.next = node;
            node.next = null;
            return;
        }else{
            tail = tail.next;
            insertLinkedList(nodeValue);
        }
    }
}