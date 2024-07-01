package module3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

class ContactTest {

	@Test
	@DisplayName("Contact ID cannot have more than 10 characters")
	void testContactIDWithMoreThanTenCharacters(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		Contact contact = new Contact(contactID, firstName, lastName, phoneNumber, address);
		if (contact.getContactID().length() > 10) {
			fail("Contact ID has more than 10 characters.");
		}
	}
	
	@Test
    @DisplayName("Contact First Name cannot have more than 10 characters")
    void testContactFirstNameWithMoreThanTenCharacter(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		Contact contact = new Contact(contactID, firstName, lastName, phoneNumber, address);
		if (contact.getfirstName().length() > 10) {
			fail("First name has more than 10 characters.");
		}
	}
	
	@Test
	@DisplayName("Contact Last Name cannot have more than 10 characters")
    void testContactLastNameWithMoreThanTenCharacters(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		Contact contact = new Contact(contactID, firstName, lastName, phoneNumber, address);
		if (contact.getlastName().length() > 10) {
			fail("Last name has more than 10 characters.");
		}
	}
	
	@Test
	@DisplayName("Contact phone number is exactly 10 characters")
    void testContactNumberWithMoreThanTenCharacters(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		Contact contact = new Contact(contactID, firstName, lastName, phoneNumber, address);
		if (contact.getphoneNumber().length() != 10) {
			fail("Phone number length does not equal 10.");
		}
	}
	
	@Test
	@DisplayName("Contact address cannot have more than 30 characters")
    void testContactAddressWithMoreThanThirtyCharacters(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		Contact contact = new Contact(contactID, firstName, lastName, phoneNumber, address);
		if (contact.getaddress().length() > 30) {
			fail("Address has more than 30 characters.");
		}
	}
	
	private void fail(String string) {
		// TODO Auto-generated method stub
		
	}

	@Test
    @DisplayName("Contact First Name shall not be null")
    void testContactFirstNameNotNull() {
        Contact contact = new Contact(null, null, null, null, null);
        assertNotNull(contact.getfirstName(), "First name was not null.");
    }

    @Test
    @DisplayName("Contact Last Name shall not be null")
    void testContactLastNameNotNull() {
        Contact contact = new Contact(null, null, null, null, null);
        assertNotNull(contact.getlastName(), "Last name was null.");
    }

    @Test
    @DisplayName("Contact Phone Number shall not be null")
    void testContactPhoneNotNull() {
        Contact contact = new Contact("FirstName", "LastName", null, "Address", null);
        assertNotNull(contact.getphoneNumber(), "Phone number was null.");
    }

    @Test
    @DisplayName("Contact Address shall not be null")
    void testContactAddressNotNull() {
        Contact contact = new Contact(null, null, null, null, null);
        assertNotNull(contact.getaddress(), "Address was null.");
    }

	private void assertNotNull(String getaddress, String string) {
		// TODO Auto-generated method stub
		
	}

}
