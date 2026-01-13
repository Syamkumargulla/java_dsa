package LinkeddLIst;

import Tryy.Main;

public class LL1 {
    public static void main(String[] args) {
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        Node head = n1;
        //   insert(head , "syam");
        update(head, 3, "E");
        insertend(head, "kumar");
        insertstart(head, "syam");
        pringt(head);
        System.out.println(leng(head));
        pp(head);


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

    public static void insertstart(Node head, String newname) {
        Node newwNode = new Node(newname);
        newwNode.next = head;
        head = newwNode;
    }

    public static void insertend(Node head, String newname) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(newname);
    }

    public static void pp(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.name);
            temp = temp.next;
            System.out.print("->");
        }

    }
}