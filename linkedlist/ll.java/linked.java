import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkList {
        Node head = null;
        Node last = null;

        // insertion at end
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                last.next = temp;
            }
            last = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;

            }
            return count;
        }

        void insertAtBeg(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                last = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAt(int index, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (index == size()) {
                insertAtEnd(val);
                return;
            } else if (index == 0) {
                insertAtBeg(val);
                return;
            } else if (index < 0 || index > size()) {
                System.out.println("Wrong input");
                return;
            }
            for (int i = 0; i < index - 1; i++) { // for(int i = 1 ; i < = index - 1 ; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        void getAt(int idx){
            Node temp = head;
            for(int i = 1; i <= idx; i++){
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
        void deleteAt(int idx){
            Node temp = head;
            Node prev = null;
            if(idx == 1 || idx == 0){
                head = head.next;
                return;
            }
            for(int i = 1; i < idx; i++){
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            temp.next = null;
        }

    }

    public static void main(String[] args) {
        linkList ll = new linkList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
       // ll.insertAt(2, 10);
        ll.getAt(0);
        ll.deleteAt(4);
        ll.display();
        System.out.println("Size of Linked list: " + ll.size());

    }
}