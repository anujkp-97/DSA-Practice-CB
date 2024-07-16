package Tree;

import java.util.Scanner;

/*
 *                  5
 *                /    \
 *               3      8
 *              /        \
 *             9         11
 */
public class BinaryTree {

    /* inner class  */

    class Node{
        int val;
        Node left;
        Node right;
    }

    private Node root;

    Scanner sc = new Scanner(System.in);

    public BinaryTree(){

        root = CreateTree();
    }
    private Node CreateTree(){
        int item = sc.nextInt();
        Node nn = new Node();

        nn.val = item;
        boolean hlc = sc.nextBoolean();
        if(hlc){
            nn.left = CreateTree();
        }

        boolean hrc = sc.nextBoolean();
        if(hrc){
            nn.right = CreateTree();
        }

        return nn;
        
    }
    public void Display(){
        Display(root);
    }

    private void Display(Node nn){
        if(nn == null) return;
        String s ="";
        s = "<--"+ s + nn.val + "-->";
        
        if(nn.left != null){
            s = nn.left.val + s;

        }else{
            s = "." + s;
        }

        if(nn.right != null){
            s = s + nn.right.val ;
        }else{
            s = s +".";
        }

        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }

    public int max(){
        return max(this.root);
    }

    private int max(Node node){

        // base case
        if(node == null){
            return Integer.MIN_VALUE;
        }

        int lmax = max(node.left);
        int rmax = max(node.right);

        return Math.max(node.val, Math.max(lmax, rmax));
    }

    public int min(){
        return min(this.root);
    }
    
    private int min(Node node){
        if(node == null){
            return Integer.MAX_VALUE;
        }

        int lmin = min(node.left);
        int rmin = min(node.right);

        return Math.min(node.val, Math.min(lmin, rmin));
    }

    //find

    public boolean find(int item){
        return find(root, item);
    }

    private boolean find(Node node, int item){
        if(node == null){
            return false;
        }

        if(node.val == item){
            return true;
        }

        boolean l = find(node.left, item);
        boolean r = find(node.right, item);

        return l || r;
    }

    // height
    public int ht(){
        return ht(root);
    }

    private int ht(Node node){
        if(node == null){
            return -1;
        }

        int lh = ht(node.left);
        int rh = ht(node.right);

        return Math.max(lh ,rh) + 1;
    }

    // pre-order traversal

    public void preOrder(){
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print (node.val +" ");

        preOrder(node.left);
        preOrder(node.right);

    }

    // In-Order

    public void inOrder(){
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val +" ");
        inOrder(node.right);

   }

   // post - order

   
   public void postOrder(){
    postOrder(root);
    System.out.println();
}

private void postOrder(Node node){
    if(node == null){
        return;
    }
    inOrder(node.left);
   
    inOrder(node.right);
    System.out.print(node.val +" ");

}
    
}
