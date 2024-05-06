package LinkedList;

public class add_client {
    public static void main(String[] args) throws Exception {
        
        add_Element ll = new add_Element();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);

        ll.display();
        ll.addLast(5);
        ll.display();

        ll.addFirst(2);
        ll.display();
        ll.addIndex(3, 3);
        ll.display();
    }
    
}
