package Tryy;

public class Main {

    public static void main(String[] args) {
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        Node head = n1;
       // head = inserrtAtst(head ,  "syam");
      //inserrtAtst(head , "Syam");
      //  inserrtAtend(head , "kumar");
     head = insert(head , 8, "g");
      //  inserrtmid(head, 2, "G");

      //  pringt(head);
       // update(head , 3 , "ss");
       // System.out.println(search(head, "C" ));
       // System.out.println(leng(head));

        pringt(head);

    }
     static class Node {
        String name ;
        Node next ;
        Node(String name){
            this.name = name;
            this.next = null;
        }
    }
    public static void pringt(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.name);
            temp = temp.next;
            if(temp != null) System.out.print("--->");
        }System.out.println();
    }
    public static int leng(Node head){
        Node temp = head;
        int count =1;
        while (temp != null){
            count ++;
            temp = temp.next;

        }
        return  count;
    }
    public static  int search(Node head , String ke){
        Node temp = head;
        int index = 0;
        while (temp != null){
            if(temp.name.equals(ke)){
                return  index;
            }
            index ++;
            temp = temp.next;

        }
        return  -1 ;
    }

    public static void update(Node head , int index , String newname){
       Node temp = head;
        for (int i = 0; i < index ; i++) {
            temp = temp.next;
        }
        temp.name = newname;
       // System.out.print(temp.name);
    }
    public static void inserrtAtend(Node head , String newnode){
       Node temp = head;
       while (temp.next != null ){
           temp = temp.next;
       }
       System.out.println(temp.name);
      temp.next = new Node(newnode);

    }

    public static Node inserrtAtst(Node head , String newnodee){

        Node newNode = new Node(newnodee);
        newNode.next = head;
        return  newNode;
    }
    public static void inserrtmid(Node head , int index,String newnodee) {
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node n6 = new Node(newnodee);
        Node nextt = temp.next;
        temp.next = n6;
        n6.next = nextt;

    }
    public static Node insert(Node head , int index,String newnodee) {
        if (index == 0) return inserrtAtst(head, newnodee);

        Node temp = head;

        for (int i = 0; i < index; i++) {
            if(temp == null){
                System.out.println("index is > length of linked list");
                return head;
            }
            temp = temp.next;
        }
        Node n6 = new Node(newnodee);
        Node nextt = temp.next;
        temp.next = n6;
        n6.next = nextt;
        return head;
    }

}
