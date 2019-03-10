import java.util.*;

class Demo
{
	public void LinearSearch1(int Arr1[],int Search1)
	{	
		int i=0;
		if(Arr1==null)
		{
			return;
		}
	
		for(i=0;i<Arr1.length;i++)
		{
			if(Arr1[i]==Search1)
			{
				break;
			}		
		}

			if(i==Arr1.length)
			{
				System.out.println("Given Search Element Is Not Present in Array\n");
			}		
			else
			{
				System.out.println("Given Search Element Is Occured At Position:-"+i);
			}			

	}
	
	public void LinearSearch2(int Arr2[],int Search2)
	{
		if(Arr2==null)
		{
			return;	
		}
		int Start=0;
		int End=Arr2.length-1;
			
			while(Start<End)
			{
				if((Arr2[Start]==Search2)||(Arr2[End]==Search2))
				{
				break;
				}
			Start++;
			End--;	
			}

			if((Start>=End)&&(Arr2[Start]!=Search2)&&(Arr2[End]!=Search2))
			{
				System.out.println("given Search Element Is Not Present In the Array\n");
			}
		
	 		 else if(Arr2[Start]==Search2)
			{
				System.out.println("Given Search Element Is occured At Pos:-\n"+Start);
		
			}	
			else 
			{
				System.out.println("Given Search Element Is occured At Pos:-\n"+End);
		
			}
	}

}
class Linearsearch
{
	public static void main(String agrs[])
	{
		
		Scanner SI=new Scanner(System.in);
				
		int Num=0;
	
		System.out.println("Enter Number Of Element For Array");
		Num=SI.nextInt();

		int Arr[]=new int[Num];
		System.out.println("Enter Element For Array");
		for(int i=0;i<Num;i++)
		{
			Arr[i]=SI.nextInt();
		}
		System.out.println("Enter Element to Search From Array");
		int Search=SI.nextInt();		
				
		Demo obj=new Demo();
	
		System.out.println("Linear Search Using Single Direction");
		obj.LinearSearch1(Arr,Search);
		System.out.println();
		System.out.println("Linear Search Using Bi-Direction");
		obj.LinearSearch2(Arr,Search);
	}
}
