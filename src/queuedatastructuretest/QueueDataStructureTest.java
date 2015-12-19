/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuedatastructuretest;

/**
 *
 * @author hea113
 */
public class QueueDataStructureTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueDataStructure qds = new QueueDataStructure();
        // TESTING INTEGERS
        System.out.printf("Testing Integers:%n%n");
        int count = 1;
        for(int i=0;i<3;i++){
            qds.enqueue(count);
            System.out.printf("After adding object %d the queue is %n", count);
            count++;
            qds.printQueue();
        }
        System.out.println();
        count = 1;
        for(int i=0;i<2;i++){
            qds.dequeue();
            System.out.printf("After removing object %d the queue is %n", count);
            count++;
            qds.printQueue();
        }
        System.out.println("");
        count=1;
        for(int i=1;i<3;i++){
            qds.enqueue(i);
            System.out.printf("After adding object %d the queue is %n", count);
            count++;
            qds.printQueue();
        }
        System.out.printf("%nThe front of the queue is %d %n", qds.front());
        qds.removeAll();
        System.out.println();
        
        
        
        //TESTING DOUBLES!
        System.out.printf("Testing Doubles:%n%n");
        count = 1;
        for(int i=0;i<3;i++){
            qds.enqueue(count + .35);
            System.out.printf("After adding object %d the queue is %n", count);
            count++;
            qds.printQueue();
        }
        System.out.println();
        count = 1;
        for(int i=0;i<2;i++){
            qds.dequeue();
            System.out.printf("After removing object %d the queue is %n", count);
            count++;
            qds.printQueue();
        }
        System.out.println("");
        count=1;
        for(int i=1;i<3;i++){
            qds.enqueue(i+.67);
            System.out.printf("After adding object %d the queue is %n", count);
            count++;
            qds.printQueue();
        }
        System.out.printf("%nThe front of the queue is %f %n", qds.front());
        qds.removeAll();
        System.out.println();
        
        
        // TESTING STRINGS
        System.out.printf("Testing Strings:%n%n");
        qds.enqueue("hozaifa");
        System.out.println("After adding an object");
        qds.printQueue();
        System.out.println("");
        qds.enqueue("john");
        System.out.println("After adding an object");
        qds.printQueue();
        System.out.println("");
        qds.enqueue("kathy");
        System.out.println("After adding an object");
        qds.printQueue();
        System.out.println("");
        qds.dequeue();
        System.out.println("After removing an object");
        qds.printQueue();
        System.out.println("");
        qds.dequeue();
        System.out.println("After removing an object");
        qds.printQueue();
        System.out.println("");
        qds.enqueue("Hello");
        System.out.println("After adding an object");
        qds.printQueue();
        System.out.println("");
        qds.enqueue("welcome");
        System.out.println("After adding an object");
        qds.printQueue();
        System.out.println("");
        System.out.printf("The front of the queue is %s", qds.front());
        System.out.println("");
        qds.removeAll();
        qds.printQueue();
        
        
    }
    
}
