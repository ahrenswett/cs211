package Stackulator;

import java.util.EmptyStackException;

public class Stack<E>{
    private StackNode top;

    public Stack(){
    }

    public void push(E value){
        top = new StackNode(value, top);
    }

    public StackNode pop()throws EmptyStackException{
        if(this.top == null) throw new EmptyStackException();
        StackNode toPop = top;
        top = top.next;
        return toPop;
    }

    public int size(){
        if(isEmpty()) return 0;
        int size = 0;
        StackNode counter = top;
        while (counter != null){
            size++;
            counter = counter.next;
        }
        return size;
    }

//    checks to see if stack is empty
    public boolean isEmpty(){
        if(top == null)return true;
        return false;
    }

    public static void main(String[] args) {

    }
}


class StackNode<E> {
     E data;
    StackNode next;

     StackNode(E data, StackNode next) {
        this.data = data;
        this.next = next;
    }

}

