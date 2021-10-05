package com.arunapi.ds.linkedlist;

public class DoublyLinkedListNode {
    public int value;
    //tail
    public DoublyLinkedListNode next;
    //head
    public DoublyLinkedListNode previous;

    public DoublyLinkedListNode(int value, DoublyLinkedListNode prev, DoublyLinkedListNode next){
        this.value = value;
        this.next = next;
        this.previous = prev;
    }

}
