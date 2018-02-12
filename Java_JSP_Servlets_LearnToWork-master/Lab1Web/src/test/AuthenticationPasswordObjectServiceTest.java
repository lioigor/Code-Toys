package test;

import org.junit.*;

import lio.model.AuthenticationPassword;

public class AuthenticationPasswordObjectServiceTest {
	
	@Test
	public void shouldCreatePasswordAndReturnValidate(){
		
		AuthenticationPassword ap = new AuthenticationPassword("testing");
		
		Assert.assertTrue(ap.validate("testing"));
	}
	
	@Test
	public void checkWorkGetAndSet(){
		
		AuthenticationPassword ap = new AuthenticationPassword("testing");
		ap.setPassword("newPass");
		Assert.assertTrue(ap.getPassword().equals("newPass"));
	}

}
