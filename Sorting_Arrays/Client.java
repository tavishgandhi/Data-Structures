package Sorting_Arrays;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,2,32,14,7,18};
		Sorting b = new Sorting();
//		b.Bubble_Sort(arr);
		b.display(arr);
		System.out.println("////////////////////////////////////////");
		//b.Selection_Sort(arr);
		b.Insertion_Sort(arr);
		
	}

}
