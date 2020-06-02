package com.ps.app.leetcode.slowfastpointers;

import com.ps.app.leetcode.LinkNode;

public class FindStartOfCycle {

    public  static <T> T findStartOfCycle (LinkNode<T> head){
        LinkNode<T> slow = head;
        LinkNode<T> fast = head;
        while (fast!= null && fast.getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow == fast){
                break;
            }
        }
        int i = 0;
        LinkNode current = slow;
        do{
            current = current.getNext();
            i++;
        }while(slow != current);

        fast = head;
        slow = head;
        for(int j =1 ; j <= i ; j++  ){
            fast = fast.getNext();
        }

        while(slow != fast){
            slow = slow.getNext();
            fast = fast.getNext();
        }
        return fast.getValue();
    }



    public static void main (String[] str){
        LinkNode<Integer> head = new LinkNode(1);
        head.setNext(new LinkNode(2));
        head.getNext().setNext(new LinkNode(3));
        head.getNext().getNext().setNext(new LinkNode(4));
        head.getNext().getNext().getNext().setNext(new LinkNode(5));
        head.getNext().getNext().getNext().getNext().setNext(new LinkNode(6));
        head.getNext().getNext().getNext().getNext().getNext().setNext(head.getNext().getNext());
        System.out.println(findStartOfCycle(head));


    }
}
