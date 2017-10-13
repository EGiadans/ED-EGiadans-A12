/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.list01;

/**
 *
 * @author Eduardo
 */
public class Queue <T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;
    
    Queue(){
        front = rear = null;
        size = 0;
    }
    
    Queue(T d){
        Node<T> node = new Node<>(d);
        front = rear = node;
        size = 1;
    }
    
    public void enqueue(T d){ //Ponemos en la fila, es decir al final
        Node<T> node = new Node<>(d);
        if (isEmpty()){
            front = rear = node;
        } else {
            rear.next = node;
            rear  = node;
            size++;
        }
    }
    
    public T dequeue(){
        if (isEmpty()){
            return null;
        } else {
            Node<T> fd = front;
            front = front.next;
            size--;
            return fd.data;
        }
    }
    
    public T getFront(){
        if (isEmpty()){
            return null;
        } else {
            return front.data;
        }
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public void clearQueue(){
        front = rear = null;
        size = 0;
    }
    
    public void showQueue(){
        System.out.print("front->");
        Node<T> f = front;
        while (f != null){
            f.print();
            f = f.next;
        }
        System.out.print("<-rear");
    }
    
    
    
    
}
