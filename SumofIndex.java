public class SumofIndex {
    

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int arr[]= {10,5,6,3,7,2};
            int n=arr.length;
            int sum=0;
            int sum1=0;
            for(int i=0;i<n;i++)
            {
                if(i%2==0)
                {
                    sum=sum^arr[i];
                }
                else
                {
                    sum1=sum1+arr[i];
                }
                
            }
            int difference=sum1-sum;
            System.out.println(difference);
            
    
        }
    
    }
    
    
}
