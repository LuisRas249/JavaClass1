public  interface BagInterface<T>{

    public int getCurrentSize();
    /*
    *  The number of elements currently contain in the bag
    *
    *   @return - (int) number of elements
    * */

    public boolean isEmpty();
    /*
    Test for an empty bag

    @return - (boolean) true if the number of elements is zero, false otherwise
     */

    public boolean addNewEntry(T newEntry);
    /*
    Test for space capacity in the bag and if it exists, add the new element
    and increment the number of elements in the bag

    @param(T) newEntry - The item t be added to the bag

    @return - (boolean) true if the item is added, false otherwise
     */

    public T remove();
    /*
    Remove any element from the bag, if one is available, and decrement the number of elemnts, Return the remove elemnt or null
    none is available

    @return - (T) the element removed from the bag, or null
     */

    public boolean remove(T anEntry);
    /*
    Remove the specified element from the bag, if it is present, adn decrement the number of elements

    @return - (boolean) true if the element is available, false otherwise
     */

    public void clear();
    /*
    Empty the bag - set the number of elments to zero
     */

    public int getFrequencyOf(T anEntry);
    /*
    Count how many times a given element appears in the bag

    @param (T) anEntry - the element to look for in the bag

    @return - (boolean) true if the bag contains the element, false otherwise
     */

    public T[] toArray();
    /*
    Find all elements in the bag

    @return - (T[]) an array size number of elements, containing all the contents of the bag
     */

    public void display();

}