package org.apache.commons.mail;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailTest {
	private EmailConcrete email;
	
	private static String[] TEST_EMAILS = {"ab@bc.com", "a.b@c.org", "abcdefghijklmnopqrst@abcdefghijklmnopqrst.com.bd"};
	private static String[] BAD_TEST_EMAILS = {};
	
	private static String goodHeaderName = "headerName";
	private static String goodHeaderValue = "some header value";
	
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
		
		//test addHeader(String name, String value)
		@Test
		public void testAddHeader() throws Exception{
			email.addHeader(this.goodHeaderName, this.goodHeaderValue);
		}
		
		@Test (expected = IllegalArgumentException.class)
		public void testAddHeaderNullVal() throws Exception{
			String name = "TestHeader";
			email.addHeader(name, null);
		}
		
		@Test (expected = IllegalArgumentException.class)
		public void testAddHeaderNullName() throws Exception{
			String value = "1";
			email.addHeader(null, value);
		}
		
		
}
