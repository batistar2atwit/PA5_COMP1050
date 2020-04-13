package edu.wit.cs.comp1050;

import java.util.List;

//TODO: document this class
public class IntVector {

	//declare local variables
	int capacity=0,size=0,index=0;
	int a[];

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
		dest = new int[n - 1];
		for (int i=0; i<src.length; i++) {
			dest[i] = src[i];
		}
		return dest;
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
		int newcapacity=0;
		if(capacity>=capacity || size >=size || (toAdd>size && toAdd>capacity)) {
			newcapacity=capacity*2;
		}
		return newcapacity;
	}

	//

	/**
	 * Initialize with capacity=10, size=0
	 */
	public IntVector() {
		this.capacity=10;
		this.size=0;
	}

	/**
	 * Initialize with size=0 and
	 * the supplied initial capacity (0
	 * if negative)
	 * 
	 * @param initCapacity initial capacity
	 */
	public IntVector(int initCapacity) {
		this.capacity=initCapacity;
		this.size=0;
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
		this.capacity=initSize;
		this.size=initSize;
		this.a=new int[size];//Intializing array with size
		for(int i=size;i>0;i--)
		{
			a[i]=initValue;
			size--;
		}
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
		capacity=size=source.length;      
	}

	/**
	 * [e_0, e_1, ... e_size] 
	 * 
	 * @return string representation
	 */
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<a.length;i++){
			sb.append("a"+""+i+""+a[i]);
		}
		return sb.toString();
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
		if(o.getClass().toString()=="IntVector")
		{
			return true;
		}
		return false;
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
		if(size==0 && index==size)
		{
			return true;
		}
		if(size>0)
		{
			if((index>=0 && index <=size - 1))
			{
				return true;
			}
		}
		return false;      
	}

	/**
	 * Gets the current size
	 * 
	 * @return current size
	 */
	public int getSize() {
		return this.size;
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
	 * @throws Exception 
	 */
	public Integer get(int index) throws Exception {
	    if(index>this.index-1)
	       {
	           throw new Exception("ArrayIndexOutOfBound");
	       }
	       if(index<0)
	       {
	           throw new Exception("Negative Value");
	       }
	       return this.a[index];  
	   }

	/**
	 * Returns an array with
	 * the current contents
	 * 
	 * @return array with current elements
	 */
	public int[] toArray() {
		  return new int[] {};
	   }

	/**
	 * Changes the value of an element
	 * 
	 * @param index index to change
	 * @param value value to set
	 * @return new value, null if invalid index
	 */
	public Integer set(int index, int value) {
		  for(int i=0;i<a.length;i++)
	       {
	           if(i==index)
	           {
	               a[index]=value;
	           }
	       }
	       return a[index];
	   }

	/**
	 * Reverses the contents
	 * 
	 * [1, 2, 3] => [3, 2, 1]
	 */
	public void reverse() {
		 int[] reverse=new int[a.length - 1];
	       int j=0;
	       for(int i=a.length - 1;i>0;i--)
	       {
	           reverse[j]=a[i];
	           j++;
	       }   
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
		 if(n<=capacity)
	       {
	           //Since minCapacity is less than
	           //the current capacity then do nothing
	       }
	       else
	       {
	           this.capacity=n;

	           for(int i=0;i<n;i++)
	           {
	               for(int j=0;j<capacity;j++)
	               {
	                   //copying all the elements
	                   //into bigger array
	                   a[i]=a[j];
	               }
	           }
	       }
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
		       if(this.index==this.size)
		       {
		           //we need to increase the size of data[]
		           getCapacity();
		       }
		       a[this.index]=value;
		       return this.index++;
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
		 //Shifting the array to accomodate the new element
	       for(int i=a.length-1; i > index; i--){
	           a[i] = a[i-1];
	       }
	       a[index] = value;
	       return null;
	   }

	/**
	 * Add a list of values to the end.
	 * 
	 * Capacity should increase according
	 * to the doubling policy (see
	 * doubleIfNeeded).
	 * 
	 * @param values list of values to add in order
	 * @return 
	 */
	public int[] addAll(List<Integer> values) {
	       int[] c = new int[a.length+values.length];
	       int count=0;
	       for(int i = 0; i < a.length; i++) {
	           c[i] = a[i];
	           count++;
	       }
	       for(int j = 0; j < values.length;j++) {
	           c[count++] = values[j];
	       }

	       return c;
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
		   int[] c = new int[a.length+values.size()];
	       int count=0;
	       for(int i = 0; i < a.length; i++) {
	           if(i==index)
	           {
	               for(int j = 0; j < values.size();j++)
	               {
	                   c[count++] =values.indexOf(j);
	               }
	          
	           }
	       }
	       for(int j = 0; j < values.size();j++)
	       {
	           c[count++] = a[j];
	       }
	   }

	/**
	 * Sets the size to 0
	 * without changing
	 * capacity.
	 */
	public void clear() {
		  this.size=0;
	   }

	/**
	 * Reduces the capacity to
	 * the current size
	 */
	public void trimToSize() {
		       this.capacity=size;
		       int b[]=new int[capacity];
		       for(int i=0;i<a.length-1;i++){
		           //shrinking the size of the array
		           //and copying it to the new array.
		           b[i]=a[i];
		       }
		   }

	/**
	 * Remove the last element in the list
	 * 
	 * @return removed element, null if was empty
	 */
	public Integer removeLast() {
		 //Remove Last Element of the array
	       int b[]=new int[a.length - 1];

	       for(int i=0;i<a.length-1;i++){
	           if(i == a.length - 1){
	               a[i]=0;
	           }else{
	               b[i]=a[i];
	           }
	       }
	       //Returning the last element
	       return b[b.length - 1];

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
		
		       int b[]=new int[a.length - 1];
		       for(int i=0;i<a.length-1;i++){
		           if(i == index){
		               a[i]=0;
		           }else{
		               b[i]=a[i];
		           }
		       }
		       //Returning the last element
		       return a[index];
		   }
	/**
	 * Removes the first element that has
	 * the supplied value.
	 * 
	 * @param value value to remove
	 * @return value, null if not found
	 */
	public Integer removeFirst(int value) {
		   int b[]=new int[a.length - 1];
	       boolean found=true;
	       for(int i=0;i<a.length-1;i++)
	       {
	           if(a[i] == value){
	               found=true;
	               a[i]=0;
	           }else{
	               b[i]=a[i];
	           }
	       }
	       if(!found)
	       {
	           return null;
	       }
	       //Returning the first element
	       return 1;
	   }
	/**
	 * Removes all elements that pass
	 * a supplied test
	 * 
	 * @param p test to apply to each element
	 * @return number of elements removed
	 */
	public int removeAllIf(IntTester p) {
		int count=0;
		int b[]=new int[a.length - 1];
		boolean found=true;
		for(int i=0;i<a.length-1;i++)
		{
			if(p.test(a[i], 0))
			{
				count++;
			}
			else
			{
				b[i]=a[i];
			}
		}
		return count;
	}

	/**
	 * Removes all elements of a
	 * particular value.
	 * 
	 * @param value value to remove
	 * @return number of elements removed
	 */
	public int removeAll(int value) {
		int count=0;

		int b[]=new int[a.length - 1];
		boolean found=true;
		for(int i=0;i<a.length-1;i++){
			if(a[i] == value)
			{
				a[i]=0;
				count++;
			}else{
				b[i]=a[i];
			}
		}
		return count;
	}
}