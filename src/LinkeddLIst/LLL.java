package LinkeddLIst;

public class LLL {


        // ✅ NEW: static head (global)
        static Node head;

        public static void main(String[] args) {

            Node n1 = new Node("A");
            Node n2 = new Node("B");
            Node n3 = new Node("C");
            Node n4 = new Node("D");

            n1.next = n2;
            n2.next = n3;
            n3.next = n4;

            // ❌ OLD (local head)
            // Node head = n1;

            // ✅ NEW (assign to static head)
            head = n1;

            // ❌ OLD
            // head = inserrtAtst(head ,  "syam");

            // ❌ OLD
            // inserrtAtst(head , "Syam");

            // ❌ OLD
            // inserrtAtend(head , "kumar");

            // ❌ OLD
            // head = insert(head , 8, "g");

            // ✅ NEW (no head passing)
            insert(5, "g");

            // ❌ OLD
            // inserrtmid(head, 2, "G");

            // ❌ OLD
            // pringt(head);

            // ❌ OLD
            // update(head , 3 , "ss");

            // ❌ OLD
            // System.out.println(search(head, "C" ));

            // ❌ OLD
            // System.out.println(leng(head));

            // ❌ OLD
            // pringt(head);

            // ✅ NEW
            pringt();
        }

        static class Node {
            String name;
            Node next;

            Node(String name){
                this.name = name;
                this.next = null;
            }
        }

        // ❌ OLD
        // public static void pringt(Node head){

        // ✅ NEW
        public static void pringt(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.name);
                temp = temp.next;
                if(temp != null) System.out.print("--->");
            }
            System.out.println();
        }

        // ❌ OLD
        // public static int leng(Node head){

        // ✅ NEW
        public static int leng(){
            Node temp = head;
            int count = 1;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }

        // ❌ OLD
        // public static int search(Node head , String ke){

        // ✅ NEW
        public static int search(String ke){
            Node temp = head;
            int index = 0;
            while (temp != null){
                if(temp.name.equals(ke)){
                    return index;
                }
                index++;
                temp = temp.next;
            }
            return -1;
        }

        // ❌ OLD
        // public static void update(Node head , int index , String newname){

        // ✅ NEW
        public static void update(int index , String newname){
            Node temp = head;
            for (int i = 0; i < index ; i++) {
                temp = temp.next;
            }
            temp.name = newname;
        }

        // ❌ OLD
        // public static void inserrtAtend(Node head , String newnode){

        // ✅ NEW
        public static void inserrtAtend(String newnode){
            Node temp = head;
            while (temp.next != null ){
                temp = temp.next;
            }
            temp.next = new Node(newnode);
        }

        // ❌ OLD
        // public static Node inserrtAtst(Node head , String newnodee){

        // ✅ NEW
        public static void inserrtAtst(String newnodee){
            Node newNode = new Node(newnodee);
            newNode.next = head;
            head = newNode;
        }

        // ❌ OLD
        // public static void inserrtmid(Node head , int index,String newnodee){

        // ✅ NEW
        public static void inserrtmid(int index,String newnodee) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            Node n6 = new Node(newnodee);
            Node nextt = temp.next;
            temp.next = n6;
            n6.next = nextt;
        }

        // ❌ OLD
        // public static Node insert(Node head , int index,String newnodee){

        // ✅ NEW
        public static void insert(int index,String newnodee) {
            // ❌ OLD
            // if (index == 0) return inserrtAtst(head, newnodee);
            // ✅ NEW
            if (index == 0) {
                inserrtAtst(newnodee);
                return;
            }
            Node temp = head;
            for (int i = 0; i < index; i++) {
                if(temp == null){
                    System.out.println("index is > length of linked list");
                    return;
                }
                temp = temp.next;
            }
            Node n6 = new Node(newnodee);
            Node nextt = temp.next;
            temp.next = n6;
            n6.next = nextt;
        }
    }


