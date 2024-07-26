package SingleLinkedlist;

import org.w3c.dom.Node;

import java.util.Scanner;

public class SLLinsertion {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    SLLinsertion(){
        head = null;
        tail = null;
    }
    void insert(int val){
        Node newnode = new Node(val);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else {
            tail.next = newnode;
            tail=newnode;
        }
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SLLinsertion obj = new SLLinsertion();
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            {
                int data = sc.nextInt();
                if (data == -1)
                    break;
                obj.insert(data);
            }
        }
        System.out.println("INSERTION AT END");
        obj.display();
    }
}

