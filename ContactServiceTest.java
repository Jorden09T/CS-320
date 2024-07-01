package module3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	
	@Test
	public void testAdd() {
		ContactService cs = new ContactService();
		Contact test1 = new Contact("1413252", "Libby", "Brown", "555555555", "Atlantis");
		assertEquals(true, cs.addContact(test1));
	}
	
	private void assertEquals(boolean b, boolean addContact) {
		// TODO Auto-generated method stub
		
	}
	
	@Test public void testDelete() {
		ContactService cs = new ContactService();
		
		Contact test1 = new Contact("2418553", "Lane", "North", "23565555", "Narnia");
		Contact test2 = new Contact("8954523", "Alek", "Talyor", "56455462", "North Pole");
		Contact test3 = new Contact("6552232", "Ash", "Lae", "5689522", "Candy Land");
		
        cs.addContact(test1);
        cs.addContact(test2);
        cs.addContact(test3);

        assertEquals(true, cs.deleteContact("2418553"));
        assertEquals(false, cs.deleteContact("2418552"));
        assertEquals(false, cs.deleteContact("2418551"));
	}
	
	@Test public void testUpdate() {
		ContactService cs = new ContactService();
	
		Contact test1 = new Contact("2418553", "Lane", "North", "23565555", "Narnia");
		Contact test2 = new Contact("8954523", "Alek", "Talyor", "56455462", "North Pole");
		Contact test3 = new Contact("6552232", "Ash", "Lae", "5689522", "Candy Land");
		
        cs.addContact(test1);
        cs.addContact(test2);
        cs.addContact(test3);

        assertEquals(true, cs.updateContact("6552232", "Ash", "Lae", "5689522", "Far Far Away"));
        assertEquals(false, cs.updateContact("6552122", "Ash", "Lae", "5689522", "Far Far Away"));
	}
	
	
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

	private void fail(String string) {
		// TODO Auto-generated method stub
		
	}

}
