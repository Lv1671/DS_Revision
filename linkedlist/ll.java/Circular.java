// singly circular linkedlist
import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            
        }
    }
    public static class CircularList{
        Node head = null;
        Node tail = null;
        
        void insertAtend(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
                
            }else{
                tail.next = temp;
                tail = temp;
            }
            tail.next = head;
        }
        void insertAthead(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            tail.next = head;
        }
         void insertAtTail(int val){
            Node temp = new Node(val);
            Node t = head;
            
            while(t.next!= head){
                t = t.next;
            }
            temp.next = head;
            t.next = temp;
            
        }
        void display(){
            Node temp = head;
            do{
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            while(temp != head);
                
            
        }
    }
    public static void main(String [] args){
        CircularList ll = new CircularList();
        int n = scn.nextInt();
        for(int i = 0; i < n; i++){
            ll.insertAtend(scn.nextInt());
        }
       // ll.insertAthead(100);
        ll.insertAtTail(101);
        ll.display();
    }
}