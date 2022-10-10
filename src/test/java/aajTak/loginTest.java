package aajTak;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.aajTak.pageObjects.android.homePage;
import org.aajTak.pageObjects.android.launchPage;
import org.aajTak.pageObjects.android.loginPage;
//Bottom navigation Menu
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AT_FrameWork.Swipes;
import AT_FrameWork.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class loginTest extends base{
	
	AndroidDriver<AndroidElement>driver;

	public loginTest(AndroidDriver<AndroidElement> driver)
	{
		this.driver=driver;
	}
	Swipes uti = new Swipes(driver);
	
	@Test(dataProvider="getData")
	
	public void installApp() throws InterruptedException, IOException {
		 
		launchPage launch = new launchPage(driver);
		launch.launchapp();
		launch.closeNewspreeso();
		
	}
	public void login(HashMap<String, String > input) throws Exception {
		
		loginPage log = new loginPage(driver);
		homePage home = new homePage(driver);
		home.HamburgerId();
		log.SignInProfile();
		Thread.sleep(2000);
		log.loginButton();
		Thread.sleep(2000);
		log.usernameFiled(input.get("name"));
		log.passwordField(input.get("password"));
		log.loginButton();
				
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir")+"//src//test//java//org//aajTak//testData//indiaToday.json");
		
		return new Object[][] {		{data.get(0)}, {data.get(1)}   };
		//return new Object[][] {		{"anish","anish123!@#"}, {"test","Test123!@#"}   };
			
	}
	
}
