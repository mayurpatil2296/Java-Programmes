/*////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/--Collection Framework Madhe Ibuilt DataStructre Ahet ani Sarv Datastructure he Sarv Generic Ahe Yamdhe Kontya pan Type Cha Data Ha Store Karu Shakoto.
/--Definition:-1.Set Of Object.
/	      2.The Collection is the Readymade Data Structure in Generic Format.
/
/--According to Java Collection IsConsidere As Collection Of Object
/--Collection framework Is The Framework Which Provide Readymade implementation Of Datastructures in Generic Format.
/--Incase C Programming there is No Such Inbuilt Concept Of DataStructure Incase Of C++ They are Provide Readymade Datastructure that is 
/STL(Standard Template Library)
/--STL is Also Readymade Implmentation of Data Structure in Generic Format.
/--in Case Of C# and Java There Is Exactly Same Concept Called As Collection Framework.
/--As Collection Contain Generic Implementatin of Data Structure We Can Used It For Any Purpose.
/--As All the Implemetation Is already available we have to used any method directly without Considering It Internal.
/--Collection Framwork contain Multiple Classes And Interfaces where able To every classes And has its own features its Differentiate from another /class.
/
/--Collection Framwork Madhe Kadhich baddal Hot Nahi Karan Jar Baddal Karaycha Asel tar Te Fact Navin Class Add karatar navin Baddal ha Yamdhe Hot Nahi.
/
/---------------------------------------Collection Hierachy In Java----------------------------------------------
/
/
/
/						Object 
/						  |
/                                                 |
/	Set 			List     		Queue   	Map
/
/	1.HashSet<T>		1.Stack<T>	    1.LinkeList<T>	1.HashMap<K,V>
/	2.LinkedHashSet<T>	2.LinkeList<T>				2.HashTable<K,V>
/				3.ArrayList<T>
/				4.Vector<T>          
/		
/						 
/	1.Set:---Set Ha elements array Sarkhya Store Karate.
/	       --Set Ha Duplicate Elements Allow Nahi Karat.
/	       --Jar Ekada element Apan Store Karanyacha Prayant Kela Ani jar element already Avilable Asla Tar Set Ha To Element Store Nahi Karat.
/
/	2.List:--Lists Pan Ha Set Sarkhach Ahe To Pan Group Of Elements Store Karate.
/	       --But List Ha Duplicate Element Allow Karate.
/
/	3.Queue:---Queue Pan Group Of Element Store Karate.
/		 --Pan Queue Ha (FIFO) Mechanism Fallow Karun Insertion And Deletion Karate.
/
/	4.Map:---Map Ha Value Key-Value Pair Madhe Store Karate Jar key Mahit Asli Tar Apan Tya Key Cha Used Karun Value Hi Find Karu Shakto.s
/	       --
/
/--Collection Framework Madhe Apan Primitive Data Types Store Nahi Karu Shakat Karan to Fact Collection of Object Store Karate.
/--Mean Collection Framework Ch Main Aim Hech Ahe Ki Object Store Karan Rather Than Primitive DataType.
/
/
/	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/	

/*//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/----------------------Examples Base On Set----------------------
/----HashSet<T>
/Function1():-Integer
/Function2():-Character
/Function3():-String
/
/LinkedHashSet<T>
/Function4():-Integer
/Function5():-Character
/Function6():-Double
/
/----------------------------Inbuilt Method In HashSet And LinkedHashSet------------------------------------
/-----HashSet------------------			------------------LinkedHashSet----------------------		
/ 1.add(elemnt);   //To Add Element in HashSet			1.add(elemnt);   //To Add Element in HashSet
/ 2.remove(element); //To Remove Element from HashSet		2.remove(element); //To Remove Element from HashSet
/ 3.size(); //To Find Size					3.size();    //To Find Size	
/ 4.isEmpty(); //To Check HashSet Is Empty Or Not		4.isEmpty(); //To Check HashSet Is Empty Or Not
/ 5.clear();	//To Delete All Element				5.clear(); //To Delete All Element			

--For HashSet And LinkedHashSet Collection All The Method are The Same Using These Method we Can Perform Operation On Collection F./////////////////////////////////////////////////////////////////*///////////////////////////////////////////////*/

/*
import java.util.*;
class Hash
{
	void Function1()
	{
		HashSet <Integer>obj1=new HashSet<Integer>();
			
		obj1.add(11);
		obj1.add(21);
		obj1.add(31);
		obj1.add(41);
		obj1.add(51);
		obj1.remove(31);

		System.out.println("Using Object");
		System.out.println(obj1);
		System.out.println();
		System.out.println("For-Each Loop");
		for(int i:obj1)
		{
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Using Iterator Interface");
		Iterator it=obj1.iterator();
		while(it.hasNext())
		{
			int i=(int)it.next();
			System.out.println(i);
		}

		System.out.println("Used size() Method To Find Size OF HashSet Elements");
		System.out.println(obj1.size());
		System.out.println();
		
		System.out.println("Used isEmpty() Method To Check Hashset is Empty Or Not");
		System.out.println(obj1.isEmpty());
		System.out.println();

		System.out.println("Used clear() Method To Delete All Elements In HashSet");
		obj1.clear();		
		System.out.println();
		
		System.out.println("After Deleting All the Elements From HashSet Using clear() Method");
		System.out.println("Used size() Method To Find Size OF HashSet Elements");
		System.out.println(obj1.size());
	}

	void Function2()
	{
		HashSet <Character>obj3=new HashSet<Character>();
		obj3.add('b');
		obj3.add('e');
		obj3.add('l');
		obj3.add('i');
		obj3.add('e');
		obj3.add('v');
		obj3.add('e');
		obj3.remove('b');
		
		System.out.println(obj3);
		System.out.println();
		System.out.println("Using For-Each loop");
		for(char i:obj3)
		{
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println("Using Iterator Interface");
		
			Iterator it=obj3.iterator();
			while(it.hasNext())
			{
				char j=(char)it.next();
				System.out.println(j);
				
			}

		System.out.println();
		System.out.println("Used size() Method To Find Size OF HashSet Elements");
		System.out.println(obj3.size());
			
		System.out.println();
		System.out.println("Used isEmpty() Method To Check The Hashset Element Is Empty Or Not");
		System.out.println(obj3.isEmpty());
		System.out.println();

		System.out.println("Used clear() Method To Delete All Elements In HashSet");
		obj3.clear();		
		System.out.println();
		
		System.out.println("After Deleting All the Elements From HashSet Using clear() Method");
		System.out.println("Used size() Method To Find Size OF HashSet Elements");
		System.out.println(obj3.size());


	}

	void Function3()
	{
		HashSet <String>obj4=new HashSet<String>();
		obj4.add("Every");
		obj4.add("Thing");
		obj4.add("Is");
		obj4.add("Possible");
		obj4.add("if");
		obj4.add("You");
		obj4.add("Believe");
		obj4.remove("Believe");
		
		System.out.println(obj4);
		System.out.println();
		System.out.println("Using For-Each loop");
		for(String i:obj4)
		{
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println("Using Iterator Interface");
		
			Iterator it=obj4.iterator();
				
			while(it.hasNext())
			{
				String s=(String)it.next();
				System.out.println(s);

			}			
		System.out.println();
		System.out.println("Used size() Method To Find Size OF HashSet Elements");
		System.out.println(obj4.size());
			
		System.out.println();
		System.out.println("Used isEmpty() Method To Check The Hashset Element Is Empty Or Not");
		System.out.println(obj4.isEmpty());
		System.out.println();

		System.out.println("Used clear() Method To Delete All Elements In HashSet");
		obj4.clear();		
		System.out.println();
		
		System.out.println("After Deleting All the Elements From HashSet Using clear() Method");
		System.out.println("Used size() Method To Find Size OF HashSet Elements");
		System.out.println(obj4.size());


	}
}


class LinkedHashSet1
{
	void Function4()
	{
		LinkedHashSet <Integer>obj5=new LinkedHashSet<Integer>();
			
		obj5.add(11);
		obj5.add(21);
		obj5.add(31);
		obj5.add(41);
		obj5.add(51);
		obj5.remove(31);

		System.out.println("Using Object");
		System.out.println(obj5);
		System.out.println();
		System.out.println("For-Each Loop");
		for(int i:obj5)
		{
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Using Iterator Interface");
		Iterator it=obj5.iterator();
		while(it.hasNext())
		{
			int i=(int)it.next();
			System.out.println(i);
		}

		System.out.println("Used size() Method To Find Size OF HashSet Elements");
		System.out.println(obj5.size());
		System.out.println();
		
		System.out.println("Used isEmpty() Method To Check Hashset is Empty Or Not");
		System.out.println(obj5.isEmpty());
		System.out.println();

		System.out.println("Used clear() Method To Delete All Elements In HashSet");
		obj5.clear();		
		System.out.println();
		
		System.out.println("After Deleting All the Elements From HashSet Using clear() Method");
		System.out.println("Used size() Method To Find Size OF HashSet Elements");
		System.out.println(obj5.size());
	}

	void Function5()
	{
		LinkedHashSet <Character>obj6=new LinkedHashSet<Character>();
		obj6.add('b');
		obj6.add('e');
		obj6.add('l');
		obj6.add('i');
		obj6.add('e');
		obj6.add('v');
		obj6.add('e');
		obj6.remove('b');
		
		System.out.println(obj6);
		System.out.println();
		System.out.println("Using For-Each loop");
		for(char i:obj6)
		{
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println("Using Iterator Interface");
		
			Iterator it=obj6.iterator();
			while(it.hasNext())
			{
				char j=(char)it.next();
				System.out.println(j);
				
			}

		System.out.println();
		System.out.println("Used size() Method To Find Size OF HashSet Elements");
		System.out.println(obj6.size());
			
		System.out.println();
		System.out.println("Used isEmpty() Method To Check The Hashset Element Is Empty Or Not");
		System.out.println(obj6.isEmpty());
		System.out.println();

		System.out.println("Used clear() Method To Delete All Elements In HashSet");
		obj6.clear();		
		System.out.println();
		
		System.out.println("After Deleting All the Elements From HashSet Using clear() Method");
		System.out.println("Used size() Method To Find Size OF HashSet Elements");
		System.out.println(obj6.size());


	}
	
	void Function6()
	{
		HashSet <Double>obj7=new HashSet<Double>();
		obj7.add(11.1);
		obj7.add(12.1);
		obj7.add(13.1);
		obj7.add(14.1);
		obj7.add(15.1);
		obj7.add(16.1);
		obj7.add(17.1);
		obj7.add(18.1);		
		obj7.add(19.1);		
		obj7.add(20.1);		
		obj7.add(12.1);
		obj7.remove(12.1);
		
		System.out.println(obj7);
		System.out.println();
		System.out.println("Using For-Each loop");
		for(Double i:obj7)
		{
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println("Using Iterator Interface");
		
			Iterator it=obj7.iterator();
				
			while(it.hasNext())
			{
				Double f=(Double)it.next();
				System.out.println(f);

			}			
		System.out.println();
		System.out.println("Used size() Method To Find Size OF HashSet Elements");
		System.out.println(obj7.size());
			
		System.out.println();
		System.out.println("Used isEmpty() Method To Check The Hashset Element Is Empty Or Not");
		System.out.println(obj7.isEmpty());
		System.out.println();

		System.out.println("Used clear() Method To Delete All Elements In HashSet");
		obj7.clear();		
		System.out.println();
		
		System.out.println("After Deleting All the Elements From HashSet Using clear() Method");
		System.out.println("Used size() Method To Find Size OF HashSet Elements");
		System.out.println(obj7.size());
	}

}

class CollectionFrame
{
	public static void main(String args[])
	{
	//object of HashSet
	Hash obj2=new Hash();
	System.out.println("Integer Elements In HashSet");
	obj2.Function1();
	System.out.println();	

	System.out.println("Character Elements In HashSet");
	obj2.Function2();
	System.out.println();	

	System.out.println("String Elements In HashSet");
	obj2.Function3();
	System.out.println();

	//object of LinkedHashSet
	LinkedHashSet1 obj8=new LinkedHashSet1();
	System.out.println("Integer Elements In LinkedHashSet");
	obj8.Function4();
	System.out.println();	

	System.out.println("Character Elements In LinkedHashSet");
	obj8.Function5();
	System.out.println();	

	System.out.println("String Elements In LinkedHashSet");
	obj8.Function6();
	System.out.println();	
	
	}

}
*/





/*//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/----------------------Examples Base On Queue------------------------------------------------------------
/--Queue Ha Ek Interface Ahe Ani LinkedlIst Ha Class Queue Inteface Implement Karate ani LinkedList He FIFO mechanism 
/follwed Karate to Perform the Queue Interface
/--in Java madhe FiFO Mechanism He Compulsary Nahi ahet LIFO Ha MEchanishm Pan Chalate to Perform The Queue.
/----LinkedList<T>
/Function1():-Integer
/Function2():-String
/Function3():-Double
/
/---------------------------------Inbuilt Method in Queue As LinkedList()--------------------------------
/	1.add() or offer():- Used Both Method To Add The Element In LinkedList as Queue.
/	2.remove or poll():- Used Both Method To Delete The Element From LinkedList.
/	3.size()  :-Used size() Method To calculate The Number Of Elements Of LinkedList
/	4.clear() :-Used clear() Method to Delete The All Elments in Queue.
/	5.isEmpty():-Used isEmpty() Method To Check the Queue is Empty Or Not
/	6.peek() or element() :-Used Both Method to add First Element of Linkedlist in Another Variable using peek() or element() Method.	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/


/*
import java.util.*;
class Queue1
{

	void Function1()
	{
		Queue<Integer>obj1=new LinkedList<Integer>();
			
		obj1.add(11);		//used add() or offer() Method To Add Elements In Queue
		obj1.add(21);
		obj1.add(51);
		obj1.offer(101);
		obj1.offer(201);
		obj1.offer(301);
		obj1.remove(101);
		obj1.poll();		//Used poll() or remove() To Delete The Elements from Queue
		obj1.remove();

		System.out.println("Size Of Elements In Queue:-"+obj1.size());
		System.out.println("Using For-Each Loop");
		for(Integer i:obj1)
		{

		System.out.println(i);
		}
		System.out.println("Using Iterator Interface");

		Iterator it=obj1.iterator();
			
		while(it.hasNext())
		{
			int i=(int)it.next();
			System.out.println(i);

		}			
			
		int i=obj1.peek();		//Used peek() Method to Store the first Element into Another Variable Of Queue.

			System.out.println("Used size() Method Calculate Number of Elements In Queue:-"+obj1.size());
			System.out.println();
		
			System.out.println("Used isEmpty() Method To Check The Queue Is Empty Or Not:-"+obj1.isEmpty());
			System.out.println();
			System.out.println("Used clear() Method To Clear The All Elements In Queue");
			obj1.clear();
			System.out.println("After Calling clear() Method");
			System.out.println("Used size() Method Calculate Number of Elements In Queue:-"+obj1.size());
			System.out.println();
			System.out.println("Used isEmpty() Method To Check The Queue Is Empty Or Not:-"+obj1.isEmpty());
						
			System.out.println(i);
	
	}


	void Function2()
	{
		Queue<String>obj2=new LinkedList<>();
			
		obj2.add("Every");		//used add() or offer() Method To Add Elements In Queue
		obj2.add("Thing");
		obj2.add("Is");
		obj2.offer("Possible");
		obj2.offer("If");
		obj2.offer("You");
		obj2.offer("Believe");
		obj2.remove("Believe");
		obj2.poll();		//Used poll() or remove() To Delete The Elements from Queue
		obj2.remove();

		System.out.println("Size Of Elements In Queue:-"+obj2.size());
		System.out.println("Using For-Each Loop");
		for(String i:obj2)
		{

		System.out.println(i);
		}
		System.out.println("Using Iterator Interface");

		Iterator it=obj2.iterator();
			
		while(it.hasNext())
		{
			String i=(String)it.next();
			System.out.println(i);

		}			
			
		String i=obj2.peek();		//Used peek() Method to Store the first Element into Another Variable Of Queue.		

			System.out.println("Used size() Method Calculate Number of Elements In Queue:-"+obj2.size());
			System.out.println();
		
			System.out.println("Used isEmpty() Method To Check The Queue Is Empty Or Not:-"+obj2.isEmpty());
			System.out.println();
			System.out.println("Used clear() Method To Clear The All Elements In Queue");
			obj2.clear();
			System.out.println("After Calling clear() Method");
			System.out.println("Used size() Method Calculate Number of Elements In Queue:-"+obj2.size());
			System.out.println();
			System.out.println("Used isEmpty() Method To Check The Queue Is Empty Or Not:-"+obj2.isEmpty());
						
			System.out.println(i);
	
	}

	void Function3()
	{
		Queue<Double>obj3=new LinkedList<>();
			
		obj3.add(11.1);		//used add() or offer() Method To Add Elements In Queue
		obj3.add(12.2);
		obj3.add(13.3);
		obj3.offer(14.4);
		obj3.offer(15.5);
		obj3.offer(16.6);
		obj3.offer(17.7);
		obj3.remove(15.5);
		obj3.poll();		//Used poll() or remove() To Delete The Elements from Queue
		obj3.remove();

		System.out.println("Size Of Elements In Queue:-"+obj3.size());
		System.out.println("Using For-Each Loop");
		for(Double i:obj3)
		{

		System.out.println(i);
		}
		System.out.println("Using Iterator Interface");

		Iterator it=obj3.iterator();
			
		while(it.hasNext())
		{
			Double i=(Double)it.next();
			System.out.println(i);

		}			
			
		Double i=obj3.peek();		//Used peek() Method to Store the first Element into Another Variable Of Queue.		

			System.out.println("Used size() Method Calculate Number of Elements In Queue:-"+obj3.size());
			System.out.println();
		
			System.out.println("Used isEmpty() Method To Check The Queue Is Empty Or Not:-"+obj3.isEmpty());
			System.out.println();
			System.out.println("Used clear() Method To Clear The All Elements In Queue");
			obj3.clear();
			System.out.println("After Calling clear() Method");
			System.out.println("Used size() Method Calculate Number of Elements In Queue:-"+obj3.size());
			System.out.println();
			System.out.println("Used isEmpty() Method To Check The Queue Is Empty Or Not:-"+obj3.isEmpty());
						
			System.out.println("Used peek() Method To Store peek The First Elmement:-"+i);
	
	}

}
class CollectionFrame
{
	public static void main(String arga[])
	{

		Queue1 obj2=new Queue1();
		obj2.Function1();
		System.out.println();
			
		obj2.Function2();
		System.out.println();	
		
		obj2.Function3();	
	}

}
*/

/*//////////////////////////////////////////////////////////////////////////////////////////////////////
/------------------------------------Examples Base On List---------------------------------------------
/-----------1.Stack----------
/--Stack Represent LIFO Mechanism
/--Jo Element Pahile Insert Honar Toch Element Pahile Remove Honar
/----Stack Madhe Ekach Side on Aste Element Insert Karayala Tyalach Top Mhanatat.
/Function1():-Integer
/Function2():-String
/---------------------InBuilt Method Of Stack---------------------------------
/1.push() :-To Add Elements
/2.pop()  :-To Remove Elements
/3.isEmpty():- To check Stack Is Empty or Not.
/4.size():-To Calculate The Size Of Stack
/5.peep():-To Return The Top Most Elements In Stack.
///////////////////////////////////////////////////////////////////////////////////////////////////////*/

/*
import java.util.*;

class Stack1
{
	void Function1()
	{
		Stack<Integer>obj1=new Stack<Integer>();
		
		obj1.push(11);
		obj1.push(21);
		obj1.push(51);
		obj1.push(71);
		obj1.push(91);
		obj1.push(101);
		obj1.pop();
		obj1.pop();
		obj1.pop();
		System.out.println(obj1);
		System.out.println(obj1.size());
		System.out.println(obj1.isEmpty());
		System.out.println();
		System.out.println("Using For-Each Loop");
		for(int i:obj1)
		{
			System.out.println(i);
		}

		System.out.println("Using Iterable Interface");
		Iterator it=obj1.iterator();

		while(it.hasNext())
		{
			int i=(int)it.next();
			System.out.println(i);

		}
		System.out.println("Using search() you Can Search The Specific Elements");
		System.out.println(obj1.search(11));

		System.out.println("Using peek() you Can return Top Most Elements in Stack");
		System.out.println(obj1.peek());
	
		obj1.clear();
		System.out.println("After clear() Method Call Using clear() Method You Can Delete All Element in Stack Like Another DS");
		System.out.println(obj1.size());
		System.out.println(obj1.isEmpty());
		

	}

	void Function2()
	{
		Stack<Double>obj3=new Stack<Double>();
		
		obj3.push(11.1);
		obj3.push(21.1);
		obj3.push(51.1);
		obj3.push(71.12);
		obj3.push(91.111);
		obj3.push(101.1);
		obj3.pop();
		obj3.pop();
		obj3.pop();
		System.out.println(obj3);
		System.out.println(obj3.size());
		System.out.println(obj3.isEmpty());
		System.out.println();
		System.out.println("Using For-Each Loop");
		for(Double i:obj3)
		{
			System.out.println(i);
		}

		System.out.println("Using Iterable Interface");
		Iterator it=obj3.iterator();

		while(it.hasNext())
		{
			double i=(double)it.next();
			System.out.println(i);

		}
		System.out.println("Using search() you Can Search The Specific Elements");
		System.out.println(obj3.search(11.1));

		System.out.println("Using peek() you Can return Top Most Elements in Stack");
		System.out.println(obj3.peek());
	
		obj3.clear();
		System.out.println("After clear() Method Call Using clear() Method You Can Delete All Element in Stack Like Another DS");
		System.out.println(obj3.size());
		System.out.println(obj3.isEmpty());
		}
}

class CollectionFrame
{
	public static void main(String args[])
	{
		Stack1 obj2=new Stack1();
		obj2.Function1();
		System.out.println();
		obj2.Function2();
	}



}
*/

/*//////////////////////////////////////////////////////////////////////////////////////////////////////
/------------------------------------Examples Base On List---------------------------------------------
/-----------2.LinkedList----------
/--Ya madhe LinkedList Hi Node Chya Form Madhe Contain Keleli Aste
/--Like C And C++ Madhe Ji LinkedList Swatachi Create Karat Hoto Tasi.
/--yamdhe LinkedlIst Hi Doubly Linear Chya Format Madhe Aste.
/--Yamdhe LinkedList Hi 0th Index Pasun Suru Hote.
/
/Function1():-Integer
/Function2():-String
/---------------------InBuilt Method Of LinkedList---------------------------------
/1.add() :-To Add Elements
/2.addFirst()  :-To Add The Element At First Positon
/3.addLast():- To Add The Element At Last Positon
/4.add(index,data):-To Add The Element At Specific Positon Where you Want to Insert
/5.remove():-Fact Remove() Method Call Keli Tar FIFO Mechanism Call Hote(jo Pahila Insert Zala Toch pahile Delete Hoto)
/6.removeFirst():-To Remove The Element At First Positon
/7.removeLast():-To Remove The Element At Last Positon
/8.remove(int(:-To Remove The Element At Specific Positon From Where you Want to Remove
/9.clear():-To Delete The All Elements From LinkedList
/10.isEmpty():-To Check The LinkedList Is Empty Or Not.
/11.size():-To Calculae Number Of Elments of LinkedList.
/12.indexOf(int):-To Check The First Index Of Specific Element.
/13.lastIndexOf(int):-To Check The Last Index Of Specific Element.

Ya Varchya Purn Method Tyach ahe Jya C and C++ Madhe Apan Swata Banawalya Hotya.
///////////////////////////////////////////////////////////////////////////////////////////////////////*/

/*
import java.util.*;

class LinkedList1
{

	void Function1()
	{
		LinkedList<Integer>obj1=new LinkedList<Integer>();

		obj1.add(11);
		obj1.add(21);
		obj1.add(51);
		obj1.add(51);
		obj1.add(71);
		obj1.add(91);
		obj1.addFirst(420);		
		obj1.addFirst(421);		
		obj1.addLast(720);		
		obj1.addLast(721);
		obj1.add(5,721);
		obj1.add(51);		
		System.out.println(obj1);
		
		obj1.removeFirst();		
		System.out.println("Used removeFirst() Method To Delete the First Element:-");
		System.out.println(obj1);
		System.out.println();

		System.out.println("Used removeLast() Method To Delete the Last Element:-");
		obj1.removeLast();
		System.out.println(obj1);
		System.out.println();

		System.out.println("Used remove(int) Method To Delete the At Postion Element:-");
		obj1.remove(5);		
		System.out.println(obj1);
		System.out.println();
		
		System.out.println("Used size() Method To Find The Size Of LinkedList");
		System.out.println(obj1.size());
		System.out.println();
		
		System.out.println("Used isEmpty() Method To Check The LinkedList Empty Or Not");
		System.out.println(obj1.isEmpty());
		System.out.println();
		
		obj1.add(51);
		
		System.out.println(obj1);
		System.out.println(obj1.indexOf(420));
		System.out.println(obj1.lastIndexOf(51));

		obj1.clear();
		System.out.println("Used clear() Method To Delete The All Elements in LinkedList");
		System.out.println("After clear() Method call");
		System.out.println(obj1.size());		
		System.out.println(obj1.isEmpty());
				
	}


	void Function2()
	{
		LinkedList<String>obj3=new LinkedList<String>();

		obj3.add("abc");
		obj3.add("def");
		obj3.add("ghi");
		obj3.add("jkl");
		obj3.add("mno");
		obj3.add("pqr");
		obj3.addFirst("stu");		
		obj3.addFirst("vwx");		
		obj3.addLast("yz");		
		obj3.addLast("asd");
		obj3.add(5,"rrr");
		obj3.add("xyz");		
		System.out.println(obj3);

		obj3.removeFirst();		
		System.out.println("Used removeFirst() Method To Delete the First Element:-");
		System.out.println(obj3);
		System.out.println();

		System.out.println("Used removeLast() Method To Delete the Last Element:-");
		obj3.removeLast();
		System.out.println(obj3);
		System.out.println();

		System.out.println("Used remove(int) Method To Delete the At Postion Element:-");
		obj3.remove(5);		
		System.out.println(obj3);
		System.out.println();
		
		System.out.println("Used size() Method To Find The Size Of LinkedList");
		System.out.println(obj3.size());
		System.out.println();
		
		System.out.println("Used isEmpty() Method To Check The LinkedList Empty Or Not");
		System.out.println(obj3.isEmpty());
		System.out.println();
		
		obj3.addLast("xyt");
		
		System.out.println(obj3);
		System.out.println(obj3.indexOf("rrr"));
		System.out.println(obj3.lastIndexOf("rrr"));

		obj3.clear();
		System.out.println("Used clear() Method To Delete The All Elements in LinkedList");
		System.out.println("After clear() Method call");
		System.out.println(obj3.size());		
		System.out.println(obj3.isEmpty());
				
	}

}

class CollectionFrame
{
	public static void main(String args[])
	{
		LinkedList1 obj2=new LinkedList1();
		obj2.Function1();		
		System.out.print("\n");
		obj2.Function2();		
		

	}

}*/


/*//////////////////////////////////////////////////////////////////////////////////////////////////////
/------------------------------------Examples Base On List---------------------------------------------
/-----------3.ArrayList----------
/--ArrayList he Same array Sarakha Ahe Yamdhe Memory Pan Dynamically Allocated Hote.
/--Jase Jase Number Of Element He Vadat Jatat Tasi Tasi Memory Hi Allocated Hot Jate.
/--ArrayList He synchronized nahi Ahe.
/--ArrayList Intial Capacity Hi 10 Aste Memory Allocate Karanache.

/Function1():-Integer
/Function2():-Double
/---------------------InBuilt Method Of ArrayList---------------------------------
/1.add() :-To Add Elements
/2.add(index,data):-To Add The Element At Specific Positon Where you Want to Insert
/3.remove(int):-To Remove The Element At Specific Positon From Where you Want to Remove
/4.clear():-To Delete The All Elements From LinkedList
/5.isEmpty():-To Check The LinkedList Is Empty Or Not.
/6.size():-To Calculae Number Of Elments of LinkedList.
/7.indexOf(int):-To Check The First Index Of Specific Element.
/8.lastIndexOf(int):-To Check The Last Index Of Specific Element.
/9.contains():-To Check The Particular Elements Is Present or Not In ArrayList.
/10.get(int):-To Get The Element form specific Position Into Another Variable.
/11.set(int,int):-Using set()Method Apan Existing Element Ha replace Karu Shakto With Different Element.
/Ya Varchya Purn Method Tyach ahe Jya C and C++ Madhe Apan Swata Banawalya Hotya.
///////////////////////////////////////////////////////////////////////////////////////////////////////*/

/*
import java.util.*;
class ArrayList1
{

	void Function1()
	{
		ArrayList<Integer>obj1=new ArrayList<Integer>(12);
		obj1.add(11);	
		obj1.add(21);
		obj1.add(11);
		obj1.add(41);		
		obj1.add(51);
		obj1.add(3-1,720);		
		obj1.add(61);
		obj1.add(71);		
		System.out.println(obj1);		

		System.out.println("Using For-Each Loop");
		for(int i:obj1)
		{
			System.out.println(i);
		}
		
		System.out.println("Using Iterator Interface");
		Iterator it=obj1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());

		}
		System.out.println("After remove(int) Method Call");
		obj1.remove(3-1);
		obj1.remove(0);
		System.out.println(obj1);
		System.out.println();
	
		System.out.println("Used size() Method to Calculate The Number Of Elements In ArrayList");
		System.out.println(obj1.size());
		System.out.println();
	
		System.out.println("Used isEmpty() Method to Check The ArrayList Is Empty Or Not");
		System.out.println(obj1.isEmpty());
		System.out.println();
		obj1.add(21);
		System.out.println(obj1.indexOf(21));
	
		System.out.println(obj1.lastIndexOf(20));
		System.out.println(obj1);

		System.out.println("Used contains() Method To Check The Specific Element Is Present Or Not");
		System.out.println(obj1.contains(111));

		System.out.println("Used get() Method To Copy the Particular elment in Another Variable");
		int m=obj1.get(4);
		System.out.println("Get Element Is:-"+m);
	
		obj1.clear();
		
		System.out.println("Used clear() Method To Delete The All Elements in ArrayList");
		System.out.println("After clear() Method Call");
		System.out.println(obj1.size());
		System.out.println(obj1.isEmpty());
				
	}

	void Function2()
	{
		ArrayList<Double>obj2=new ArrayList<Double>();
		obj2.add(11.1);	
		obj2.add(21.1);
		obj2.add(11.1);
		obj2.add(41.1);		
		obj2.add(51.1);
		obj2.add(3-1,720.1);		
		obj2.add(61.1);
		obj2.add(71.12);		
		System.out.println(obj2);		

		System.out.println("Using For-Each Loop");
		for(Double i:obj2)
		{
			System.out.println(i);
		}
		
		System.out.println("Using Iterator Interface");
		Iterator it=obj2.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());

		}
		System.out.println("After remove(int) Method Call");
		obj2.remove(3-1);
		obj2.remove(0);
		System.out.println(obj2);
		System.out.println();
	
		System.out.println("Used size() Method to Calculate The Number Of Elements In ArrayList");
		System.out.println(obj2.size());
		System.out.println();
	
		System.out.println("Used isEmpty() Method to Check The ArrayList Is Empty Or Not");
		System.out.println(obj2.isEmpty());
		System.out.println();
		obj2.add(21.1);
		System.out.println(obj2.indexOf(21.1));
	
		System.out.println(obj2.lastIndexOf(20.1));
		System.out.println(obj2);

		System.out.println("Used contains() Method To Check The Specific Element Is Present Or Not");
		System.out.println(obj2.contains(71.12));

		System.out.println("Used get() Method To Copy the Particular elment in Another Variable");
		double m=obj2.get(4);
		System.out.println("Get Element Is:-"+m);
	
		obj2.clear();
		
		System.out.println("Used clear() Method To Delete The All Elements in ArrayList");
		System.out.println("After clear() Method Call");
		System.out.println(obj2.size());
		System.out.println(obj2.isEmpty());
				
	}

}
class CollectionFrame
{

	public static void main(String args[])
	{

		ArrayList1 obj2=new ArrayList1();
		obj2.Function1();
		System.out.println();
		obj2.Function2();
	}

}
*/


/*//////////////////////////////////////////////////////////////////////////////////////////////////////
/------------------------------------Examples Base On List---------------------------------------------
/-----------4.Vector----------
/---Vector Also Store The elements(Object) Similar ArrayList() But Vector is synchronized.
/--Vector Madhe Purn Same Tyach method Ahet Jya ArrayList Madhe Ahet.
/Function1():-Integer
/---------------------InBuilt Method Of Vector---------------------------------
/1.add() :-To Add Elements
/2.add(index,data):-To Add The Element At Specific Positon Where you Want to Insert
/3.remove(int):-To Remove The Element At Specific Positon From Where you Want to Remove
/4.clear():-To Delete The All Elements From LinkedList
/5.isEmpty():-To Check The LinkedList Is Empty Or Not.
/6.size():-To Calculae Number Of Elments of LinkedList.
/7.indexOf(int):-To Check The First Index Of Specific Element.
/8.lastIndexOf(int):-To Check The Last Index Of Specific Element.
/9.contains():-To Check The Particular Elements Is Present or Not In ArrayList.
/10.get(int):-To Get The Element form specific Position Into Another Variable.
/11.set(int,int):-Using set()Method Apan Existing Element Ha replace Karu Shakto With Different Element.
/--Ya Varchya Purn Method Tyach ahe Jya C and C++ Madhe Apan Swata Banawalya Hotya.
/--ArrayList Ani Vector Donhi Same ahe Fact ArrayList Synchronization Fallow Nahi Karat Tar Vector synchronization Fallow Karate.
/------------------------------------Difference Between ArrayList And Vector------------------------------------------
/		ArrayList					Vector
/	1.ArrayList By Default Synchronized Naste	1.Vector By Default Synchronized Aste.
/	2.Single Thread Sobat ArrayList Fast Aste.	2.Single Thread Sobat Vector Slow Aste.
///////////////////////////////////////////////////////////////////////////////////////////////////////*/

/*
import java.util.*;
class Vector1
{
	void Function1()
	{
		Vector<Integer>obj1=new Vector<>();
		obj1.add(11);
		obj1.add(21);
		obj1.add(31);
		obj1.add(41);
		obj1.add(51);
		obj1.add(3-1,720);
		obj1.add(1);

	System.out.println("Using For-Each Loop");
		for(int i:obj1)
		{

			System.out.println(i);

		}
	
	System.out.println("Using iterator Interface");
		
		Iterator it=obj1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}		
	
	System.out.println("Size:-"+obj1.size());
	System.out.println(obj1.isEmpty());


	System.out.println("After remove() Method Call");
	obj1.remove(2);
	System.out.println(obj1);	

	int i=obj1.get(3);
	System.out.println(i);

	obj1.set(3,420);
	System.out.println("After Replace Existing Element With Another Element");
	System.out.println(obj1);

	obj1.clear();
	System.out.println("Used clear() Method to Delete All Elements In Vector");
	System.out.println("After clear() Method call");
	System.out.println(obj1);
	System.out.println(obj1.size());
	System.out.println(obj1.isEmpty());
	}


}
class CollectionFrame
{
	public static void main(String args[])
	{
		Vector1 obj2=new Vector1();
		obj2.Function1();

	}

}*/


/*///////////////////////////////////////////////////////////////////////////////////////////////////
---------------------------------Examples Base On Map------------------------------------------
/-------------------HashMap--------------------------------------
/--HashMap and Hashtable He Elements Key-Value Format Madhe Store Hote.
/--key Hi Unique(Vegali)Pahije Jar Same Key Apan Used Keli Tar Tyach Key Var data Ha Overwrite Hote.
/--Using Key Apan Tya Particular Key Cha Data Ha Retrive(Access)Karu Shakto.
/HashMap And Hashtable Donhi Yat Fact synchronized Cha Farak Ahet
/----------------------------InBuilt Method Of HashMap-----------------------------------s 
/	1.put():-To Used The Inserted The Data In Key-Value Format
/	2.remove(Key):-To Used the Delete The Value Using That Value Key
/	3.clear():-Used To Delete All The Elements In HashMap
/	4.isEmpty():-Used To Check The HashMap Is Empty or Not.
/	5.size():-To Find Number Of Elements Of HashMap
/	6.get(key):-used To Display Value UsingKey
/	7.keySet():-Used The Inserted All Key In One Object.
/	8.values():-Used The Inserted All The Value In One Object.
/////////////////////////////////////////////////////////////////////////////////////////////////////*/
/*
import java.util.*;
class HashMap1
{
	void Function1()
	{
		HashMap<String,Integer>obj1=new HashMap<>();
		obj1.put("Myur",134567);	
		obj1.put("ags",1234567);
		obj1.put("Mayur",1234567);
		obj1.put("loi",1234567);
		obj1.put("asd",1234567);
		
		System.out.println(obj1.size());
		System.out.println(obj1.isEmpty());
		obj1.remove("ags");
		System.out.println(obj1.size());
		
		Set ss;
		ss=obj1.keySet();
		System.out.println("Key:-"+ss);		
	
		
		Collection sd;
		sd=obj1.values();
		System.out.println("Values:-"+sd);	



		System.out.println("After clear() Method Call");
		obj1.clear();		
		System.out.println(obj1.size());
		System.out.println(obj1.isEmpty());
	


	}

}
class CollectionFrame
{
	public static void main(String args[])	
	{
		HashMap1 ss=new HashMap1();
		ss.Function1();
	}
}
*/


import java.util.*;
import java.io.*;

class CollectionFrame
{
	public static void main(String args[])throws Exception
	{
		
		BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String:-");		
		String str=BF.readLine();
		String str2="EveryThing Is Possible If You Believe";
		StringTokenizer st=new StringTokenizer(str2," ");

		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}	
	
		
		
	}





}
