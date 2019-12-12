package com.spk.Collections.aggregate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 * @author Praveen
 *
 */
public class Countdown {
	
	static <E> List<E> heapSort(Collection<E> c) {
	    Queue<E> queue = new PriorityQueue<E>(c);
	    List<E> result = new ArrayList<E>();

	    while (!queue.isEmpty())
	        result.add(queue.remove());

	    return result;
	}
    public static void main(String[] args) throws InterruptedException {
        
    	int time = Integer.parseInt("10");
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = time; i >= 0; i--)
            queue.add(i);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
            Thread.sleep(100);
        }
    }
}