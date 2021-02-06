package org.base;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class LibGlobal {
public static WebDriver driver;
//1 to get the driver
public void browserLaunch() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Mavenday1\\driver\\chromedriver.exe");
driver = new ChromeDriver();
//driver.manage().window().maximize();
}
//2 to launch url
public void launchUrl(String url) {
	driver.get(url);
}
//3 to pass the value(sendkeys)
public void enterText(WebElement element,String data) {
	element.sendKeys(data);
}
//4 click
public void btnClick(WebElement element) {
	element.click();
}
//5 close
public void close() {
	driver.close();
}
//6 move to element
public void moveToElement(WebElement element) {
	Actions ac =new Actions(driver);
ac.moveToElement(element).perform();
}
//right click
public void contextClk(WebElement element) {
	Actions ac =new Actions(driver);
ac.contextClick().perform();
}
//7 excel
public String readValueFromExcel(String path,String sheetName,int rowNo,int cellNo) throws IOException  {
	File file = new File(path);
	String value=" ";
FileInputStream fileInputStream = new FileInputStream(file);

Workbook workbook = new XSSFWorkbook(fileInputStream);

Cell cell = workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo);
//Sheet sheet = workbook.getSheet(sheetName);
//Row row = sheet.getRow(rowNo);
//Cell cell = row.getCell(cellNo);
	
int cellType = cell.getCellType();
if (cellType==1) {
 value = cell.getStringCellValue();
}
else {
	if (DateUtil.isCellDateFormatted(cell)) {
		SimpleDateFormat format=new SimpleDateFormat("dd-MMM-yy");
		Date dateCellValue = cell.getDateCellValue();
		value = format.format(dateCellValue);
		
	} else {
double numericCellValue = cell.getNumericCellValue();
long l=(long)numericCellValue;
value = String.valueOf(l);
}
}

return value;
}	
//8 javascript
public void enterTextByJs(WebElement element,String data) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0],setAttribute('value','"+data+"')", element);
}

//9 
public void selectByVisible(WebElement element, String data) {
Select s = new Select(element);
s.selectByVisibleText(data);
}

//10

public void selectByValue(WebElement element,String value) {
	Select select = new Select(element);
	select.selectByValue(value);
}

//11
public void selectByIndex(WebElement element,int value ) {
	Select s =new Select(element);
	s.selectByIndex(value); 
}
//12
public List<WebElement> getOption(WebElement element,int value) {
	Select s = new Select(element);
	List<WebElement> options = s.getOptions();
	return options;
}
//13
public WebElement getFirstSelectedOption(WebElement element) {
	Select s = new Select(element);
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	return firstSelectedOption;
}
//14
public boolean isMultiple(WebElement element) {
	Select s = new Select(element);
boolean multiple = s.isMultiple();
return multiple;
}
//15
public List<WebElement> getAllSelectedOption(WebElement element) {
	Select s = new Select(element);
List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
return allSelectedOptions;
}
//16
public void deSelectByValue(WebElement element,String value) {
	Select s = new Select(element);
 s.deselectByValue(value);
}
//17
public void deSelectByIndex(WebElement element,int value ) {
	Select s = new Select(element);
s.deselectByIndex(value);
}
//18
public void deSelectByVisibleText(WebElement element,String value ) {
	Select s = new Select(element);
s.deselectByVisibleText(value);
}
//19
public void deSelectAll(WebElement element) {
	Select s = new Select(element);
s.deselectAll();
}
//21
public void enter()throws AWTException {
Robot r = new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

}//22
public void keyDown() throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
}
  private void keyUp() throws AWTException {
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_UP);
	r.keyRelease(KeyEvent.VK_UP);
}

	public void findelement(String path) {
		WebElement findElement = driver.findElement(By.xpath(path));

	}

	public void findElements(String data) {
		List<WebElement> findElements = driver.findElements(By.xpath(data));
		for (int i = 0; i < findElements.size(); i++) {
			WebElement webElement = findElements.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
		

	}




























}
