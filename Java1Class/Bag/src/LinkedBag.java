import javax.xml.soap.Node;
import java.util.*;
public final class LinkedBag<T> implements BagInterface<T>
{
    private MyNode<T> firstNode;
    private int numOfEntries;
    private MyNode<T> findEntry(T anEntry){
        MyNode<T> currentNode = firstNode;
        boolean found = false;
        while (!found && currentNode != null){
            if (currentNode.getData().equals(anEntry)) found = true;
            else currentNode = currentNode.getNext();
        }
        if (found) return currentNode; else return null;
    }

    public LinkedBag(){
        firstNode = null;
        numOfEntries = 0;
    }

    public int getCurrentSize(){
        return numOfEntries;
    }


    public boolean isEmpty(){
        return (numOfEntries == 0);
    }


    public boolean addNewEntry(T newEntry){
        MyNode<T> newNode = new MyNode<T>(newEntry);
        newNode.setNext(firstNode);
        firstNode = newNode;
        numOfEntries ++;
        return true;
    }

    public T remove(){
        if (firstNode != null){
            T result = firstNode.getData();
            firstNode = firstNode.getNext();
            numOfEntries --;
            return result;
        }else return null;
    }

    public boolean remove(T anEntry){
        MyNode<T> nodeToRemove = findEntry(anEntry);
        if (nodeToRemove == null) return false;
        nodeToRemove.setData(firstNode.getData());
        firstNode = firstNode.getNext();
        numOfEntries++;
        return true;
    }

    public void clear(){
        firstNode = null;
        numOfEntries = 0;
    }
    public int getFrequencyOf(T anEntry){
        int count = 0;
        MyNode<T> currentNode = firstNode;
        while (currentNode != null){
            if (currentNode.getData().equals(anEntry)) count++;
            currentNode = currentNode.getNext();
        }
        return count;
    }

    public boolean contains(T anEntry){
        MyNode<T> currentNode = firstNode;
        boolean found = false;
        while (!found && currentNode != null){
            if (currentNode.getData().equals(anEntry)) found = true;
            currentNode = currentNode.getNext();
        }
        return found;
    }

    public T[] toArray(){
        T[] resultArray = (T[]) new Object[numOfEntries];
        int index = 0;
        MyNode<T> currentNode = firstNode;
        while (currentNode != null){
            resultArray[index++] = currentNode.getData();
            currentNode = currentNode.getNext();
        }
        return resultArray;
    }

    public void display() {
        System.out.println("\n*** Displaying the Bag ***");
        displayChain(firstNode);
        System.out.println("\n******");
    }

    public void displayChain(MyNode<T> nodeOne){
        if (nodeOne != null){
            System.out.println(nodeOne.getData());
            displayChain(nodeOne.getNext());
        }
    }


    public String toString(){
        MyNode<T> currentNode = firstNode;
        String result = "Bag[ ";
        while (currentNode != null){
            result += currentNode.getData() + " ";
            currentNode = currentNode.getNext();
        }
        result += "]";
        return result;
    }
}
