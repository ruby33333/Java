
public class Integerpair {
	public static void main(String args[])
	{
		int arr[]= {11,1,2,8,10,11,15,7};
		int n=arr.length;
		int x=18;
		
		int max=1;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(arr[i]+arr[j]==18)
				{
					if(max<(arr[i]*arr[j]))
					{
						max=arr[i]*arr[j];
						
					}
				}
			}
		}
		
	}

}
