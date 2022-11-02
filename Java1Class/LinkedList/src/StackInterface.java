public interface StackInterface<T> {

    public void push(T newEntry);
    /*
    Add a new entry to the top of the stack @param (T) new Entry
    - the entry to be added
    */
    public T pop();
    /*
     Remove an entry from the top of the stack
     throw EmptyStackException if called on an empty stack
     @return <T> - The value that was on top of the stack
     */
    public T peek();
    /*
     Return but don't remove the entry on top of the stack
     throw EmptyStackException if called on an empty stack
     @return <T> -The value at the top of the stack.
     */
    public boolean isEmpty();
    /*
     Return true if the stack is empty, false otherwise
     */
    public void clear();
    /*
     remove all entries from the stack
     */
}
