import java.lang.*;
import java.util.*;

 class Demo
{
	 void fun9(int No1)
	{
		if(No1<0)
		{
			No1=-No1;
		}
		int i=0;
		for(i=1;i<=10;i++)
		{
			System.out.println("\t"+i);		
		}	

			}	
}

public class Demo2 extends Demo
{
		
		void fun10()
       		{
		int no3=12;
			int i=0;
			for(i=1;i<=No1;i++)
			{
				if(No1%i==0)
				{
					System.out.println(i);			
				}

			}
		}

}

class Assign2
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Number:-");	
		int No1=obj.nextInt();

		System.out.println("Acceot One Number From User And Display Even Number From That Number");
			Demo obj2=new Demo();
			obj2.fun9(No1);
			Demo2 obj3=new Demo2();
			obj3.fun10();


	}


}
