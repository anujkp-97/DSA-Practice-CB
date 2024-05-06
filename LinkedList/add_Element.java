package LinkedList;

public class add_Element {

    class Node{
         int val;
         Node next;
    }
        private int size;
        private Node head;
        private Node tail;

        public void addFirst(int item)
        {
            Node nn= new Node();
            nn.val = item;

            if(size ==0){
                head =nn;
                tail =nn;
                size++;
            }else{
                nn.next = head;
                head = nn;
            }
        }
        // add last

        public void addLast(int item)
        {
            if(size ==0){
                addFirst(item);
            }else{
                 Node nn = new Node();
                nn.val = item;
                tail.next = nn;
                tail = nn;

            }

        }

        // display
        public void display(){
            Node tmp;
            tmp = head;

            while(tmp !=null)
            {
                System.out.print(tmp.val+"-->");
                tmp = tmp.next;
            }
            System.out.println(".");
        }

    }
    

