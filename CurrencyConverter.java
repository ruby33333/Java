import java.util.Scanner;
public class CurrencyConverter 
{
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		for (; ; )
		{
		System.out.println("1.Conversion of EURO TO USD");
		System.out.println("");
		System.out.println("2.Conversion of USD TO EURO");
		System.out.println("");
		System.out.println("3.Conversion of USD TO INR");
		System.out.println("");
		System.out.println("4.Conversion of CAD TO INR");
		System.out.println("");
		System.out.println("5.Conversion of INR TO CAD");
		System.out.println("");
		System.out.println("6.Quit");
		System.out.println("");

		
        System.out.print("Select The Choice :");
		int choice=sc.nextInt();
		System.out.println("");
		switch(choice)
		{
			case 1:
			{
				System.out.print("Enter The Amount in EURO :");
	
                double amount=sc.nextDouble();
				System.out.println("");
				double amount1=amount*1.0884602532;
		        System.out.println("The Conversion rate of EURO to USD:$"+amount1);
				System.out.println("");
				break;
            }
			case 2:
			{
				System.out.print("Enter The Amount in US Dollar :");
				
                double amount=sc.nextDouble();
				System.out.println("");
				double amount1=amount*0.9173;
		        System.out.println("The Conversion rate of USD$to EURO:"+amount1);
				System.out.println("");
				break;
			}
			case 3:
			{
				System.out.print("Enter The Amount in US Dollar :");
				
                double amount=sc.nextDouble();
				System.out.println("");
				double amount1=amount*83.5732;
		        System.out.println("The Conversion rate of USD $to INR:"+amount1);
				System.out.println("");
				break;
			}
			case 4:
			{
				System.out.print("Enter The Amount in CAD Dollar:");
				
                double amount=sc.nextDouble();
				System.out.println("");
				double amount1=amount*61.1035;
		        System.out.println("The Conversion rate of CAD Dollar $to INR:"+amount1);
				System.out.println("");
				break;
			}
			case 5:
			{
				System.out.print("Enter The Amount in INR :");
				
                double amount=sc.nextDouble();
				System.out.println("");
				double amount1=amount*0.0164 ;
		        System.out.println("The Conversion rate of INR to CAD Dollar$:"+amount1);
				System.out.println("");
				break;
			}
			default :
			{    System.out.println("Invalid Choice....!!");
				System.exit(0);
				break;
			}
		}
		}
             
		

	}
}
