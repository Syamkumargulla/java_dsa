package LinkeddLIst;

import org.w3c.dom.Node;

public class L1 {
    private Node head;
    private Node tail;
    private int size;

    public L1() {
        this.size = 0;
    }
    public void insert(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            head  = tail;
        }
        size += 1;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }


        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
