import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static class Node{
        Node prev;
        int val;
        Node next;
        
        Node(int val){
            this.val = val;
        }
    }
    public static class Linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtLast(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
                
                
            }else{
                tail.next = temp;
                temp.prev = head;
                tail = temp;
            }
           
        }
        void insertAthead(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
        }
        void insertAt(int pos, int val){
            Node t = head;
            Node temp = new Node(val);
            if(head == null){
                insertAthead(val);
            }else{
                for(int i = 1; i <= pos-1; i++){
                    t = t.next;
                }
                Node r = t.next;
                t.next = temp;
                temp.prev = t;
                temp.next = r;
                r.prev = t;
            }
          } 
          void insertAtTail(int val){
              Node temp = head;
              Node t = new Node(val);
              
              while(temp.next != null){
                  temp = temp.next;
              }
              
               temp.next = t;
               t.prev = temp;
          }
          
          void deleteAtHead(){
              if(head == null){
                  return ;
              }else{
                  head = head.next;
                  head.prev = null;
              }
          }
         void deleteAtLast(){
             Node temp = head;
             while(temp.next.next != null){
                 temp = temp.next;
             }
             temp.next = null;
             temp = tail;
              
          }

          void deleteAt(int idx ){
            
          }
          
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args){
        Linkedlist ll = new Linkedlist();
        int n = scn.nextInt();
        for(int i = 0; i < n; i++){
            ll.insertAtLast(scn.nextInt());
        }
       // ll.insertAthead(30);
        //ll.insertAtTail(90);
        ll.insertAt(4,100);
        ll.deleteAtHead();
        ll.deleteAtLast();
        ll.display();
    }
}