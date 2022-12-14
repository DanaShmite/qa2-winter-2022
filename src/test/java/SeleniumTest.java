//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//import java.util.List;
//
//public class SeleniumTest {
//  private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
//  private final By TOP_LOCATION_BLOCK = By.xpath(".//div[@class = 'tl-box']");
//
//  @Test
//  public void openHomePageCheck () {
//      System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//      WebDriver browser = new ChromeDriver();
//      browser.manage().window().maximize();
//      browser.get("http://www.discovercars.com/");
//
//      browser.findElement(ACCEPT_COOKIES_BTN).click();
//
//      List<WebElement> topLocations = browser.findElements(TOP_LOCATION_BLOCK);
//
//      boolean isCountryFound = false;
//
//      for (WebElement location : topLocations) {
//          if (location.findElement(By.tagName("a")).getText().equals("Latvia")){
//              isCountryFound = true;
//              location.findElement(By.tagName("a")).click();
//              //               break;
//
                //  }//
            ////      }
//
        //      Assertions.assertTrue(isCountryFound, "Country not found");
//
        //   }
//
//   private void click
  //}





