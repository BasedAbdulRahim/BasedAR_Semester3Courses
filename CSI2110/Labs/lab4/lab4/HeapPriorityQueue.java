/**
 * Array Heap implementation of a priority queue
 * @author Lachlan Plant
 */
public class HeapPriorityQueue<K extends Comparable,V> implements PriorityQueue<K ,V> {
    
    private Entry[] storage; //The Heap itself in array form
    private int tail;        //Index of last element in the heap
    
    /**
    * Default constructor
    */
    public HeapPriorityQueue(){
		this(100);
    }
    
    /**
    * HeapPriorityQueue constructor with max storage of size elements
    */
    public HeapPriorityQueue(int size){
		tail = -1;
		storage = new Entry[size];
    }
    
    /****************************************************
     * 
     *             Priority Queue Methods
     * 
     ****************************************************/
    
    /**
    * Returns the number of items in the priority queue.
    * O(1)
    * @return number of items
    */
    public int size(){
        return tail + 1;
    }

    /**
    * Tests whether the priority queue is empty.
    * O(1)
    * @return true if the priority queue is empty, false otherwise
    */
    public boolean isEmpty(){
        if (tail == -1) 
            return true;
        else 
            return false;
    }
    
    /**
    * Inserts a key-value pair and returns the entry created.
    * O(log(n))
    * @param key     the key of the new entry
    * @param value   the associated value of the new entry
    * @return the entry storing the new key-value pair
    * @throws IllegalArgumentException if the heap is full
    */
    public Entry<K,V> insert(K key, V value) throws IllegalArgumentException{
        if(size() < storage.length - 1){
			tail++;
			Entry<K,V> entry =  new Entry<K,V>(key,value);
			storage[tail] = entry;
			upHeap(tail);
			return entry; 
		} else {
			throw new IllegalArgumentException("Array is full");
		}
    }
    
    /**
    * Returns (but does not remove) an entry with minimal key.
    * O(1)
    * @return entry having a minimal key (or null if empty)
    */
    public Entry<K,V> min(){
        return storage[0];
    } 
    
    /**
    * Removes and returns an entry with minimal key.
    * O(log(n))
    * @return the removed entry (or null if empty)
    */ 
    public Entry<K,V> removeMin(){
		Entry<K,V> entry = min();
		swap(0,tail);
		storage[tail] = null;
		downHeap(0);
		return entry;
    }  
    
    
    /****************************************************
     * 
     *           Methods for Heap Operations
     * 
     ****************************************************/
    
    /**
    * Algorithm to place element after insertion at the tail.
    * O(log(n))
    */
    private void upHeap(int location) {
        if(storage[location].getKey().compareTo(storage[parent(location)].getKey()) < 0) {
			swap(location, parent(location));
			upHeap(parent(location));
		} 			 
    }
    
    /**
    * Algorithm to place element after removal of root and tail element placed at root.
    * O(log(n))
    */
    private void downHeap(int location){
		int lc = location*2 + 1;
		int rc = location*2 + 2;
		int lowest = lc;
		if(storage[rc].getKey().compareTo(storage[lowest].getKey())< 0) 
			lowest = rc;
        if(storage[location].getKey().compareTo(storage[lowest].getKey()) < 0) {
			swap(location, lowest);
			upHeap(lowest);
		}            
    }
    
    /**
    * Find parent of a given location,
    * Parent of the root is the root
    * O(1)
    */
    private int parent(int location){
        return location/2 + location%2/2;
    }
    
   
    /**
    * Inplace swap of 2 elements, assumes locations are in array
    * O(1)
    */
    private void swap(int location1, int location2){  
		Entry<K,V> temp = storage[0];
		storage[0] = storage[tail];
		storage[tail] = temp;
    }
    
}
