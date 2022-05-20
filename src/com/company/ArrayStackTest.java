package com.company;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    ArrayStack<Integer> arrayStack;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        arrayStack = new ArrayStack<>(3);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() throws FullStackException, EmptyStackException {
        assertTrue(arrayStack.isEmpty());
        arrayStack.push(11);
        assertFalse(arrayStack.isEmpty());
        arrayStack.pop();
        assertThrows(EmptyStackException.class, () -> {
            arrayStack.pop();
        });
    }

    @org.junit.jupiter.api.Test
    void isFull() throws FullStackException, EmptyStackException {
        assertFalse(arrayStack.isFull());
        arrayStack.push(11);
        arrayStack.push(11);
        arrayStack.push(11);
        assertTrue(arrayStack.isFull());
        assertThrows(FullStackException.class, () -> {
            arrayStack.push(11);
        });
    }

    @org.junit.jupiter.api.Test
    void pop() throws FullStackException, EmptyStackException {
        arrayStack.push(11);
        assertEquals(11, arrayStack.pop());
        arrayStack.push(12);
        arrayStack.push(13);
        assertEquals(13, arrayStack.pop());
    }

    @org.junit.jupiter.api.Test
    void push() throws FullStackException, EmptyStackException {
        arrayStack.push(11);
        assertEquals(11, arrayStack.pop());
        arrayStack.push(12);
        arrayStack.push(13);
        assertEquals(13, arrayStack.pop());
    }

    @org.junit.jupiter.api.Test
    void top() throws EmptyStackException, FullStackException {
        assertThrows(EmptyStackException.class, () -> {
            arrayStack.top();
        });
        arrayStack.push(11);
        assertEquals(11, arrayStack.top());
        arrayStack.push(12);
        assertEquals(12, arrayStack.top());
        arrayStack.pop();
        assertEquals(11, arrayStack.top());
    }

    @org.junit.jupiter.api.Test
    void size() throws FullStackException {
        assertEquals(0, arrayStack.size());
        arrayStack.push(11);
        arrayStack.push(11);
        assertEquals(2, arrayStack.size());
    }
}