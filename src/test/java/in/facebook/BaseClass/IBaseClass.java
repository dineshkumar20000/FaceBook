package in.facebook.BaseClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface IBaseClass {

	void browsersetup() ;	
	void launchApplication(String url) ;
    void closingBrowser() ;
    void closingCurrentTab() ;
	String pageTilte() ;
	String currentUrl() ;
	String pageSource() ;
	void SendText(WebElement opt,String val) ;
    void button(WebElement opt) ;
	void attri(WebElement opt,String val) ;
	void css(WebElement opt,String val) ;
	boolean enable(WebElement opt) ;
    boolean display(WebElement opt) ;
	boolean select(WebElement opt) ;
    String text(WebElement opt) ;
	void delete(WebElement opt) ;
	void submitted(WebElement opt) ;
	void move(WebElement opt) ;
	void doublecli(WebElement opt) ;
	void right(WebElement opt) ;
	void dragdrop(WebElement opt,WebElement opt2) ;
	void press(WebElement opt) ;
	void SendText(String val) ;
	void scroll(WebElement opt) ;
	void button(WebElement opt, int a) ;
	void byIndex(int index,WebElement opt) ;
	void byvisible(String val,WebElement opt) ;
	void byval(String val,WebElement opt) ;
    void desIndex(int index,WebElement opt) ;
	void desval(String val,WebElement opt) ;
	void desbyVisible(String val,WebElement opt) ;
	boolean mul(WebElement opt) ;
    WebElement firstselected(WebElement opt) ;
	List<WebElement> allSelected(WebElement opt) ;
	List<WebElement> alloptions(WebElement opt) ;
	void frame(String val) ;
	void parent() ;
    void mainframe() ;
	void acceptalert() ;
	void dismissalert() ;
	void SendText(String val,int b) ;
	void screenShot(String path) ;
	void window() ;
	WebDriverWait waits();
	void inputKeys(WebElement ele,String value);
}
		