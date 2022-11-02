import javafx.beans.binding.ListExpression;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.*;

// <T extends Comparable<T>> This makes the compateTo() method available to be used
public class PQueue<T extends Comparable<T>> implements PQueueInterface<T>{


    // Priority Queue does not need the rear pointer as it is only needed in the normal
    // enqueue operation
    private MyNode<T> front;

    public PQueue() {
        front = null;
    }

    public void enqueue(T newEntry) {
        MyNode<T> newNode = new MyNode<T>(newEntry);
        // With this method the list node is currently empty
        // The front is currently null because its empty
        // Then we add a new node in at the front 'newNode'
        if (front == null) front = newNode;
        // Otherwise we compare the data value of the front of the node
        // to the new entry
        // We use the compareTo method to compare the objects
        // We have to have our class extends the Comparable<T> interface
        // compareTo() either returns -1, 0 , +1
        // So if this value compared to this one is less than zero, this means our new entry is bigger
        else if (front.getData().compareTo(newEntry) < 0){
            // In that case we set the next pointer of the new node to the current front
            newNode.setNext(front);
            // And then set the front pointer to the current new node that is bigger than the previous node at the front
            front = newNode;
        }else {
            // This will scan the priority queue
            // Only if the new node inserted is not higher than the front node
            // this method will scan until it can find a spot that is between higher and greater that its value
            // Example: 50, 40, 30, 'new node: 25', 20, 10
            MyNode<T> currentNode = front;
            while (currentNode.getNext() != null && currentNode.getNext().getData().compareTo(newEntry) > 0)
                currentNode = currentNode.getNext();
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
        }

    }

    public T dequeue() {
        // Java does not implement EmptyQueueException
        if (front == null) return null;
        else {
            T valueToReturn = front.getData();
            front = front.getNext();
            return valueToReturn;
        }
    }

    public T getFront() {
        // Java does not implement EmptyQueueException
        if (front == null) return null;
        else return front.getData();
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public void clear() {
        front = null;
    }

    public static void main(String[] args){
        // In order to test this
        // We declare the Priority Queue as new queues of integers
        PQueue<Integer> pQueue = new PQueue<Integer>();
        //Create a new random generator
        Random random = new Random();
        Integer[] randomValues = new Integer[10];

        // Populate the random numbers that are less than 1000
        for (int i = 0; i < randomValues.length; i++){
            randomValues[i] = random.nextInt(1000);
            //  Each random number generated insert it onto our Priority Queue
            pQueue.enqueue(randomValues[i]);
        }

        System.out.println("Random Array is " + Arrays.toString(randomValues));

        // Removing the Priority queue one by one in a dec  ending order
        while (!pQueue.isEmpty()){
            System.out.println("Removing value " + pQueue.dequeue());
        }
    }

}
