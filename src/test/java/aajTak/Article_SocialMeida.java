package aajTak;
//HomePage scroll -- Article -- Social media

import java.util.concurrent.TimeUnit;
import org.aajTak.pageObjects.android.ArticlePage;
import org.aajTak.pageObjects.android.homePage;
import org.aajTak.pageObjects.android.launchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import AT_FrameWork.Swipes;
import AT_FrameWork.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import okio.Timeout;

@Test
public class Article_SocialMeida extends base{

	AndroidDriver<AndroidElement>driver;

	public Article_SocialMeida(AndroidDriver<AndroidElement> driver)
	{
		this.driver=driver;
	}
	Swipes uti = new Swipes(driver);
	
	public void installApp() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		launchPage obj1 = new launchPage(driver);
		obj1.launchapp();
		obj1.closeNewspreeso();
			
	}
		
	public void Article() throws Exception {
		
		homePage home = new homePage(driver);
	 //Click the Article
		home.ViewtheArticle();
		home.waitForArtilce();
		
		ArticlePage article = new ArticlePage(driver);
		article.articleTitleText();
		uti.swipedown(driver);
		article.whatsupButton();
		
		article.twitterButton();
		article.facebookButton();
	//UpdateText	
		article.updateTextSize();
	//small
		article.smallSizeText();
		article.OkButtonForTextUpdate();
	//UpdateText	
		article.updateTextSize();	
	//medium
		article.mediumSizeText();
		article.OkButtonForTextUpdate();	
	//More option -- Bookmark
		article.moreOptionButton();
		article.bookmark();
		
	//More option -- Download
		article.moreOptionButton();
		article.download();	
	//More option -- comment
		article.moreOptionButton();
		article.commentButton();
		article.viewCommentPage();
		driver.navigate().back();
	//More option -- share
		article.moreOptionButton();
		article.shareButton();
		article.cancelShareButton();
		
	//Speark
		article.speakerButton();
	 
	  uti.swipeArticlePageDown(driver);
	  uti.swipeArticlePageTop(driver);
//Swipe the Article 4 times
	  
	  uti.swipefour(driver);
	  article.articleBackButton();
	  //driver.quit();
	}
	
	

	
	
	
	
	
	
	
	
}
