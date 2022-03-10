package org.git;

import org.base.BaseClass;
import org.gitsub.GitSub;
import org.openqa.selenium.Keys;

public class GGiitt extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		chromeDriver();
		urlLounch("https://www.flipkart.com/");
		implicitwait();
		GitSub z = new GitSub();
		click(z.getClkCancel());
	     sendkeysValue(z.getTxtProductName(), "apple mobile", Keys.ENTER); 
		driver.navigate().refresh();
		System.out.println("...........Low price..................");
		click(z.getLowPrice());
			for (int i = 1; i <=23; i++) {
			findElemenys((char) i, "(//div[@class='_4rR01T'])");
		findElemenys((char)i, "(//div[@class='_30jeq3 _1_WHN1'])");
			}
			Thread.sleep(4000);
			System.out.println("high price..............");
			click(z.getHighPrice());
			for (int i =1 ; i <=20; i++) {
				findElemenys((char) i, "(//div[@class='_4rR01T'])");
			findElemenys((char)i, "(//div[@class='_30jeq3 _1_WHN1'])");
				}
			driver.quit();
	}
}
