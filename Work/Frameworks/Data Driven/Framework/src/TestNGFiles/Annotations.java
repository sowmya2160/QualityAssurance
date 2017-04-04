package TestNGFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeMethod
	public void UserRegistration() {
		System.out.println("User Registration");
	}

	@BeforeTest
	public void Deletecookies() {
		System.out.println("Delete all the cookies in the browser");
	}

	@AfterTest
	public void CloseWindow() {
		System.out.println("Close window");
	}

	@Test
	public void OpeningBrowser() {
		System.out.println("Open Browser");
	}

	@Test
	public void FirstName() {
		System.out.println("First name is Ramakrishna");
	}

	@Test
	public void LastName() {
		System.out.println("Last name is krothapalli");
	}

	@Test
	public void GmailAddress() {
		System.out.println("Gmail Address is rk.krothapalli");
	}

	@AfterMethod
	public void DoneWithEntering()
	{
		System.out.println("Done with Entering");
	}
	@Test
	public void Password() {
		System.out.println("Password is amenGOTO45");
	}

	@Test
	public void Submit() {
		System.out.println("Click on Submit button");
	}
}
