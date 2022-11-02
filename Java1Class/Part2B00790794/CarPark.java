public class CarPark<T> extends ArrayBag<T>{

    private ArrayBag<String> spaces;
    private int totalParked = 0;

    public CarPark(int size) {
        this.spaces = new ArrayBag<String>(3);
    }

    public String showAllCars() {
        return spaces.toString();
    }

    public boolean parkCar(String name) {

        // modify this method so that any name can be stored only once
        ArrayBag<T> resultSet = new ArrayBag<T>(); // declare a ArrayBag to return as the result
        T[] thisSet = this.toArray(); // convert the object BagSet to an array for easy manipulation
        T[] otherSet = anotherBagArray.toArray(); // convert the parameter ArrayBag to an array
        for (T element : thisSet) resultSet.addNewEntry(element); // Add all elements to result ArrayBag
        for (T element : otherSet) resultSet.addNewEntry(element); // Add all elements to result ArrayBag
        // - any duplicates will be rejected by the new
        // return false if a duplicate name is presented
        return this.spaces.addNewEntry(name);
    }

    public boolean removeCar(String name) {
        if (!contains(name)) return super.addNewEntry(name);
        else return false;
        // remove the car matching the name provided as a parameter
        // return false if the operation cannot be completed

      // modify this line if required
    }

    public boolean isParked(String name) {
        // return true if a car matching the name provided as a parameter is present
        // and false otherwise

        return true;    // modify this line if required
    }

    public boolean replace(String leaving, String parking) {
        // replace the car matching the "leaving" parameter by the car matching the "parking" parameter.

        // Return true if the operation can be successfully completed, false otherwise

        return true;    // modify this line if required
    }

    public int getTotalParked(ArrayBag<T> anotherSet) {
        // provide whatever code is required in other methods in this class to use the
        // instance variable "totalParked" to keep a count
        String totalParked ="";
        // of all instances of cars parked in the car park
        if (getCurrentSize() != ArrayBag.getCurrentSize()) return false;
        else {
            T[] thisSet = toArray();
            for (T element : thisSet)
                if (!ArrayBag.contains(element))return false;
        }
        // NOTE: YOU SHOULD NOT NEED TO CHANGE THIS METHOD
        return this.totalParked;
    }

}