package TestNGFiles;

import org.testng.annotations.Test;

public class DependencyAnnotations {
	@Test
	public void OpeningBrowser() {
		System.out.println("Open Browser");
	}

	@Test(dependsOnMethods = { "OpeningBrowser" })
	public void FirstName() {
		System.out.println("First name is Ramakrishna");
	}

	@Test(dependsOnMethods = { "FirstName" })
	public void LastName() {
		System.out.println("Last name is krothapalli");
	}

	@Test(dependsOnMethods = { "LastName" })
	public void GmailAddress() {
		System.out.println("Gmail Address is rk.krothapalli");
	}

	@Test(dependsOnMethods = { "GmailAddress" })
	public void Password() {
		System.out.println("Password is amenGOTO45");
	}

	@Test(dependsOnMethods = { "Password" })
	public void Submit() {
		System.out.println("Click on Submit button");
	}
}
