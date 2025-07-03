package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscript1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://release.chainsys.com/appplatform/core/userlogin/logout");
		WebElement userNameSearchBox = driver.findElement(By.name("userName"));
		userNameSearchBox.sendKeys("berlinsamuel.r@appdataqa.com");
		driver.findElement(By.id("password")).sendKeys("Welcome#1");
		driver.findElement(By.className("Login")).click();
	}
}
