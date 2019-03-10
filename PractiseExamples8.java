import java.io.*;

class Demo
{
		
	public void fun50(String Str)
	{
		int i=0;
		for(i=0;i<Str.length();i++)
		{
			if((Str.charAt(i)>='A')&&(Str.charAt(i)<='Z'))
			{
			System.out.println(Str.charAt(i));
			}		
	
		}
	}
	
	public void fun51(String Str2)
	{
		int i=0;
		StringBuffer Temp=new StringBuffer();
		char Ch;
		for(i=0;i<Str2.length();i++)
		{
			if((Str2.charAt(i)>='a')&&(Str2.charAt(i)<='z'))
			{	
				Ch=Str2.charAt(i);			
				Temp.append(Ch);
			}	
	
		}

		System.out.println("All LowerCase Letters In String:--"+Temp);


	}

		public void fun52(String Value1,String Value2)
		{
			
			char Arr1[]=new char[20];
			char Arr2[]=new char[20];

			for(int i=0;i<Value1.length();i++)
			{
				Arr1[i]=Value1.charAt(i);
			}
			for(int i=0;i<Value2.length();i++)
			{
				Arr2[i]=Value2.charAt(i);
			}
		
			System.out.println("First Character ArraY");
			for(int i=0;i<Value1.length();i++)
			{
				System.out.println(Arr1[i]);				
			}
			System.out.println("Second Character ArraY");
			for(int i=0;i<Value2.length();i++)
			{
				System.out.println(Arr2[i]);				
			}

			int k=0;
			for(k=0;k<Arr1.length;k++)
			{
		
			}
			k--;

			for(int j=0;j<Arr2.length;j++)
			{
				Arr1[k]=Arr2[j];

			}					
			System.out.println("After Concating Second String into First Strings");
			for(int j=0;j<Arr1.length;j++)
			{
				System.out.println(Arr1[j]);
			}
			
		}	

		void fun53(String Value3)
		{
			char Arr3[]=new char[20];
			Value3.getChars(0,15,Arr3,0);
			for(int i=0;i<Arr3.length;i++)
			{
				System.out.println(Arr3[i]);
			}
		}

		void fun54(String Value4,String Value5) 
		{
			System.out.println(Value4.equals(Value5));			
		}

		void fun55(String Value6)
		{
			StringBuffer obj=new StringBuffer(Value6);			
			int Cnt=Value6.length();
			
			char Arr4[]=new char[Cnt];
			Value6.getChars(0,Cnt,Arr4,0);
			System.out.println("Before Reversing Elements");
						
			for(int i=Arr4.length;i>=0;i--)
			{
				System.out.println(Arr4[i]);			
			}	
		}
}


class StringExa
{
	
	void StringMethods(String String1)
	{
		System.out.println("Used Lenght() Method To Display the Length of Method");
		System.out.println("Length Of String:-"+String1.length());
		System.out.println();
			
		System.out.println("Used compareTo() Method To Compare the String With Another String(Case Sensitive)");
		System.out.println("Comapare Of String with Not IgnoreCase:-"+String1.compareTo("Xyz"));
		System.out.println();
		
		System.out.println("Used compareToIgnoreCase() Method To Compare the String With Another String(Case InSensitive)");
		System.out.println("Comapare Of String with IgnoreCase:-"+String1.compareToIgnoreCase("Xyz"));
		System.out.println();
		
		System.out.println("Used CharAt() Method To Display the Particular Elements in the Array");
		System.out.println("Character Of 1th Position:-"+String1.charAt(1));
		System.out.println();
		
		System.out.println("Used indexOf() Method To Check The Index Of Second String into First String From Start");
		System.out.println(String1.indexOf("xyz"));
		System.out.println();
			
		System.out.println("Used lastIndexOf() Method To Check The Index Of Second String into First String form Last");
		System.out.println(String1.lastIndexOf("xyz"));
		System.out.println();
			
		System.out.println("Used equal() Method To Campare the String(Case Sensitive)");
		System.out.println("Campare String:-"+String1.equals("Xyz"));
		System.out.println();
	
		System.out.println("Used equalIgnoreCase() Method To Campare the String(Case Insensitive)");
		System.out.println("Campare String:-"+String1.equalsIgnoreCase("Xyz"));
		System.out.println();
		
		System.out.println("Used startWith() Method to Check The String Is start from Particular String or Not");
		System.out.println("StartWith():-"+String1.startsWith("XYZ"));
		System.out.println();
		
		System.out.println("All In-Built StringMethod Which Return Value Is String");
		
		System.out.println("Used SubString(int) Method to Get Substring From Particular Index");
		System.out.println("SubString:-"+String1.substring(2));
		System.out.println();

		System.out.println("Used SubString(int,int) Method to Get Substring From Particular Index to Other Index");
		System.out.println("SubString:-"+String1.substring(2,7));
		System.out.println();

		System.out.println("Used replace(char,char) Method to Replace The Character with Other Character Of String");
		System.out.println("SubString:-"+String1.replace('M','N'));
		System.out.println();
			
		System.out.println("Used toUpperCase() Method to Convert The Whole String into UpperCase");
		System.out.println("SubString:-"+String1.toUpperCase());
		System.out.println();
				
		System.out.println("Used toLowerCase() Method to Convert The Whole String into LowerCase");
		System.out.println("SubString:-"+String1.toLowerCase());
		System.out.println();
				
		System.out.println("Used trim() Method to Remove The all Start And Last White Spaces of String");
		System.out.println("SubString:-"+String1.trim());
		System.out.println();		
	}
}


class StringBufferExa
{
		
//StringBufferExa obj3=new StringBufferExa("StringBufferExamples");

		void StringBufferMethods()
		{
			StringBuffer str=new StringBuffer("mayur");

			System.out.println("Used to append() Method To Insert The Any Data-Types Values");
			System.out.println("Boolean Value:-"+str.append(true));
			System.out.println("Float Value:-"+str.append(1.22));
			System.out.println("Integer Value:-"+str.append(687));
			System.out.println();			
			
			System.out.println("Used to insert(int,char) Method To Insert The Any Data-Types Values at Particular Index");
			System.out.println("Integer Value:-"+str.insert(3,340));
			System.out.println("Float Value:-"+str.insert(3,1.22));
			System.out.println();			
			
			System.out.println("Used to delete(int,char) Method To Delete The Any Data-Types Values at Particular Index");
			System.out.println("Integer Value:-"+str.delete(3,8));
			//System.out.println("Float Value:-"+str.delete(3,));
			System.out.println();			
			
			System.out.println("Used to reverse() Method To Display the All Content in String in Reverse Form");
			System.out.println("Reverse Form:-"+str.reverse());			
			System.out.println();
		
			System.out.println("Used to toString() Method To Converted StringBuffer Into String");
			System.out.println("Reverse Form:-"+str.toString());			
			System.out.println();
		
		}











}



class Assign12
{

	public static void main(String args[])throws Exception
	{

		BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));
		
		
		int Choice=0;
		while(true)
		{
			System.out.println("Enter Choice:--");
			Choice=Integer.parseInt(BF.readLine());
			Demo obj=new Demo();	
			StringExa obj2=new StringExa();
			StringBufferExa obj3=new StringBufferExa();
			
			switch(Choice)
			{
				case 1:	
				System.out.println("Accept String From USer ANd Display UpperCase Charcater of That String");
				System.out.println("Enter The String:--");		
				String Str1=BF.readLine();
				System.out.println("UpperCase Character in String:--");
				obj.fun50(Str1);			
				break;

				case 2:
				System.out.println("Accept String From Create a New String of LowerCharcater Of String");	
				System.out.println("Enter The String:--");		
				String Str2=BF.readLine();
				obj.fun51(Str2);			
				break;

				case 3:
				System.out.println("Accept Two String From user And Concat First String Into Another String");
				System.out.println("Enter The FirstString:-");
				String Value1=BF.readLine();
				System.out.println("Enter The SecondString:--");		
				String Value2=BF.readLine();
				obj.fun52(Value1,Value2);
				break;
				
				case 4:
				System.out.println("Accept a String Grom User Convert That String into Character Array Using In-Buit Function");
				System.out.println("Enter The FirstString:-");
				String Value3=BF.readLine();
				obj.fun53(Value3);
				break;
				
				case 5:
				System.out.println("Accept Two String From Check Both String Are Equal Or Not");
				System.out.println("Enter The FirstString:-");
				String Value4=BF.readLine();
				System.out.println("Enter The SecondString:-");
				String Value5=BF.readLine();
				obj.fun54(Value4,Value5);
				break;
				
				case 6:
				System.out.println("Accept One String from User And Reverse That String");
				System.out.println("Enter String:--");
				String Value6=BF.readLine();
				obj.fun55(Value6);
				break;
		
				case 7:
				System.out.println("All String InBuilt Method:--");
				System.out.println("Enter The String:--");
				String Value7=BF.readLine();
				obj2.StringMethods(Value7);
			
				case 8:
				System.out.println("All StringBuffer In-Built Methods");
				obj3.StringBufferMethods();				

				default:
				System.out.println("Wrong Choice");	

			}			
			
		}		












		}








}
