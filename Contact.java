package module3;

public class Contact {
	String contactID;
	String firstName;
	String lastName;
	String phoneNumber;
	String address;
	
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		super();
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public String getContactID() {
		return contactID;
	}
	
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getaddress() {
		return address;
	}
	
	public void setaddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Contact [contactID=" + contactID + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber" + phoneNumber + ", address=" + address + "]";
	}
	
}
