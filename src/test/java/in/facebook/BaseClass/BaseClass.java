package in.facebook.BaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements IBaseClass {

	public static WebDriver driver;
	static Actions action;
//	static JavascriptExecutor js;
	static TakesScreenshot screen;
	static Alert alert;
	
	
	public void browsersetup() {
		
		}
	public void launchApplication(String url) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("disable-notifications");
		options.addArguments("disable-popups");
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		action = new Actions(driver);
		driver.get(url);
	}
	public void closingBrowser() {
		driver.close();
	}
	public void closingCurrentTab() {
		driver.quit();
	}
	public String pageTilte() {
		String title = driver.getTitle();
		return title;
	}
	public String currentUrl() {
		String current = driver.getCurrentUrl();
		return current;
	}
	public String pageSource() {
		String page = driver.getPageSource();
		return page;
	}
	
	public void SendText(WebElement opt,String val) {
		opt.sendKeys(val);
		
	}
	public void button(WebElement opt) {
		opt.click();
	}
	public void attri(WebElement opt,String val) {
		opt.getAttribute(val);
	}
	public void css(WebElement opt,String val) {
		opt.getCssValue(val);
	}
	public boolean enable(WebElement opt) {
		boolean enabled = opt.isEnabled();
		return enabled;
	}
	public boolean display(WebElement opt) {
		boolean displayed = opt.isDisplayed();
		return displayed;
	}
	public boolean select(WebElement opt) {
		boolean selected = opt.isSelected();
		return selected;
	}

	public String text(WebElement opt) {
		String a = opt.getText();
		return a;
	}
	public void delete(WebElement opt) {
		opt.clear();
	}
	public void submitted(WebElement opt) {
		opt.submit();
	}
	public void move(WebElement opt) {
		action.moveToElement(opt).build().perform();
	}
	public void doublecli(WebElement opt) {
		action.doubleClick(opt).build().perform();
	}
	public void right(WebElement opt) {
		action.contextClick(opt).build().perform();
	}
	public void dragdrop(WebElement opt,WebElement opt2) {
		action.dragAndDrop(opt, opt2).perform();
	}
	public void press(WebElement opt) {
		action.click(opt).build().perform();
	}
	public void SendText(String val) {
		action.sendKeys(val).build().perform();
	}
	public void scroll(WebElement opt) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", opt);
	}
	public void button(WebElement opt, int a) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",opt);
	}
	public void byIndex(int index,WebElement opt) {
		Select s = new Select(opt);
		s.selectByIndex(index);
	}
	public void byvisible(String val,WebElement opt) {
		Select s = new Select(opt);
		s.selectByVisibleText(val);
	}
	public void byval(String val,WebElement opt) {
		Select s = new Select(opt);
		s.selectByVisibleText(val);
	}
	public void desIndex(int index,WebElement opt) {
		Select s = new Select(opt);
		s.deselectByIndex(index);
	}
	public void desval(String val,WebElement opt) {
		Select s = new Select(opt);
		s.deselectByValue(val);
	}
	public void desbyVisible(String val,WebElement opt) {
		Select s = new Select(opt);
		s.deselectByVisibleText(val);
	}
	public boolean mul(WebElement opt) {
		Select s = new Select(opt);
		boolean multiple = s.isMultiple();
		return multiple;
	}
	public WebElement firstselected(WebElement opt) {
		Select s = new Select(opt);
		WebElement first = s.getFirstSelectedOption();
		return first;
	}
	public List<WebElement> allSelected(WebElement opt) {
		Select s= new Select(opt);
		List<WebElement> all = s.getAllSelectedOptions();
		return all;		
	}
	public List<WebElement> alloptions(WebElement opt) {
		Select s = new Select(opt);
		List<WebElement> options = s.getOptions();
		return options;
		}
	
	public void frame(String val) {
		driver.switchTo().frame(val);
	}
	public void parent() {
		driver.switchTo().parentFrame();
	}
	public void mainframe() {
		driver.switchTo().defaultContent()	;
	}
	public void acceptalert() {
		alert.accept();
	}
	public void dismissalert() {
		alert.dismiss();
	}
	public void SendText(String val,int b) {
		alert.sendKeys(val);
	}
	public void screenShot(String path) {
		File src = screen.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\DINESH KUMAR\\eclipse-workspace\\FaceBook\\target"+path+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void window() {
		String parent = driver.getWindowHandle();
		Set<String> children = driver.getWindowHandles();
		for (String child : children) {
			if(!child.equals(parent)) {
				driver.switchTo().window(child);
			}

	}
			
		}
	public WebDriverWait waits() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)) ;
		return wait;
	}
	public void inputKeys(WebElement ele) {
		
		
	}
	public void inputKeys(WebElement ele, String value) {
		
		
	}
		
	}
