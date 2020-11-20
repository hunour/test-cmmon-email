package org.apache.commons.mail;

import org.junit.Before;

public class EmailTest {
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception{
		email = new EmailConcrete();
	}
}
