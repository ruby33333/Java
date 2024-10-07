import java.util.*;
public class RepeatingChar {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rsc=new Scanner(System.in);
		String str=rsc.next();
		//String str="abccdccec";
		System.out.println(str);
		int n=str.length();
        char ch[]=str.toCharArray();
        int count=0;
        char r='c';
        for(int i=0;i<ch.length;i++)
        {
        	if(ch[i]==r)
        	{
        		count++;
        	}
        }
        System.out.println(count);
        
	}

}
