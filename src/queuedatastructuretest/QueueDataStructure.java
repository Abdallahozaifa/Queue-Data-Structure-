/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuedatastructuretest;
import java.util.ArrayList;
/**
 *
 * @author hea113
 */
public class QueueDataStructure<T>{
    //arrayList
     private ArrayList<T> newArray;
    
     // initializes the arraylist
    public QueueDataStructure(){
      newArray = new ArrayList<T>();
    }
    
    // adds an element to the rear
    public void enqueue(T object){
        newArray.add((T)object);
    }
    
    // removes an element from the front
    public void dequeue(){
        newArray.remove(0);
    }
    
    // returns the size
    public int size(){
        return newArray.size();
    }
    
    // returns the size
    public boolean isEmpty(){
        return newArray.isEmpty();
    }
    
    //retrieves the front value
    public T front(){
        return newArray.get(0);
    }
    
    // prints the queue
    public void printQueue(){
        for(int i=0; i<newArray.size();i++){
            System.out.print(newArray.get(i) + " ");
        }
        System.out.println();
    }
    
    // removes all the elements
    public void removeAll(){
        newArray.removeAll(newArray);
    }
}
