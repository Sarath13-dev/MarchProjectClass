package com.logout;

import fb.login.ExistingUser;
import fb.login.NewUser;

//Child Class
public class Corporatelogin {

	private void multipleUsers() {
		System.out.println("multiple users can access the same account");
	}
	
	public static void main(String[] args) {
		
		Corporatelogin a = new Corporatelogin();
		a.multipleUsers();
		
		ExistingUser b = new ExistingUser();
		b.userName();
		b.password();
		
		NewUser c = new NewUser();
		c.name();
		c.address();
		
		
	}
	
}
