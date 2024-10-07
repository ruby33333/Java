import java.util.*;
public class OddEvenSequence {
	public static void main(String args[])
	{  
		Scanner s=new Scanner(System.in);
		
        int arr[]= {1,2,3,4,5,6};
        int n =arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
		}
	}

}
