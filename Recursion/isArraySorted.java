package Recursion;
//Given an array we have to fond if the array is sorted or not.




public class isArraySorted {
	public static boolean isSorted(int[] arr, int i)
	{
		if(i == arr.length - 1) {// Last single element is always sorted.
			return true;
		}
		
		if(isSorted(arr, i + 1))// Check if rest of the array is sorted or not.
		{
			if(arr[i] < arr[i + 1])// Check if my current element is less than next 
								   //element,which means array is sorted till now.
				return true;
			else
				return false;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,8,6};
		if(isSorted(arr, 0))
		{
			System.out.print("Sorted");
		}
		else
			System.out.print("Not Sorted");
	}

}
