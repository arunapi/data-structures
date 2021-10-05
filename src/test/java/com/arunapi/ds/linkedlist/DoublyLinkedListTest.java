package com.arunapi.ds.linkedlist;

import com.arunapi.ds.linkedlist.DoublyLinkedListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {

    @Test
    public void addHead(){
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.addHead(20);
        //assert that the value is added as head
        assertEquals(20,doublyLinkedList.head.value);
        // tail must be same value since the size is 1
        //tail is null only if the list is empty
        // question wont that result in endless loop?
        assertEquals(20,doublyLinkedList.tail.value);
        assertEquals(1, doublyLinkedList.size);

    }

    @Test
    public void addTail(){
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.addTail(20);
        //assert that the value is added as head
        assertEquals(20,doublyLinkedList.head.value);
        // tail must be same value since the size is 1
        //tail is null only if the list is empty
        // question wont that result in endless loop?
        assertEquals(20,doublyLinkedList.tail.value);
        assertEquals(1, doublyLinkedList.size);

        doublyLinkedList.addTail(30);
        //assert that the value is added as head
        assertEquals(20,doublyLinkedList.head.value);
        // tail must be same value since the size is 1
        //tail is null only if the list is empty
        // question wont that result in endless loop?
        assertEquals(30,doublyLinkedList.tail.value);
        assertEquals(2, doublyLinkedList.size);

        doublyLinkedList.addTail(10);
        //assert that the value is added as head
        assertEquals(20,doublyLinkedList.head.value);
        // tail must be same value since the size is 1
        //tail is null only if the list is empty
        // question wont that result in endless loop?
        assertEquals(10,doublyLinkedList.tail.value);
        assertEquals(3, doublyLinkedList.size);
    }

    @Test
    public void find(){
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addTail(10);
        doublyLinkedList.addTail(30);
        doublyLinkedList.addTail(20);
        doublyLinkedList.addTail(40);

        DoublyLinkedListNode node = doublyLinkedList.find(40);
        assertEquals(40,node.value);
    }

    @Test
    public void contains(){
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addTail(10);
        doublyLinkedList.addTail(30);
        doublyLinkedList.addTail(20);
        doublyLinkedList.addTail(40);

        boolean exists = doublyLinkedList.contains(30);
        assertEquals(true,exists);
    }

    @Test
    public void remove(){
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addTail(10);
        doublyLinkedList.addTail(30);
        doublyLinkedList.addTail(20);
        doublyLinkedList.addTail(40);

        boolean exists = doublyLinkedList.remove(30);
        assertEquals(true,exists);
        assertEquals(3,doublyLinkedList.size);
        exists = doublyLinkedList.remove(30);
        assertEquals(false,exists);
        exists = doublyLinkedList.remove(40);
        assertEquals(true,exists);
        assertEquals(20,doublyLinkedList.tail.value);
    }

    @Test
    public void removeSingleList(){
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addTail(10);
        boolean removed = doublyLinkedList.remove(10);
        assertEquals(true,removed);
        assertEquals(0,doublyLinkedList.size);
    }
}