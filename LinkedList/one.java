
public class one {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; //bydefult size 0 

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
    public void add(int idx, int data){
        if(idx ==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size ++;
        Node temp = head;
        int i=0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Print List
    public void printVal() {
        if (head == null) {
            System.out.println("LL is empty!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

       
    }
    public int removeFirst(){
        if(size ==0){
            System.out.println("Ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return  Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        //prev : i=size-2
        Node prev = head;
        for(int i=0; i< size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size --;
        return val; 
    }

    public int itrSearch(int key){
        Node temp = head;
        int i=0;

        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key){
        if (head == null){
            return -1;
        }
        if ( head.data == key ){
            return 0;
        }
        int idx = helper(head, key);
        if( idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){ //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while( curr != null ){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;  
    }
    public void deleteNthfromEnd(int n){
        //calculate size 
        int sz =0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next; // remove first
            return;
        }
        //sz -n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args) {
        one ll = new one();

        ll.printVal();     // empty
        ll.addFirst(1);
        ll.printVal();     // 2
        ll.addFirst(2);
        ll.addLast(4);
        ll.add(4,3);
        ll.addLast(6);
        // ll.printVal(); 
        // //System.out.println(ll.size);
        // ll.removeFirst();
        // ll.printVal();
        // ll.removeLast();
        // ll.printVal();
        //System.out.println(ll.recSearch(3));
        //System.out.println(ll.recSearch(5));
        ll.reverse();
        ll.printVal();

    }
}