import com.programs.LinkedNode;
import java.util.Scanner;

public class singlyLinkedList {
  public static void main(String[] args) {
      singleList sl = new singleList();
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int[] arr = new int[num];
      for(int i=0;i<num;i++) arr[i] = sc.nextInt();
      for(int i=0;i<num;i++) sl.insertLinkedList(arr[i]);
      sl.reverseLinkedList();
      while(sl.head != null){
          System.out.print(sl.head.value+" ");
          sl.head = sl.head.next;
      }
  }
}
class singleList {
    LinkedNode head;
    LinkedNode tail;

    public void createLinkedList(int nodeValue) {
        LinkedNode node = new LinkedNode();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
    }
    public void insertLinkedList(int nodeValue) {
        LinkedNode node = new LinkedNode();
        if(tail == null) createLinkedList(nodeValue);
        else if(tail.next == null){
            node.value = nodeValue;
            node.next = null;
            tail.next = node;
        }else{
            tail = tail.next;
            insertLinkedList(nodeValue);
        }
    }
    public void reverseLinkedList(){
        LinkedNode curr = head;
        LinkedNode prev = null;
        while(curr != null){
            LinkedNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }
}