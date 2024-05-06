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
                size++;

            }

        }

        public void addIndex(int k, int item) throws Exception
        {
            if(k ==0){
                addFirst(item);
            }
            else if(k ==size){
                addLast(item);
            }
            else{
                Node nn = new Node();
                nn.val = item;
                Node prev = getNode(k-1);
                nn.next = prev.next;
                prev.next = nn;
                size++;
            }
        }

        // access the address of particular node
        public Node getNode(int k) throws Exception{
            if(k<0 || k>=size)
            {
                throw new Exception("Baklol size dekh eska!!");
            }
            Node tmp  = head;
            for(int i=0; i<k; i++)
            {
                tmp = tmp.next;

            }
            return tmp;
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
    

