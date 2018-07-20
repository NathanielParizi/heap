//================================
//CSCI3200_DA_3409_Summer2018
//Nathaniel Parizi
//Assignment 6 (CH6)
//Problem 5 
//================================

package problem5;

import java.util.Scanner;
import java.util.*;

public class MyBinaryHeapTester<E> {

	static Integer[] numbers;

	public static void main(String[] args) {
		MyBinaryHeap<Integer> mbh = new MyBinaryHeap<>();

		Random rand = new Random();

		System.out.println("******** N = 10 ************");
		int n = 10;

		numbers = new Integer[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}

		long startTime = System.nanoTime();
		mbh = new MyBinaryHeap<Integer>();
		mbh.addAll(numbers);
		long endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("\nBuildHeap Operation counts of N= 10 : " + mbh.operationCount1(0));
		mbh.operationCountClear();

		startTime = System.nanoTime();
		mbh.makeEmpty();
		for (int i = 0; i < numbers.length; i++) {
			mbh.insert(numbers[i]);

		}
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("One by one insert Operation counts of N= 10 : " + mbh.operationCount1(0));

		System.out.println("******** N = 50 ************");
		n = 50;

		numbers = new Integer[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}

		startTime = System.nanoTime();
		mbh = new MyBinaryHeap<Integer>();
		mbh.addAll(numbers);
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("\nBuildHeap Operation counts of N= 10 : " + mbh.operationCount1(0));
		mbh.operationCountClear();

		startTime = System.nanoTime();
		mbh.makeEmpty();
		for (int i = 0; i < numbers.length; i++) {
			mbh.insert(numbers[i]);

		}
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("One by one insert Operation counts of N= 10 : " + mbh.operationCount1(0));

		System.out.println("******** N = 75 ************");
		n = 75;

		numbers = new Integer[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}

		startTime = System.nanoTime();
		mbh = new MyBinaryHeap<Integer>();
		mbh.addAll(numbers);
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("\nBuildHeap Operation counts of N= 10 : " + mbh.operationCount1(0));
		mbh.operationCountClear();

		startTime = System.nanoTime();
		mbh.makeEmpty();
		for (int i = 0; i < numbers.length; i++) {
			mbh.insert(numbers[i]);

		}
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("One by one insert Operation counts of N= 10 : " + mbh.operationCount1(0));

		System.out.println("******** N = 100 ************");
		n = 100;

		numbers = new Integer[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}

		startTime = System.nanoTime();
		mbh = new MyBinaryHeap<Integer>();
		mbh.addAll(numbers);
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("\nBuildHeap Operation counts of N= 10 : " + mbh.operationCount1(0));
		mbh.operationCountClear();

		startTime = System.nanoTime();
		mbh.makeEmpty();
		for (int i = 0; i < numbers.length; i++) {
			mbh.insert(numbers[i]);

		}
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("One by one insert Operation counts of N= 10 : " + mbh.operationCount1(0));

		System.out.println("******** N = 200 ************");
		n = 200;

		numbers = new Integer[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}

		startTime = System.nanoTime();
		mbh = new MyBinaryHeap<Integer>();
		mbh.addAll(numbers);
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("\nBuildHeap Operation counts of N= 10 : " + mbh.operationCount1(0));
		mbh.operationCountClear();

		startTime = System.nanoTime();
		mbh.makeEmpty();
		for (int i = 0; i < numbers.length; i++) {
			mbh.insert(numbers[i]);

		}
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("One by one insert Operation counts of N= 10 : " + mbh.operationCount1(0));

		System.out.println("******** N = 300 ************");
		n = 300;

		numbers = new Integer[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}

		startTime = System.nanoTime();
		mbh = new MyBinaryHeap<Integer>();
		mbh.addAll(numbers);
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("\nBuildHeap Operation counts of N= 10 : " + mbh.operationCount1(0));
		mbh.operationCountClear();

		startTime = System.nanoTime();
		mbh.makeEmpty();
		for (int i = 0; i < numbers.length; i++) {
			mbh.insert(numbers[i]);

		}
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("One by one insert Operation counts of N= 10 : " + mbh.operationCount1(0));

		System.out.println("******** N = 400 ************");
		n = 400;

		numbers = new Integer[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}

		startTime = System.nanoTime();
		mbh = new MyBinaryHeap<Integer>();
		mbh.addAll(numbers);
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("\nBuildHeap Operation counts of N= 10 : " + mbh.operationCount1(0));
		mbh.operationCountClear();

		startTime = System.nanoTime();
		mbh.makeEmpty();
		for (int i = 0; i < numbers.length; i++) {
			mbh.insert(numbers[i]);

		}
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("One by one insert Operation counts of N= 10 : " + mbh.operationCount1(0));

		System.out.println("******** N = 500 ************");
		n = 500;

		numbers = new Integer[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}

		startTime = System.nanoTime();
		mbh = new MyBinaryHeap<Integer>();
		mbh.addAll(numbers);
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("\nBuildHeap Operation counts of N= 10 : " + mbh.operationCount1(0));
		mbh.operationCountClear();

		startTime = System.nanoTime();
		mbh.makeEmpty();
		for (int i = 0; i < numbers.length; i++) {
			mbh.insert(numbers[i]);

		}
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("One by one insert Operation counts of N= 10 : " + mbh.operationCount1(0));

		System.out.println("******** N = 1000 ************");
		n = 1000;

		numbers = new Integer[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}

		startTime = System.nanoTime();
		mbh = new MyBinaryHeap<Integer>();
		mbh.addAll(numbers);
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("\nBuildHeap Operation counts of N= 10 : " + mbh.operationCount1(0));
		mbh.operationCountClear();

		startTime = System.nanoTime();
		mbh.makeEmpty();
		for (int i = 0; i < numbers.length; i++) {
			mbh.insert(numbers[i]);

		}
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("One by one insert Operation counts of N= 10 : " + mbh.operationCount1(0));

		System.out.println("******** N = 10000 ************");
		n = 10000;

		numbers = new Integer[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}

		startTime = System.nanoTime();
		mbh = new MyBinaryHeap<Integer>();
		mbh.addAll(numbers);
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("\nBuildHeap Operation counts of N= 10 : " + mbh.operationCount1(0));
		mbh.operationCountClear();

		startTime = System.nanoTime();
		mbh.makeEmpty();
		for (int i = 0; i < numbers.length; i++) {
			mbh.insert(numbers[i]);

		}
		endTime = System.nanoTime();
		System.out.println(endTime);

		System.out.println("One by one insert Operation counts of N= 10 : " + mbh.operationCount1(0));

	}

//	System.out.println(mbh);
//	mbh.insert(5);
//	System.out.println(mbh);
//	mbh.insert(7);
//	System.out.println(mbh);
//	mbh.insert(31);
//	mbh.insert(25);
//	mbh.insert(11);
//	mbh.insert(3);
//	mbh.insert(1);
//	System.out.println(mbh);
//	mbh.insert(4);
//	System.out.println(mbh.deleteMin());
//	System.out.println(mbh);
//	System.out.println(mbh.deleteMin());
//	System.out.println(mbh);
//	System.out.println(mbh.deleteMin());
//	System.out.println(mbh);

}
