package com.arunapi.ds.linkedlist;

import java.util.SplittableRandom;
import java.util.stream.Collectors;

public class DoublyLinkedList {
    DoublyLinkedListNode head;
    DoublyLinkedListNode tail;
    int size=0;
    public void addHead(int i){

        DoublyLinkedListNode newNode = new DoublyLinkedListNode(i,null,head);
        if(head!=null) {
            head.previous = newNode;
        }
        head = newNode;
        if(tail ==null){
            tail = head;
        }
        size++;
    }

    public void addTail(int i) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(i,tail,null);
        if(tail!=null){
            tail.next=newNode;
        }
        tail = newNode;
        if(head==null){
            head =tail;
        }
        size++;
    }


    public DoublyLinkedListNode find(int i) {
        DoublyLinkedListNode node = head;
        while(node!=null){
            if(node.value==i){
                return  node;
            }
            else{
                node = node.next;
            }
        }
        return null;
    }

    public boolean contains(int i) {
        if(find(i)!=null) return true;
        return false;
    }

    public boolean remove(int i) {
        DoublyLinkedListNode node = head;
        //find node to remove
        while(node!=null){
            if(node.value==i){
                break;
            }
            else{
                node = node.next;
            }
        }
        if(node==null){
            return false;
        }
        DoublyLinkedListNode previous = node.previous;
        DoublyLinkedListNode next = node.next;
        if(previous==null){
            head=next;
            if(head!=null) {
                head.previous = null;
                //clean up
                node.next=null;
            }
        }
        else if(next==null){
            previous.next=null;
            //clean up
            node.previous=null;
            tail = previous;
        }
        else {
            previous.next = next;
            next.previous = previous;
            node.previous = null;
            node.next = null;
        }
        size--;
        return true;
    }
}
