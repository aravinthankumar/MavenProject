package org.gitsub;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitSub extends BaseClass {
	public GitSub() {
		PageFactory.initElements(driver,this );
	}
       
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement clkCancel;
	
	@FindBy(name="q")
	private WebElement txtProductName;
	
	@FindBy(xpath="//div[text()='Price -- Low to High']")
	private WebElement lowPrice;
	
	@FindBy(xpath="//div[text()='Price -- High to Low']")
	private WebElement highPrice;
	
	

	
	public WebElement getHighPrice() {
		return highPrice;
	}

	public WebElement getLowPrice() {
		return lowPrice;
	}

	public WebElement getClkCancel() {
		return clkCancel;
	}

	public WebElement getTxtProductName() {
		return txtProductName;
	}
	
	
	
	
}
