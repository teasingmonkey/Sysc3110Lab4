
import java.util.*;
public class AddressBook {
	//public BuddyInfo b;
	public ArrayList<BuddyInfo> A;
	
	AddressBook()
	{
		A = new ArrayList<BuddyInfo>();

	}
	
	AddressBook(BuddyInfo c)
	{
		A = new ArrayList<BuddyInfo>();
		A.add(c);
	}
	
	public void addb(BuddyInfo b)
	{
		A.add(b);
	}
	
	public void addBuddy(String s, String t, int i) // name , add, phone
	{
		 BuddyInfo b;
		 b =new BuddyInfo(s,t,i);
		 A.add(b);
	}
	
	public BuddyInfo getBuddy(int i)
	{
		return A.get(i);
	}	

}
