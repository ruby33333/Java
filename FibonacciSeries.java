public class FibonacciSeries {

	   public static int specialSeries(int n) 
	   {
	        if(n == 0) 
	        {
	            return 1;
	        } else if (n == 1) 
	        {
	            return 1;
	        } else 
	        {
	            return specialSeries(n - 1) * specialSeries(n - 1) + specialSeries(n - 2) * specialSeries(n - 2);
	        }
	    }

	    public static void main(String[] args) {
	        int n = 5; // change this to the desired value of n
	        int result = specialSeries(n);
	        System.out.println("The " + n + "th number in the series is: " + result);
	        System.out.println("The result modulo 47 is: " + result % 47);
	    }
	}