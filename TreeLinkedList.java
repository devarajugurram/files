import com.programs.BinaryTreeLL;
import com.programs.BinaryTree;
public class TreeLinkedList {
    public static void main(String[] args) {
        BinaryTreeLL binary = new BinaryTreeLL();
        BinaryTree N1 = new BinaryTree();
        N1.data = "N1";
        BinaryTree N2 = new BinaryTree();
        N2.data = "N2";
        BinaryTree N3 = new BinaryTree();
        N3.data = "N3";
        BinaryTree N4 = new BinaryTree();
        N4.data = "N4";
        BinaryTree N5 = new BinaryTree();
        N5.data = "N5";
        BinaryTree N6 = new BinaryTree();
        N6.data = "N6";
        BinaryTree N7 = new BinaryTree();
        N7.data = "N7";
        BinaryTree N8 = new BinaryTree();
        N8.data = "N8";
        BinaryTree N9 = new BinaryTree();
        N9.data = "N9";
        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;
        N4.left = N6;
        N4.right = N7;
        N3.left = N8;
        N3.right = N9;
        binary.root = N1;
        binary.preOrder(binary.root);
        System.out.println();
        binary.postOrder(binary.root);
        System.out.println();
        binary.inOrder(binary.root);
        System.out.println();
        binary.levelOrder();
    }
}
