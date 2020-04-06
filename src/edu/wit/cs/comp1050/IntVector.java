package edu.wit.cs.comp1050;

import java.util.List;

//TODO: document this class
public class IntVector {
	
	/**
	 * Copies the first n values from
	 * src to dest
	 * 
	 * @param src source array (assumed to be large enough)
	 * @param dest destination array (assumed to be large enough)
	 * @param n how many values to copy
	 * @return destination array
	 */
	public static int[] copyTo(int[] src, int[] dest, int n) {
		return new int[] {}; // replace with your code
	}
	
	/**
	 * Computes new capacity when adding to the size:
	 * if enough capacity, return the current capacity;
	 * otherwise repeatedly double the capacity
	 * until enough (if capacity is 0, "doubling" it
	 * results in 1)
	 * 
	 * @param capacity current capacity
	 * @param size current size
	 * @param toAdd elements to add
	 * @return new capacity
	 */
	public static int doubleIfNeeded(int capacity, int size, int toAdd) {
		return 0; // replace with your code
	}
	
	//
	
	/**
	 * Initialize with capacity=10, size=0
	 */
	public IntVector() {
		// replace with your code
	}
	
	/**
	 * Initialize with size=0 and
	 * the supplied initial capacity (0
	 * if negative)
	 * 
	 * @param initCapacity initial capacity
	 */
	public IntVector(int initCapacity) {
		// replace with your code
	}
	
	/**
	 * Initialize with provided initial size,
	 * all of which have the same initial value.
	 * Capacity should be same as size.
	 * (0 if supplied invalid size.)
	 * 
	 * @param initSize initial size
	 * @param initValue initial value of all elements
	 */
	public IntVector(int initSize, int initValue) {
		// replace with your code
	}
	
	/**
	 * Initializes the size,
	 * capacity, and values
	 * via a source array
	 * (0 if null)
	 * 
	 * @param source initial contents
	 */
	public IntVector(int[] source) {
		// replace with your code
	}
	
	/**
	 * [e_0, e_1, ... e_size] 
	 * 
	 * @return string representation
	 */
	@Override
	public String toString() {
		return ""; // replace with your code
	}
	
	/**
	 * Returns true if supplied
	 * object is also an IntVector
	 * and has the same size/contents
	 * (independent of capacity)
	 * 
	 * @param o other object
	 * @return true if same contents
	 */
	@Override
	public boolean equals(Object o) {
		return false; // replace with your code
	}
	
	/**
	 * Returns true if supplied
	 * index is valid:
	 * 0 <= index < size
	 * 
	 * @param index index to check
	 * @return true if valid index
	 */
	public boolean validIndex(int index) {
		return false; // replace with your code
	}
	
	/**
	 * Gets the current size
	 * 
	 * @return current size
	 */
	public int getSize() {
		return 0; // replace with your code
	}
	
	/**
	 * Returns true if empty
	 * 
	 * @return true if size is 0
	 */
	public boolean isEmpty() {
		return false; // replace with your code
	}
	
	/**
	 * Returns current capacity
	 * 
	 * @return current capacity
	 */
	public int getCapacity() {
		return 0; // replace with your code
	}
	
	/**
	 * Gets the element at supplied
	 * index, null if invalid
	 * index
	 * 
	 * @param index desired index
	 * @return corresponding element, null if invalid index
	 */
	public Integer get(int index) {
		return null; // replace with your code
	}
	
	/**
	 * Returns an array with
	 * the current contents
	 * 
	 * @return array with current elements
	 */
	public int[] toArray() {
		return new int[] {}; // replace with your code
	}
	
	/**
	 * Changes the value of an element
	 * 
	 * @param index index to change
	 * @param value value to set
	 * @return new value, null if invalid index
	 */
	public Integer set(int index, int value) {
		return null; // replace with your code
	}
	
	/**
	 * Reverses the contents
	 * 
	 * [1, 2, 3] => [3, 2, 1]
	 */
	public void reverse() {
		// replace with your code
	}
	
	/**
	 * Makes sure there is room for
	 * at least n elements. If greater
	 * than current capacity, n becomes
	 * the new capacity.
	 * 
	 * @param n desired minimum capacity
	 */
	public void ensureCapacity(int n) {
		// replace with your code
	}
	
	/**
	 * Adds an element to the end.
	 * 
	 * Capacity should increase according
	 * to the doubling policy (see
	 * doubleIfNeeded).
	 * 
	 * @param value value to add
	 * @return value added
	 */
	public int add(int value) {
		return 0; // replace with your code
	}
	
	/**
	 * Add a value at a supplied index.
	 * If not the end, all values from
	 * the index are shifted right.
	 * 
	 * Capacity should increase according
	 * to the doubling policy (see
	 * doubleIfNeeded).
	 * 
	 * If invalid index, no change is made.
	 * 
	 * @param index index at which to insert
	 * @param value value to insert
	 * @return value added, null if invalid index
	 */
	public Integer add(int index, int value) {
		return null; // replace with your code
	}
	
	/**
	 * Add a list of values to the end.
	 * 
	 * Capacity should increase according
	 * to the doubling policy (see
	 * doubleIfNeeded).
	 * 
	 * @param values list of values to add in order
	 */
	public void addAll(List<Integer> values) {
		// replace with your code
	}
	
	/**
	 * Add a list of values at a supplied index.
	 * If not the end, all values from index
	 * are shifted right.
	 * 
	 * Capacity should increase according
	 * to the doubling policy (see
	 * doubleIfNeeded).
	 * 
	 * If invalid index, no change is made.
	 * 
	 * @param index
	 * @param values
	 */
	public void addAll(int index, List<Integer> values) {
		// replace with your code
	}
	
	/**
	 * Sets the size to 0
	 * without changing
	 * capacity.
	 */
	public void clear() {
		// replace with your code
	}
	
	/**
	 * Reduces the capacity to
	 * the current size
	 */
	public void trimToSize() {
		// replace with your code
	}
	
	/**
	 * Remove the last element in the list
	 * 
	 * @return removed element, null if was empty
	 */
	public Integer removeLast() {
		return null; // replace with your code
	}
	
	/**
	 * Remove element at supplied index.
	 * All elements after are shifted
	 * left.
	 * 
	 * @param index index to remove
	 * @return removed value, null if invalid index
	 */
	public Integer remove(int index) {
		return null; // replace with your code
	}
	
	/**
	 * Removes the first element that has
	 * the supplied value.
	 * 
	 * @param value value to remove
	 * @return value, null if not found
	 */
	public Integer removeFirst(int value) {
		return null; // replace with your code
	}
	
	/**
	 * Removes all elements that pass
	 * a supplied test
	 * 
	 * @param p test to apply to each element
	 * @return number of elements removed
	 */
	public int removeAllIf(IntTester p) {
		return 0; // replace with your code
	}
	
	/**
	 * Removes all elements of a
	 * particular value.
	 * 
	 * @param value value to remove
	 * @return number of elements removed
	 */
	public int removeAll(int value) {
		return 0; // replace with your code
	}
}
