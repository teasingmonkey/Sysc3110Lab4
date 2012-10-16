
public class BuddyInfo {

	/**
	 * @param args
	 */
    String BuddyName;
    String BuddyAddress; 
    int BuddyPhone;

    
    
	public BuddyInfo(String BuddyName, String BuddyAddress, int BuddyPhone)
	{
		this.BuddyName = BuddyName;
		this.BuddyAddress = BuddyAddress;
		this.BuddyPhone = BuddyPhone;
	}
	
  

     	

	public void setBuddyName(String buddyName) {
		BuddyName = buddyName;
	}

	public String getBuddyName() {
		return BuddyName;
	}


	public void setBuddyAddress(String buddyAddress) {
		BuddyAddress = buddyAddress;
	}
	
	public String getBuddyAddress() {
		return BuddyAddress;
	}


	public void setBuddyPhone(int buddyPhone) {
		BuddyPhone = buddyPhone;
	}


	public int getBuddyPhone() {
		return BuddyPhone;
	}
	
	public String tostr()
	{
		String s = "";
		s = s + "Buddy Name : " + getBuddyName() + ", Buddy Phone :" + getBuddyPhone()+ ", Buddy Address :" + getBuddyAddress();
		return s;
	}

}
