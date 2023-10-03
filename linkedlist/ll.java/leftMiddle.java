import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class Linkedlist{
        Node head = null;
        Node tail = null;
        
        void insertAtlast(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }
        void findMiddle(){
            Node fast = head;
            Node slow = head;
            
            while( fast.next != null && fast.next.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println("Middle of linkedlist " + slow.data);
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args){
        Linkedlist ll = new Linkedlist();
        int n = scn.nextInt();
        for(int i = 0; i < n; i++){
            ll.insertAtlast(scn.nextInt());
        }
        ll.display();
        ll.findMiddle();
        
    }
}