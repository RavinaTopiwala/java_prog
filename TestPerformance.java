import java.util.*;
class TestPerformance
{
	public static void main(String args[])
	{
		List list1=new ArrayList();
		List list2=new LinkedList();
		addList(list1);
		addList(list2);
		System.out.println("Display List For Array");
		dispList(list1);
		System.out.println("Display List For Linked list");
		//Only to stop in between so that we can see the result of previous function
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//read integer
		dispList(list2);
		//System.out.println("Timeto iterate ArrayList = "+dispList);
		
		
	}
	//add element into list
	public static void addList(List list)
	{
		int i;
		for(i=0;i<50000;i++)
		{
			list.add("Ravina"+(i+1));
		}
	}
	//display element of list
	public static void dispList(List list)
	{
		int i;
		//Date date=new Date();
		long startTime= new Date().getTime();
		for(i=0;i<50000;i++)
		{
			
			System.out.println(list.get(i));
		}
		
		long endTime=new Date().getTime();
		System.out.println("Start Time = "+startTime);
		System.out.println("End Time = "+endTime);
		
		System.out.println("Time Taken ="+(endTime-startTime)/1000);
		
	}
}