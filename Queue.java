import com.programs.LinkedNode;

interface dis{
    void display();
}

public class Queue {
    public static void main(String[] str) {
        QueueOperations qp = new QueueOperations();
        qp.EnQueue(10);
        qp.EnQueue(20);
        qp.EnQueue(30);
        qp.DQueue();
        qp.EnQueue(40);
        qp.DQueue();
        dis d = () -> {
           while(qp.head != null){
               System.out.print(qp.head.value+" ");
               qp.head = qp.head.next;
           }
       };
        d.display();
    }
}
class QueueOperations {
    LinkedNode head;
    LinkedNode tail;
    public void EnQueue(int nodeValue) {
        LinkedNode node = new LinkedNode();
        if(tail == null){
            node.value = nodeValue;
            node.next = null;
            head = node;
            tail = node;
        }else if(tail.next == null) {
            node.value = nodeValue;
            node.next = null;
            tail.next = node;
        }else{
            tail = tail.next;
            EnQueue(nodeValue);
        }
    }
    public void DQueue(){
        LinkedNode temp = head;
        head = head.next;
        temp.next = null;
    }
}