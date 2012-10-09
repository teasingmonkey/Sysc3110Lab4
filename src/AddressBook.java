
import java.util.*;
public class AddressBook {
	public BuddyInfo b;
	public ArrayList<BuddyInfo> A;
	AddressBook()
	{
		A = new ArrayList<BuddyInfo>();
		test();
	}
	AddressBook(BuddyInfo c)
	{
		A = new ArrayList<BuddyInfo>();
		A.add(c);
	}
	
	public void addBuddy(String BuddyName, String BuddyAddress, String buddyUniversity,int BuddyPhone, int BuddyAge)
	{
		A.add(new BuddyInfo(BuddyName,BuddyAddress,buddyUniversity,BuddyPhone,BuddyAge));
	}
	public String getName(int i)
	{
		return A.get(i).getBuddyName();
	}
	
	public void test()
	{
		BuddyInfo Buddy = new BuddyInfo();
		Buddy.setBuddyName("Homer");
		Buddy.setBuddyAddress("742 Evergreen Terrace");
		A.add(Buddy);
	}

}
