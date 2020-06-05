package com.Darty;

public class Stack {
    private final int[] array;
    private final int capacity;
    private int top;

    public Stack(int capacity) {
        this.array = new int[capacity];
        this.top = -1; // we should increment the stack over 0 so it's -1
        this.capacity = capacity;
    }

    public void push(int item) {
        if (isFull()) {
            throw new RuntimeException("Stack in full");
        }
        array[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top];
    }

    //To check the Stack is Full
    private boolean isFull() {
        return top == capacity - 1; //-1 and not 0 value bcz we started with -1
    }

    //To check the Stack is empty
    private boolean isEmpty() {
        return top == -1;
    }

}
