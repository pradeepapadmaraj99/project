package task;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassCreation {
	WebDriver driver;
	
	public void get(String url) {
		driver.get(url);
	}
	
	public void getcurrentUrl() {
		driver.getCurrentUrl();
	}
	
	public void getTitle() {
		driver.getTitle();
	}
	
	public void quit() {
		driver.quit();
	}
	
	public void close() {
		driver.close();
	}
	public void switchto() {
		driver.switchTo();
	}
	public String windowHandle() {
		String w = driver.getWindowHandle();
		return w;
	}
	
	public Set<String> windowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	
	public void manage() {
		driver.manage();
	}
	
	public void sendKeys(WebElement e,String data) {
		e.sendKeys(data);
	}
	
	public void btnClick(WebElement w) {
	w.click();		
	}
	
	public String insertText(WebElement t) {
		String txt = t.getText();
		return txt;
	}
	
	public String getAttribute(WebElement v,String data) {
	String attribute = v.getAttribute(data);
	return attribute;
	}
	
	public boolean elementDisplayed(WebElement a) {
		boolean displayed = a.isDisplayed();
		return displayed;
	}
	
	public boolean elementEnabled(WebElement b) {
		boolean enabled = b.isEnabled();
		return enabled;
	}
	
	public boolean elementSelected(WebElement c) {
		boolean selected = c.isSelected();
		return selected;
	}
	
	public Navigation navigate() {
		Navigation n= driver.navigate();
		return n;

	}
	
	public void refresh() {
		navigate().refresh();

	}
	
	public void back() {
		navigate().back();

	}
	
	public void forward() {
		navigate().forward();

	}
	
	public void navigateTo(String url) {
		navigate().to(url);
	}
	
	public Alert switchToAlert() {
		return switchToElement().alert();
		
	}
	
	public void acceptAlert() {
			Alert x = switchToAlert();
			x.accept();         

	}
	
	public void dismissAlert() {
		switchToAlert().dismiss();
	}
	
	public TargetLocator switchToElement() {
		TargetLocator t = driver.switchTo();
		return t;
	}
	
	public void switchToFrameByIndex(int index) {
		switchToElement().frame(index);
}
	public void switchToFrameById(String id) {
		switchToElement().frame(id);
	}
	
	public void switchToFrameByElement(WebElement el) {
		switchToElement().frame(el);

	}
	public Actions actions() {
		Actions a=new Actions(driver);
		return a;
	}
	
	private void moveToElemen(WebElement target) {
			actions().moveToElement(target).perform();

	}
	
	public void dragAndDrop(WebElement src,WebElement dstn) {
		actions().dragAndDrop(src,dstn).perform();
		
	}
	
	public void doubleClick() {
		actions().doubleClick().perform();

	}
	
	public void contetClick() {
		actions().contextClick().perform();

	}
	public void perform() {
		actions().perform();
	}
	
	public Select select(WebElement element) {
		Select s=new Select(element);
		return s;
	}
	
	
	public void selectByValue(WebElement element,int index) {
		select(element).selectByIndex(index);
	}
	
	public void deselectByValue(WebElement element) {
		select(element).deselectAll();
	}
	public List<WebElement> getOptions(WebElement element) {
		List<WebElement> options = select(element).getOptions();
		return options;
	}
	
	
	
	
	
}
	
	
	
	








 
	


