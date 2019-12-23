package com.varma.DataStructures;

/**
 * Created by varma on 12/24/2019.
 */
public class LinkedListImpl {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static LinkedListImpl insert(LinkedListImpl linkedList, int data){
            Node new_node = new Node(data);
            new_node.next = null;

            if(linkedList.head == null){
                linkedList.head = new_node;
            }else{
                Node last = linkedList.head;
                while(last.next != null){
                    last = last.next;
                }
                last.next = new_node;
            }

            return linkedList;
    }

    public static void printList(LinkedListImpl list){

        Node curr_node = list.head;

        System.out.println("LinkedList : ");

        while(curr_node != null){
            System.out.println(curr_node.data+" ");
            curr_node = curr_node.next;
        }
    }

    public static void main(String args[]){
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList = insert(linkedList,1);
        linkedList = insert(linkedList,2);
        linkedList = insert(linkedList,3);
        linkedList = insert(linkedList,4);
        linkedList = insert(linkedList,5);
        linkedList = insert(linkedList,6);

        printList(linkedList);

    }

}
