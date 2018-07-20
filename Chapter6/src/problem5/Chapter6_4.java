//================================
//CSCI3200_DA_3409_Summer2018
//Nathaniel Parizi
//Assignment 6 (CH6)
//Problem 5 
//================================


package problem5;


import java.util.*;

public class MyBinaryHeap<E extends Comparable<? super E>> {
	private static int DEFAULT_CAPACITY = 0;
	private int currentSize;
	private E[] heap;

	static int opCount1;
	static int opCount2;

	// *****************************************************Operation Counts
	public int operationCount1(int k) {

		opCount1 = opCount1 + k;
		return opCount1;
	}

	public void operationCountClear() {
		opCount1 = 0;
	}

	// *****************************************************

	public MyBinaryHeap() {
		this(DEFAULT_CAPACITY);
	}

	public MyBinaryHeap(int newSize) {

		operationCount1(1); // assignment + 1
		heap = (E[]) new Comparable[nextSize(newSize)];

		operationCount1(1); // assignment + 1
		currentSize = 0;

	}

	public MyBinaryHeap(E[] items) {

		operationCount1(1); // assignment + 1
		heap = (E[]) new Comparable[nextSize(items.length)];

		operationCount1(1); // assignment + 1
		currentSize = items.length;

		operationCount1(1);// i = 0 assignment
		operationCount1(1);// i < n
		for (int i = 0; i < items.length; i++) { // code inside will run n times

			operationCount1(1); // assignment + 1
			heap[i + 1] = items[i];
		}
		buildHeap();
	}

	public void addAll(E[] items) {

		operationCount1(1); // i > n comparison
		if (currentSize + items.length + 1 > heap.length)// array is full or more than full
		{
			growArray(nextSize(currentSize + items.length + 1));
		}

		operationCount1(1);// assignment
		operationCount1(1);// comparison
		for (int i = 0; i < items.length; i++) { // code inside will run n times

			operationCount1(2);
			currentSize++; // currentSize = currentSize + 1; O(1)for assingment + O(1) addition operation

			operationCount1(1); // assignment
			heap[currentSize] = items[i];
		}
		buildHeap();
	}

	private void buildHeap()// restore heap order property
	{

		operationCount1(1);// assignment
		operationCount1(1);// comparison
		for (int i = currentSize >> 1; i > 0; i--) { // code inside will run n times
			percolateDown(i);
		}
	}

	public boolean isEmpty() {

		return (currentSize == 0);
	}

	public void makeEmpty() {

		operationCount1(1);// assignment
		currentSize = 0;
	}

	private void growArray(int newSize) {
		// System.out.println("Grow");

		operationCount1(1);// assignment
		E[] temp = heap;

		operationCount1(1);// assignment
		heap = (E[]) new Comparable[newSize];

		operationCount1(1);// assignment
		operationCount1(1);// comparison
		for (int i = 1; i <= currentSize; i++) {

			operationCount1(1);// assignment
			heap[i] = temp[i];
		}
	}

	private void growArray() {

		growArray(heap.length << 1);// same as heap.length * 2
	}

	private int nextSize(int newSize) {
		return 1 << (Integer.toBinaryString(newSize).length());
	}

	public String toString() {
		// current size can never be equal to length, because we are reserving heap[0]
		// for inserts
		String output = "Heap Space:" + heap.length + ":Space Used:" + currentSize + "\n";

		operationCount1(1);// assignment
		operationCount1(1);// comparison
		for (int i = 1; i <= currentSize; i++) { // code inside will run n times

			operationCount1(2);// comparison + addition operation
			output += heap[i] + ",";
		}
		return output;
	}

	public void insert(E value) {

		operationCount1(2);// comparison + addition operation
		if (currentSize + 1 == heap.length)// array is full
		{
			growArray();
		}

		operationCount1(2);// comparison + addition operation
		currentSize++;// update to position that needs to be filled

		operationCount1(1);// assignment
		heap[0] = value;// temporary home for value while making room
		percolateUp(currentSize);
	}

	private void percolateUp(int pos) {
		// pos>>1 == pos/2
		// check if parent is larger than what is being inserted

		operationCount1(1);// assignment
		operationCount1(1);// comparison
		for (; heap[pos >> 1].compareTo(heap[0]) > 0; pos = pos >> 1) {
			// if parent larger, move down and try again on next level

			operationCount1(1);// assignment
			heap[pos] = heap[pos >> 1];
		}

		operationCount1(1);// assignment
		heap[pos] = heap[0];// insert into empty position made by percolate
	}

	public E findMin() {
		// heap[1] always contains smallest value

		operationCount1(1);// comparison
		if (currentSize > 0)
			return heap[1];
		else
			return null;
	}

	public E deleteMin() {

		operationCount1(1);// comparison
		if (currentSize > 0) {

			operationCount1(1);// assignment
			E temp = heap[1];

			operationCount1(1);// assignment
			heap[1] = heap[currentSize];// not using heap[0] so this works the same for buildHeap method

			operationCount1(2);// comparison + subtraction operation
			currentSize--;
			percolateDown(1);
			return temp;
		} else
			return null;
	}

	private void percolateDown(int pos) {

		operationCount1(1);// comparison
		int child = pos << 1;

		operationCount1(1);// comparison
		E temp = heap[pos];// not using heap[0] so this works the same for buildHeap method
		// pos<<1 == pos * 2

		operationCount1(1);// assignment
		operationCount1(1);// comparison
		for (; pos << 1 <= currentSize; pos = child, child = pos << 1) {

			operationCount1(1);// comparison
			if (child != currentSize // there is a second child
					&& heap[child + 1].compareTo(heap[child]) < 0)// second is smaller than first
			{

				operationCount1(2);// comparison + addition operation
				child++;
			}
			// child is now the index of the smaller of the two children if there are two

			// if child is smaller than temp, move child up

			operationCount1(1);// comparison
			if (heap[child].compareTo(temp) < 0) {

				operationCount1(1);// assignment
				heap[pos] = heap[child];
			} else {
				break;// prevent increment from running in for loop
			}
		}

		operationCount1(1);// assignment
		heap[pos] = temp;
	}

}
