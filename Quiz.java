import java.util.Scanner;
class  Quiz
{   private int answer;
	public void QuizCompetition()
	{
		System.out.println("                               ****Welcome To Pinnacle Lab Java Quiz Competition****                              ");
		System.out.println(" ");
		int score=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("a.Who invented java programming?");
		System.out.println("1.)Guido Van Rossum"+"\n"+"2.)James Gosling"+"\n"+"3.)Dennis Ritchie"+"\n"+"4.)Bjarne Stroustrup");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("1.)Guido Van Rossum");
			    break;
			case 2:
				System.out.println("2.)James Gosling");
			    break;
			case 3:
				System.out.println("3.)Dennis Ritchie");
			    break;
			case 4:
				System.out.println("3.)Bjarne Stroustrup");
			    break;
			default :
			       System.out.println("Invalid Choice");
				   System.out.println("Please selsect the Right option");
				   if(choice >=4)
				   {
					System.exit(0);
					
				   }
				   
				   break;
		}
	    System.out.println("");
		System.out.println("b.What is the Extension of java code files?");
		System.out.println("1.).js"+"\n"+"2.).txt"+"\n"+"3.).java"+"\n"+"4.).class");
		int choice1=sc.nextInt();
		switch(choice1)
		{
			case 1:
				System.out.println("1.).js");
			    break;
			case 2:
				System.out.println("2.).txt");
			    break;
			case 3:
				System.out.println("3.).java");
			    break;
			case 4:
				System.out.println("4.)class");
			    break;
			default :
				System.out.println("Invalid Choice");
				break;
		}
		System.out.println("");
		System.out.println("c.Which type of acces modifier is used to acheive encapsulation in java?");
		System.out.println("1.)private"+"\n"+"2.)public"+"\n"+"3.)protected"+"\n"+"4.)default");
		int choice2=sc.nextInt();
		switch(choice2)
		{
			case 1:
				System.out.println("1.)private");
			    break;
			case 2:
				System.out.println("2.)public");
			    break;
			case 3:
				System.out.println("3.)protected");
			    break;
			case 4:
				System.out.println("4.)default");
			    break;
			default :
				System.out.println("Invalid Choice");
				break;
		}
		System.out.println("");

        System.out.println("d.Which method is used for connecting one constructor to another constructor(Constructor Chaining)?");
		System.out.println("1.)this()"+"\n"+"2.)super()"+"\n"+"3.)extends"+"\n"+"4.)implements");
		int choice3=sc.nextInt();
		switch(choice3)
		{
			case 1:
				System.out.println("1.)this()");
			    break;
			case 2:
				System.out.println("2.)super()");
			    break;
			case 3:
				System.out.println("3.)extends()");
			    break;
			case 4:
				System.out.println("4.)implements()");
			    break;
			default :
				System.out.println("Invalid Choice");
				break;
		}
		System.out.println("");
		System.out.println("e.Subclass in java is also Known as?");
		System.out.println("1.)base class"+"\n"+"2.)child class"+"\n"+"3.)derived class"+"\n"+"4.)both b and c");
		int choice4=sc.nextInt();
		switch(choice4)
		{
			case 1:
				System.out.println("1.)base class");
			    break;
			case 2:
				System.out.println("2.)child class");
			    break;
			case 3:
				System.out.println("3.)derived class");
			    break;
			case 4:
				System.out.println("4.)both b and c");
			    break;
			default :
				System.out.println("Invalid Choice");
				break;
		}
		System.out.println("");
		System.out.println("f.What is the use of 'javac' command?");
		System.out.println("1.)Execute a java program"+"\n"+"2.)Debug a java program"+"\n"+"3.)Interpret a java program"+"\n"+"4.)Compile a java program");
		int choice5=sc.nextInt();
		switch(choice5)
		{
			case 1:
				System.out.println("1.)Execute a java program");
			    break;
			case 2:
				System.out.println("2.)Debug a java program");
			    break;
			case 3:
				System.out.println("3.)Interpret a java program");
			    break;
			case 4:
				System.out.println("4.)Compile a java program");
			    break;
			default :
				System.out.println("Invalid Choice");
				break;
		}
		System.out.println("");
		System.out.println("g.Which of the following is not an OOPS concept in java?");
		System.out.println("1.)polymorphism"+"\n"+"2.)compilation"+"\n"+"3.)inheritance"+"\n"+"4.)encapsulation");
		int choice6=sc.nextInt();
		switch(choice6)
		{
			case 1:
				System.out.println("1.)polymorphism");
			    break;
			case 2:
				System.out.println("2.)compilation");
			    break;
			case 3:
				System.out.println("3.)inheritance");
			    break;
			case 4:
				System.out.println("4.)encapsulation");
			    break;
			default :
				System.out.println("Invalid Choice");
				break;
		}
		System.out.println("");
		System.out.println("h.Which of the following is a type of polymorhism in java programming?");
		System.out.println("1.)compile time polymorphism"+"\n"+"2.)multiple polymorphism"+"\n"+"3.)multilevel polymorphism"+"\n"+"4.)execution time polymorphism");
		int choice7=sc.nextInt();
		switch(choice7)
		{
			case 1:
				System.out.println("1.)compile time polymorphism");
			    break;
			case 2:
				System.out.println("2.)multiple polymorphism");
			    break;
			case 3:
				System.out.println("3.)multilevel polymorphism");
			    break;
			case 4:
				System.out.println("4.)execution time polymorphism");
			    break;
			default :
				System.out.println("Invalid Choice");
				break;
		}
		System.out.println("");
		System.out.println("i.Which keyword is used to access a Global variable into Local Variable(or inside the method)?");
		System.out.println("1.)super"+"\n"+"2.)interface"+"\n"+"3.)this"+"\n"+"4.)extends");
		int choice8=sc.nextInt();
		switch(choice8)
		{
			case 1:
				System.out.println("1.)super");
			    break;
			case 2:
				System.out.println("2.)interface");
			    break;
			case 3:
				System.out.println("3.)this");
			    break;
			case 4:
				System.out.println("4.)extends");
			    break;
			default :
				System.out.println("Invalid Choice");
				break;
		}
		System.out.println("");
		System.out.println("j.Which method can be used to find  the length of a string?");
		System.out.println("1.)length()"+"\n"+"2.)getlength()"+"\n"+"3.)getSize()"+"\n"+"4.)len()");
		int choice9=sc.nextInt();
		switch(choice9)
		{
			case 1:
				System.out.println("1.)length()");
			    break;
			case 2:
				System.out.println("2.)getlength()");
			    break;
			case 3:
				System.out.println("3.)getSize()");
			    break;
			case 4:
				System.out.println("4.)len()");
			    break;
			default :
				System.out.println("Invalid Choice");
				break;

		}
		System.out.println("");
        int response[]={choice,choice1,choice2,choice3,choice4,choice5,choice6,choice7,choice8,choice9};
	    int answer[]={2,3,1,1,4,4,2,1,3,1};
		  for(int i=0;i<response.length;i++)
		{
		    if(answer[i]==response[i])
		    {
			   score++;
		    }
		}
		System.out.println("Score:"+score+"/10");
		 if(score==10)
		{
			 System.out.println("Excellent Good job....!");
		}
		else if(score>7||score<10)
		{
			System.out.println("Well done keep it up");
		}
		else if(score<=5 ||score >=7)
		{
			System.out.println("Average good try:)");
		}
		else
		{
			System.out.println("Better luck next time...");
		}
	}
	public static void main(String args[])
	{
		Quiz q1=new Quiz();
		q1.QuizCompetition();

	   
	}
}

