package Heap_Ques;

import java.util.*;



public class Heap_Sort {
	
	public static void heapsort(ArrayList<Integer> arr)
	{
		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
		for(int j : arr)
		{
			minheap.add(j);
		}
		int i = 0;
		while(!minheap.isEmpty())
		{
			arr.set(i, minheap.poll());	
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			int n = sc.nextInt();
			for(int i = 0; i<n; i++)
			{
				arr.add(sc.nextInt());
			}
			heapsort(arr);
			for(int j : arr)
			{
				System.out.print(j + " ");
			}
		}
		

	}

}
