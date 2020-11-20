package org.apache.commons.mail;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailTest {
	private EmailConcrete email;
	
	private static String[] TEST_EMAILS = {"ab@bc.com", "a.b@c.org", "abcdefghijklmnopqrst@abcdefghijklmnopqrst.com.bd"};
	private static String[] BAD_TEST_EMAILS = {};
	
	@Before
	public void setUpEmailTest() throws Exception{
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception{}
	
	//testing addBcc(String... emails) with good input
		@Test
		public void testAddBcc() throws Exception{
			email.addBcc(TEST_EMAILS);
			assertEquals(3, email.getBccAddresses().size());	
		}
	
		//test addCc(String email)
		@Test
		public void testAddCc() throws Exception{
			email.addCc(TEST_EMAILS[1]);
			assertNotNull(email.getCcAddresses());
			assertEquals(1, email.getCcAddresses().size());	
		}
		
}
