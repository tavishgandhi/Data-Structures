package Sorting_Arrays;

public class Sorting{
	
	public void swap(int[] arr, int i,int j) 
	{
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
////////////////////////////////////////////Selection Sort
	public void Selection_Sort(int[] arr){
		int min;
		
		for(int i = 0; i < arr.length - 1; i++) {
			min = i;
			for(int j = i + 1;j < arr.length; j++)
			{
				if(arr[j] < arr[min] )
				{
					min = j;
				}
			}
			swap(arr, min, i);
			display(arr);	
		}
  }
//////////////////////////////////////////Bubble Sort	
	public void Bubble_Sort(int[] arr)
	{
		for(int i = 0;i< arr.length - 1;i++) 
		{
			for(int j = 1;j < arr.length - i;j++)
			{
				if(arr[j-1]>arr[j]) {
					swap(arr,j - 1, j);
				}
			}
			display(arr);
		}
	}
///////////////////////////////////////////////Insertion Sort
	public void Insertion_Sort(int[] arr) 
	{ int key;
		for(int i = 0; i < arr.length -1; i++ )
		{
			key = i+1;
			{
				for(int j = key; j > 0; j--) 
				{
					if(arr[key] < arr[j-1]) 
					{
						swap(arr,key,j-1);
					}
				}
			}
			display(arr);
		}
	}
	
	public void display(int[] arr) {
		for(int i =0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}


