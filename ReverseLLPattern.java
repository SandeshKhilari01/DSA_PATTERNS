import java.util.*;

class ReverseLLPattern {
    static class Node {
        int data; 
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void append(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new_node;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
    }

    public Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) { // Corrected condition
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; // Move to the next node
        }
        return prev; // New head of the reversed list
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " "); 
            temp = temp.next;
        }
        System.out.println(); 
    }

    public static void main(String args[]) {
        ReverseLLPattern list = new ReverseLLPattern();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.head = list.reverseList(list.head);
        list.printList(list.head);
    }
}