package com.ps.app.leetcode.slowfastpointers;

import com.ps.app.leetcode.LinkNode;

public class LinkListCycle {

    public static <T> boolean isCyclic(LinkNode<T> head){
        LinkNode<T> slow = head;
        LinkNode<T> fast = head;
        while (fast!= null && fast.getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow == fast){
                return true;
            }
        }
        return false;

    }

    public static void main (String[] str){
        LinkNode<Integer> linkNode = new LinkNode(1);
        linkNode.setNext(new LinkNode(2));
        linkNode.getNext().setNext(new LinkNode(3));
        linkNode.getNext().getNext().setNext(new LinkNode(4));
        linkNode.getNext().getNext().getNext().setNext(new LinkNode(5));
        linkNode.getNext().getNext().getNext().getNext().setNext(new LinkNode(6));
        System.out.println(isCyclic(linkNode));

        linkNode.getNext().getNext().getNext().getNext().getNext().setNext(linkNode.getNext().getNext());
        System.out.println(isCyclic(linkNode));
        linkNode.getNext().getNext().getNext().getNext().getNext().getNext().setNext(linkNode.getNext().getNext().getNext());
        System.out.println(isCyclic(linkNode));

    }
}
