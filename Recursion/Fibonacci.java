package Recursion;

public class Fibonacci {
	
	public static int fib(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		int fnm1 = fib(n-1);
		int fnm2 = fib(n-2);
		int f = fnm1 + fnm2;
		return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = fib(5);
		System.out.println(n);
	}

}
