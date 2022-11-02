public class MyNode <T>{
    //Use generic type T

    // Instance variables - a data
    // payload and a reference to the next node
    private T data;
    private MyNode next;

    public MyNode(T dataValue){
        // Constructors to create a new Node
        data = dataValue;
        next = null;
    }

    //Public Methods to:
    //Return data payloads
    //Set the data payload
    //Return the next node reference
    //Set the next node reference
    public T getData(){
        return data;
    }
    public void setData(T dataValue){
        data = dataValue;
    }
    public MyNode<T> getNext() {
        return next;
    }
    public void setNext(MyNode<T> nextNode){
        next = nextNode;
    }

    public static void main(String[] args){
        MyNode<Integer> node1 = new MyNode<Integer>(1);
        MyNode<Integer> node2 = new MyNode<Integer>(2);
        MyNode<Integer> node3 = new MyNode<Integer>(3);

        node1.setNext(node2);
        node2.setNext(node3);

        System.out.println("Value of node1 is " + node1.getData());
        System.out.println("Value of node2 is " + node1.getNext().getData());
        System.out.println("Value of node3 is " + node1.getNext().getNext().getData());
    }
}
