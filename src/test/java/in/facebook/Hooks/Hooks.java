package in.facebook.Hooks;

import java.security.PublicKey;

import org.junit.BeforeClass;

import in.facebook.BaseClass.BaseClass;
import io.cucumber.java.After;

public class Hooks {
	BaseClass base = new BaseClass();
	
	@BeforeClass
	public void launchApplication() {
		base.launchApplication(null);

	}
	@After
	public void closeApplication() {
		base.closingBrowser();
	}
	

}
