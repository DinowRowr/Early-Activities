package com.mycompany.circularlinkedlist;
import java.util.Iterator;

/**
 *
 * @author Dinothelo P. Quiroga
 * 
 */
public class CircularLinkedList<E> extends main {
    private class Node{
        E value;
        Node next;
        Node prev;
    }
    Node head;
    int size;
    Node finger;
    
    public CircularLinkedList() {
        this.head = new Node();
        this.head.next = head;
        this.head.prev = head;
        this.size = 0;
        this.finger = head;
    }
    
    public void add(int index, E value) {
        Node cur = (index == size) ? head:getNodeAt(index);
        Node newNode = new Node();
        newNode.value = value;
        newNode.prev = cur.prev;
        newNode.next = cur;
        newNode.prev.next = newNode;
        newNode.next.prev = newNode;
        finger = newNode;
        this.size++;
    }
    
    public E remove(int index) {
        Node toRemove = getNodeAt(index);
        
        toRemove.prev.next = toRemove.next;
        toRemove.next.prev = toRemove.prev;
        finger = toRemove.prev;
        toRemove.prev = null;
        toRemove.next = null;
        this.size--;
        return toRemove.value;
    }

    public int indexOf(E value){
        Node itr = this.head.next;
        int i = 0;
        while(itr != head){
            if(itr.value.equals(value)){
                finger = itr;
                return i;
            }
            itr = itr.next;
            i++;
        }
        return -1;
    }
    
    public boolean contains(E value){
        return indexOf(value) != -1;
    }
    
    public E get(int index){
        finger = getNodeAt(index);
        return finger.value;
    }
    public E set(int index, E value){
        Node cur = getNodeAt(index);
        E oldValue = cur.value;
        cur.value = value;
        finger = cur;
        return oldValue;
    }
    public void add(E value){
        add(size, value);
    }    
    
    public boolean remove(E value){        
        int index = indexOf(value);
        
        if(index == -1){
            return false;
        }
        remove(index);
        return true;
    }
    
    public int size(){
        return this.size;
    }
    
    public void clear(){
        this.size = 0;
        this.head.next = head;
        this.head.prev = head;
        finger = head;
    }
    
    public boolean isEmpty(){
        return this.size == 0;
    }
    
    public int indexOfBookmark(){
        return indexOf(this.finger.value);
    }

    public E getBookmark(){
        return this.finger.value;
    }
    
    @Override
    public String toString() {
        StringBuilder tmp = new StringBuilder("[");

        for (Node cur = head.next; cur != head; cur = cur.next) {
            tmp.append(cur.value).append(", ");
        }

        if (tmp.length() > 1) {
            tmp = tmp.delete(tmp.length() - 2, tmp.length());
        }

        return tmp.append("]").toString();
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node cur = head;

            @Override
            public boolean hasNext() {
                return cur.next != head;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new IndexOutOfBoundsException();
                }
                cur = cur.next;
                return cur.value;
            }
        };
    }

    private Node getNodeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        // Variable that stores Node finger index
        int fingerIndex = indexOfBookmark();
        // Variable that stores the index that serves as a mid point between the Head Node and finger node
        int midPoint = fingerIndex/2;

        if(index >= fingerIndex || index > midPoint){
            Node itr = this.finger;
            if(index > fingerIndex ){
                for (int i = fingerIndex; i < index; i++) {
                    itr = itr.next;
                }
            }
            else if(index > midPoint ){
                for (int i = fingerIndex; i > index; i--) {
                    itr = itr.prev;
                }
            }
            return itr;
        }
        Node itr = this.head;
        for (int i = 0; i <= index; i++) {
            itr = itr.next;
        }

        return itr;
    }
}
