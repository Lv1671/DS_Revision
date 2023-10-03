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
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        
        void insertAtLast(int data){
            Node temp = new Node(data);\
            if(head == null){
                head = temp;
                
            }else{
                tail.next = temp;
            }
            tail = temp;
        }void insertAtbegin(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
                
            }
        }
        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count ;
        }
        void delete(int idx){
            Node temp = head;
            if(idx == size()){
                temp.data = null;
                temp.next = null;
                return;
            }
            for(int i = 1; i <= idx - 1; i++){
                temp = temp.next;
            }
            temp.data = temp.next.data;
            temp.next = temp.next.next;
        }
    }
} {
    
}
