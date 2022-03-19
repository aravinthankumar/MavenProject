package org.git;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.base.BaseClass;
import org.gitsub.GitSub;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

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
		
		
//		Map<String,Integer> a =null;

			
		for (int i = 1; i <findElements("(//div[@class='_30jeq3 _1_WHN1'])").size(); i++) {
		System.out.println(findElements("(//div[@class='_30jeq3 _1_WHN1'])").get(i).getText());
		
		
		}
		for (int j = 1; j <findElements("//div[@class='_4rR01T']").size(); j++) {
			System.out.println(findElements("//div[@class='_4rR01T']").get(j).getText());
			
			
		}
//		
		List<WebElement> productpriice =  findElements("(//div[@class='_30jeq3 _1_WHN1'])");
		List<WebElement> productname =  findElements("//div[@class='_4rR01T']");
       
		List<Integer> PriceList = new ArrayList();
		
		Map<String,Integer> aa= new LinkedHashMap<String,Integer>();
		for(int i=0;i<productname.size();i++ ) {
			String text1 = productname.get(i).getText();
			text1 =text1.substring(1);
			PriceList.add(Integer.parseInt(text1));
			aa.put(productname.get(i).getText(), Integer.parseInt(text1));
			
			Set<Entry<String,Integer>> q = aa.entrySet();
			
			for(Entry<String,Integer> x : q)
				System.out.println();
			
			System.out.println(Collections.min(PriceList));
			System.out.println(Collections.max(PriceList));
			
			
			
			Collections.sort(PriceList);
			for(int x:PriceList)
				System.out.println(x);
			
		}
		
		
		
//		String substring = text.substring(1);
//		//System.out.println(substring);
//		if(text.contains("₹")) {
//			String substrings = substring.replace("₹",  "");
//			
//	}
//		
//		System.out.println(substrings);
//		
	
	
		
		
		
	
		
		 
		
			driver.quit();
	}

	private static List<WebElement> findElements(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
