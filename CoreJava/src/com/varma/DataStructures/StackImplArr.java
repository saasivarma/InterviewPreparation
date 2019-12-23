package com.varma.DataStructures;

/**
 * Created by varma on 12/23/2019.
 */
public class StackImplArr {

    int size;
    int arr[];
    int top;
     StackImplArr(int size){
         this.arr=new int[size];
         this.top=-1;
         this.size = size;
    }

    public void push(int element){
        if(!isFull()){
            top++;
            arr[top] = element;
            System.out.println("Element added in Stack : " + arr[top] );
        }else{
            System.out.println("Stack is full");
        }
    }
    public int pop(){
        if(!isEmpty()){
            int returnedTop = top;
            top--;
            //arr[top] = ;
            System.out.println("returnedTop is "+ returnedTop);
            System.out.println("Element removed in Stack :"+arr[returnedTop]);
            return arr[returnedTop];
        }else{
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isFull(){
        return (size -1 == top);
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public static void main(String args[]){
        StackImplArr stackImplArr = new StackImplArr(10);
        System.out.println("Adding Elements to Stack");
        stackImplArr.push(10);
        stackImplArr.push(20);
        stackImplArr.push(30);
        stackImplArr.push(40);
        stackImplArr.push(50);
        System.out.println("Removing Elements to Stack");
        stackImplArr.pop();
        stackImplArr.pop();
        stackImplArr.pop();
        stackImplArr.pop();
        stackImplArr.pop();
    }
}
