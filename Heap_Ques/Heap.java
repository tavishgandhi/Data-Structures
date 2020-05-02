package Heap_Ques;

import java.util.PriorityQueue;
import java.util.*;
public class Heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
		try (Scanner sc = new Scanner(System.in)) {
			int count = 0;
			int k = sc.nextInt();
			while(true)
			{	
				int n = sc.nextInt();
				// Print k largest number and terminate
				if(n == -1)
				{
					printlargestElements(minheap);
					break;
				}
				// If the total entered elements are less than k, then add in heap  
				else if(count<k)
				{
					minheap.add(n);
					count++;
				}
				// Compare the coming elements with heap made
				else 
				{
					if(minheap.peek() < n) // If n is lesser than root then ignore otherwise
										// pop top element and push n to heap
					{
						minheap.poll();
						minheap.add(n);
					}
				}
			}
		}
	}

	private static void printlargestElements(PriorityQueue<Integer> minheap) {
		// TODO Auto-generated method stub
		// extracting k elements from heap that are the largest k elements from provided lot.
		while(!minheap.isEmpty())
		{
			System.out.println(minheap.poll());
		}
		
	}

}
