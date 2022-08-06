package com.utilities;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class CommonFunctions extends BaseTest {



	public boolean click(By locator) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			wait.until(ExpectedConditions.elementToBeClickable(locator));

			driver.findElement(locator).click();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean clear(By locator) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			wait.until(ExpectedConditions.elementToBeClickable(locator));

			driver.findElement(locator).clear();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean setText(By locator, String fieldValue) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		try {wait
			.until(ExpectedConditions.visibilityOfElementLocated(locator));
			driver.findElement(locator).clear();
			driver.findElement(locator).sendKeys(fieldValue);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean selectDropDownOption(By locator, String option, String selectType) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		try {
			boolean status = false;
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			WebElement webElement = driver.findElement(locator);
			Select sltDropDown = new Select(webElement);
			if (!selectType.equals("")) {
				if (selectType.equalsIgnoreCase("Value")) {
					sltDropDown.selectByValue(option);
					status = true;
				}
				if (selectType.equalsIgnoreCase("Text")) {
					sltDropDown.selectByVisibleText(option);
					status = true;
				}
				if (selectType.equalsIgnoreCase("Index")) {
					sltDropDown.selectByIndex(Integer.parseInt(option));
					status = true;
				}
			}
			return status;
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
	}

	public String getRandomString(int lenght) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		try {
			String allowedChars = "abcdefghiklmnopqrstuvwxyz";
			String randomstring = "";

			for (int i = 0; i < lenght; ++i) {
				int rnum = (int) Math.floor(Math.random() * (double) allowedChars.length());
				randomstring = randomstring + allowedChars.substring(rnum, rnum + 1);
			}

			return randomstring;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String getRandomNumbers(int length) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		try {
			String allowedChars = "1234567890";
			String randomstring = "";

			for (int i = 0; i < length; ++i) {
				int rnum = (int) Math.floor(Math.random() * (double) allowedChars.length());
				randomstring = randomstring + allowedChars.substring(rnum, rnum + 1);
			}

			return randomstring;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean javascriptExecutorScrollBar(By locator) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			WebElement element = driver.findElement(locator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			;
			js.executeScript("arguments[0].scrollIntoView();", element);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean waitFor(long wait) {
		try {
			Thread.sleep(wait);
			return true;
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}

	}

	public void generateLog(String step, boolean result) {
		
		try {
			Logger log = Logger.getLogger(CommonFunctions.class);
			log.info(step);
			Reporter.log(step);
			System.out.println(step);
			if (result) {
				Assert.assertTrue(true);
			} else {
				// Take Screen shot code
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void generateLog(String step, String value, boolean result) {
		try {
			Logger log = Logger.getLogger(CommonFunctions.class);
			log.info(step + " || value : " + value);
			Reporter.log(step + " || value : " + value);
			System.out.println(step + " || value : " + value);
			if (result) {
				Assert.assertTrue(true);
			} else {
				// Take Screen shot code
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void generateLog(String step, String expected, String actual, boolean result) {
		try {
			Logger log = Logger.getLogger(CommonFunctions.class);
			log.info(step + " || expected : " + expected + " || actual : " + actual);
			Reporter.log(step + " || expected : " + expected + " || actual : " + actual);
			System.out.println(step + " || expected : " + expected + " || actual : " + actual);
			if (result) {
				Assert.assertTrue(true);
			} else {
				// Take Screen shot code
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean uploadFile(String fileName) {
		try {
			String filePath = System.getProperty("user.dir") + "\\src_resource\\images\\" + fileName;
			System.out.println("Upload file Path: " + filePath);
			this.waitFor(10000);
			this.setClipboardData(filePath);
			Robot robot = new Robot();
			robot.delay(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.delay(2000);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.delay(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			this.waitFor(5000);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, (ClipboardOwner) null);
	}

	public boolean datePicker(By locator) {
		try {

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean checkElementDisplay(By locator) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));

		try {
			boolean status = false;

			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			WebElement webElement = driver.findElement(locator);
			status = webElement.isDisplayed();
			return status;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean checkElementEnable(By locator) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));

		try {
			boolean status = false;

			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			WebElement webElement = driver.findElement(locator);
			status = webElement.isEnabled();
			return status;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean clickUsingJavaScript(By locator) {
				try {
			WebElement element = driver.findElement(locator);
			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", element);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public Hashtable<String, String> readExcelData(String tcId) {
		try {
			FileInputStream fis = new FileInputStream(
					new File(System.getProperty("user.dir") + "\\src_resource\\ExcelData\\TestData.xlsx"));
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("TestData"); // creating a Sheet object to retrieve object

			XSSFRow valueRow = null;
			XSSFRow keyRow = null;
			Iterator<Row> rowItr = sheet.iterator();
			int rowNumber = 0;
			while (rowItr.hasNext()) {
				Row row = rowItr.next();
				Cell cell = row.getCell(0);
				String value = cell.getStringCellValue().toString();
				if (value.trim().equals(tcId)) {
					valueRow = sheet.getRow(rowNumber);
					keyRow = sheet.getRow(rowNumber - 1);
					break;
				}
				rowNumber++;
			}
			Hashtable<String, String> data = new Hashtable<String, String>();
			int lastCellNo = keyRow.getLastCellNum();
			for (int cell = 0; cell < lastCellNo; cell++) {
				data.put(keyRow.getCell(cell).getStringCellValue(), valueRow.getCell(cell).getStringCellValue());
			}
			return data;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
