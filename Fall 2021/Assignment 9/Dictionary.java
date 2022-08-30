//This interface is and interface for a Dictionary data structure
//The data structure allows you to insert a key (which is a String)
//and associate a value with that key

public interface Dictionary<T>{
    //This inserts the key into the Dictionary
    //... and stores the given value along with the key
    public void insert(String key, T value);

    //This looks up a key in the Dictionary.
    //If the key is found, the associated value is returned
    //Otherwise this function returns null if the key is not found
    public T lookup(String key);

}
