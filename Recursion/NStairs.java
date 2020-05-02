package Recursion;

public class NStairs {
	
/////////////////////////////////////////////NStairs complexity O(2^n)	
	public static int nStairs(int[] num, int stairs)
	{
		if(stairs==0) return 1;
		if(stairs<0) return 0;
		
		int ans = 0;
		for(int i = 0;i < num.length; i++)
		{
			ans = ans + nStairs(num, stairs - num[i]);
		}
		return ans;
	}
////////////////////////////////////////////// NStairs complexity O(n)
	public static int nStairsMemo(int[] num, int stairs, int[]storage)
	{
		if(stairs==0) return 1;
		if(stairs<0) return 0;
		if(storage[stairs] != 0)
		{
			return storage[stairs];
		}
		int ans = 0;
		for(int i = 0;i < num.length; i++)
		{
			ans = ans + nStairs(num, stairs - num[i]);
		}
		storage[stairs] = ans;
		return ans;
	}
/////////////////////////////////////////////// NStairs complexity O(n)- Bottom UP
	public static int NStairsBottomUp(int stairs)
	{
		int[] arr=new int[stairs+1];
		arr[arr.length-1] = 1;// Seeding
		
		for(int i = arr.length - 2;i >=0;i--)
		{
			if(i + 1 <= stairs) 
				arr[i]+= arr[i+1];
			if(i+2 <=stairs)
				arr[i]+= arr[i+2];
			if(i+3 <=stairs)
				arr[i]+= arr[i+3];
		}
		return arr[0];
	}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] num = {1,2,3};
			int stairs = 6;
			int[] storage = new int[stairs+1];
			System.out.println(nStairs(num, stairs));
			System.out.println(nStairsMemo(num, stairs,storage));
			System.out.println(NStairsBottomUp(stairs));		
		}

}
