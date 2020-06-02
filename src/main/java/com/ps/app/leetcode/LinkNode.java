package com.ps.app.leetcode;

public class LinkNode<T> {

    private LinkNode next;

    private T value;

    public LinkNode(T value) {
        this.value = value;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
