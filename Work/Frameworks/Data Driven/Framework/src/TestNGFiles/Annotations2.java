package TestNGFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotations2 {

	@BeforeSuite
	public void InstallSoftware() {
		System.out.println("I am First");
	}

	@AfterSuite
	public void DeInstallSoftware() {
		System.out.println("I am Last");
	}
}
