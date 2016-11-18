import java.util.*;
class CollectionExample2

{
  public static void main(String args[])
  {
     List<String> list=new ArrayList<String>();
	 list.add("Ravina");
	 list.add("Poojha");
	 list.add("Diya");
	 remove();
  }
   public static void remove(List<String> list)
  {
     Iterator it=list.iterator();
	 while(it.hasNext())
	 {
	   System.out.println(it.next());
	 }
  }
}