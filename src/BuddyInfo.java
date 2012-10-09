import java.lang.*;

public class BuddyInfo {

	/**
	 * @param args
	 */
    String BuddyName;
    String BuddyAddress; 
    String buddyUniversity;
    int BuddyPhone;
    int BuddyAge;
    
    
    
    public BuddyInfo()
    {
    	
    }
	public BuddyInfo(String BuddyName, String BuddyAddress, String buddyUniversity,int BuddyPhone, int BuddyAge)
	{
		this.BuddyName = BuddyName;
		this.BuddyAddress = BuddyAddress;
		this.BuddyAge = BuddyAge;
		this.BuddyPhone = BuddyPhone;
		this.buddyUniversity = buddyUniversity;
	}
     	
	public String getBuddyName() {
		return BuddyName;
	}






	public void setBuddyName(String buddyName) {
		BuddyName = buddyName;
	}






	public String getBuddyAddress() {
		return BuddyAddress;
	}






	public void setBuddyAddress(String buddyAddress) {
		BuddyAddress = buddyAddress;
	}






	public String getBuddyUniversity() {
		return buddyUniversity;
	}






	public void setBuddyUniversity(String buddyUniversity) {
		this.buddyUniversity = buddyUniversity;
	}






	public int getBuddyPhone() {
		return BuddyPhone;
	}






	public void setBuddyPhone(int buddyPhone) {
		BuddyPhone = buddyPhone;
	}






	public int getBuddyAge() {
		return BuddyAge;
	}






	public void setBuddyAge(int buddyAge) {
		BuddyAge = buddyAge;
	}






	/**public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nishant Bhasin - 100822060");
		System.out.println("Hello World!");
		BuddyInfo Buddy;
		Buddy = new BuddyInfo();
		Buddy.setBuddyName("Homer");
		Buddy.setBuddyAddress("742 Evergreen Terrace");
		System.out.println("Name : " +Buddy.getBuddyName());
		System.out.println("Address : " +Buddy.getBuddyAddress());

	}
	**/




}
