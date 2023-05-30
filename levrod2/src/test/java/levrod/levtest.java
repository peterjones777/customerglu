package levrod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class levtest {
	WebDriver driver;

	By lever = By.xpath("//*[contains(@class,'innerSlot')]");
	By coupon = By.xpath("//*[contains(@class,'codeBox')]");

	public levtest(WebDriver driver) {
		this.driver = driver;

	}

	public WebDriver assignBrowser(String Browser) {
		if (Browser == "Chrome") {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver(options);
		}

		else if (Browser == "Firefox") {
			FirefoxOptions options = new FirefoxOptions();

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver(options);
		}

		return driver;

	}

	public void goTo(String m) {

		driver.get(m);
	}

	public void moveRod() {

		Function_library.element(driver, lever);

		driver.findElement(lever).click();
	}

	public void printCoupon() {

		Function_library.element(driver, coupon);
		String k = driver.findElement(coupon).getText();
		System.out.println(k);

	}
}