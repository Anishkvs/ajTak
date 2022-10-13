package Runner;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.aajTak.pageObjects.android.homePage;
import org.aajTak.pageObjects.android.loginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import AT_FrameWork.base;
import aajTak.BottomMenu;
import aajTak.loginTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class loginVerify_pass2 extends base{
   	AndroidDriver<AndroidElement> driver;
   

@Test(dataProvider="getData")
public void login(HashMap<String, String > input) throws Exception {
	AndroidDriver<AndroidElement> driver=capabilities("ATNewApp");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	//loginPage log = new loginPage(driver);
	homePage home = new homePage(driver);
	loginTest login = new loginTest(driver);
	login.installApp();
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




