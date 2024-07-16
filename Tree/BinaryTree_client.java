package Tree;

import Miscellaneous.stock_span;

public class BinaryTree_client {
    public static void main(String[] args) {
        // input
        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false


        BinaryTree bt = new BinaryTree();
        bt.Display();
        System.out.println("--------------------------");
        System.out.println(bt.max());

        System.out.println("-----------------------------");
        System.out.println(bt.min());

        System.out.println("-----------------------------");
        System.out.println(bt.find(600));

        System.out.println("-----------------------------");
        System.out.println(bt.ht());

        bt.preOrder();
        bt.inOrder();
        bt.postOrder();
        
    }
    
}
