package facebook.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import in.facebook.BaseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookLogin extends BaseClass {
	public static String First;
	public static String surname;
	public static BaseClass base = new BaseClass();
	
	
	@Given("Launch the browser and appilication {string}")
	public void launch_the_browser_and_appilication(String url) throws IOException {
		File f = new File("C:\\Users\\DINESH KUMAR\\eclipse-workspace\\FaceBook\\src\\test\\resources\\FeatureFiles\\Utilities.property");
		FileInputStream f1 = new FileInputStream(f);
		Properties pro = new Properties();
		pro.load(f1);
		String file=pro.getProperty("file");
		String url1 =pro.getProperty("url");
		
		FileOutputStream fo = new FileOutputStream(f);
		pro.setProperty("urlQa","https://www.redbus.in.qa");
		pro.save(fo,"Update QA URL");
		System.out.println(file +"and"+url1);
		base.launchApplication(url);
		

	}

	@When("User click on create new account")
	public void user_click_on_create_new_account() {
		WebElement date = driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
		base.button(date);
	}
	@When("User enters the value in First name {string}")
	public void user_enters_the_value_in_First_name(String Firstname) throws InterruptedException {

		Thread.sleep(5000);
	 WebElement element = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
	 base.inputKeys(element, Firstname);

	}

	@When("User enters the value in surname {string}")
	public void user_enters_the_value_in_surname(String Surname) throws InterruptedException {
		Thread.sleep(5000);
		 WebElement element = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		 base.inputKeys(element, Surname);


	}
	@When("User enters the value in mobile number or email address {string}")
	public void user_enters_the_value_in_mobile_number_or_email_address(String MobileNo) throws InterruptedException {
		Thread.sleep(5000);
		 WebElement element = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		 base.inputKeys(element, MobileNo);

	}

	
	@When("User enters a new Password {string}")
	public void user_enters_a_new_Password(String Password) throws InterruptedException {
		Thread.sleep(5000);
		 WebElement element = driver.findElement(By.xpath("//input[@data-type=\"password\"]"));
		 base.inputKeys(element, Password);
	}
	

	@When("User selects a Date of birth {string} {string} {string}")
	public void user_selects_a_Date_of_birth(String string, String string2, String string3) {
		 WebElement element = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		 base.inputKeys(element, string3); 
		 WebElement element1 = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		 base.inputKeys(element1, string2);
		 WebElement element2 = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		 base.inputKeys(element2, string);
		 
	}

	@When("User clicks on Gender {string}")
	public void user_clicks_on_Gender(String Gender) {
		 WebElement element = driver.findElement(By.xpath("//label[text()='Male']"));
		base. button(element);
		
	}

	@When("User clicks on Sign up")
	public void user_clicks_on_Sign_up() {
		 WebElement element = driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
		 base.button(element);
	}
	@Then("User TakeScreenShot")
	public void user_TakeScreenShot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\DINESH KUMAR\\eclipse-workspace\\FaceBook\\target\\dinesh4.png");
		FileUtils.copyFile(src, des);
	
}
}

	