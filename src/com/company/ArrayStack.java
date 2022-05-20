package com.company;

public class ArrayStack<T> implements StackInterface<T> {

    private final int defaultSize = 16;
    private T[] array;
    private int topIndex;

    public ArrayStack(int size) {
        array = (T[]) new Object[size];
        topIndex = 0;
    }

    public ArrayStack() {
        array = (T[]) new Object[defaultSize];
        topIndex = 0;
    }
    @Override
    public boolean isEmpty() {
        return topIndex == 0;
    }

    @Override
    public boolean isFull() {
        return topIndex == array.length;
    }

    @Override
    public T pop() throws EmptyStackException {
        if(isEmpty()) throw new EmptyStackException();
        return array[--topIndex];
    }

    @Override
    public void push(T elem) throws FullStackException {
        if(isFull()) throw new FullStackException();
        array[topIndex++] = elem;
    }

    @Override
    public T top() throws EmptyStackException {
        if(isEmpty()) throw new EmptyStackException();
        return array[topIndex-1];
    }

    @Override
    public int size() {
        return topIndex;
    }
}
