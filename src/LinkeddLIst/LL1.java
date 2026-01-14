package LinkeddLIst;

import Tryy.Main;

public class LL1 {
    public static void main(String[] args) {
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n5 = new Node("E");
        n1.next = n2;
        n2.next = n3;
        n3.next = n5;
        Node head = n1;


       // update(head, 3, "E");
       head = insert(head ,0, "D");
       // insertend(head, "kumar");
      //  head =  insertstart(head , "syam");

       // insertstart(head, "syam");
       // System.out.println(leng(head));
        pringt(head);


    }

    static class Node {
        String name;
        Node next;

        Node(String name) {
            this.name = name;
            this.next = null;
        }
    }

    public static void pringt(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.name);
            temp = temp.next;
            if (temp != null) System.out.print("--->");
        }
        System.out.println();
    }

    public static int leng(Node head) {
        Node temp = head;
        int count = 1;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return count;
    }

    public static void update(Node head, int index, String newname) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.name = newname;
    }

    public static Node insertstart(Node head, String newname) {
        Node newwNode = new Node(newname);
        newwNode.next = head;
        return  newwNode;
    }
    public  static Node  insert(Node head , int  index , String newname){

        if(index == 0) {
           return insertstart(head , newname);
        }
        Node temp = head;
        for (int i = 0; i <index -1 ; i++) {
            temp = temp.next;
        }
        Node n4  = new Node(newname);
        n4.next = temp.next;
        temp.next = n4;
        return head ;
    }




    public static void insertend(Node head, String newname) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(newname);
    }



}