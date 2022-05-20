package com.company;

public class Main {

    public static void main(String[] args) throws FullStackException, EmptyStackException {
	    ArrayStack<Integer> arrayStack = new ArrayStack<>(4);

        arrayStack.push(8);
        arrayStack.push(16);
        arrayStack.push(32);
        arrayStack.push(64);
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
    }
}
