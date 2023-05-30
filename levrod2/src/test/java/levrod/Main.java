package levrod;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class Main {
	WebDriver driver;
	levtest obj = new levtest(driver);

	@Test
	public void main() {

		String Url = "https://edzuv3j.cglu.us/c/2QVLV5R3rDe6D6ZJVSykVUT1hbJ";

		driver = obj.assignBrowser("Firefox");
		obj.goTo(Url);
		obj.moveRod();
		obj.printCoupon();

		driver = obj.assignBrowser("Chrome");
		obj.goTo(Url);
		obj.moveRod();
		obj.printCoupon();

	}
}
