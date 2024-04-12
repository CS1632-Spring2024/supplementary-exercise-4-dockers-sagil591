// Generated by Selenium IDE
package edu.pitt.cs;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  // @Test
  // public void tEST1LINKS() {
  //   driver.get("http://localhost:8080");
  //   driver.manage().window().setSize(new Dimension(1054, 808));
  //   js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
  //   {
  //     WebElement element = driver.findElement(By.xpath("//li[8]/a"));
  //     String attribute = element.getAttribute("href");
  //     vars.put("href", attribute);
  //   }
  //   assertEquals(vars.get("href").toString(), "http://localhost:8080reset");
  // }
  @Test
  public void tEST2RESET() {
    driver.get("http://localhost:8080");
    js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=true\";document.cookie = \"3=true\";");
    driver.findElement(By.xpath("//li[8]/a")).click();
    assertThat(driver.findElement(By.xpath("//div/ul/li")).getText(), is("ID 1. Jennyanydots"));
    assertThat(driver.findElement(By.xpath("//div/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST4LISTING() {
    driver.get("http://localhost:8080");
    driver.manage().window().setSize(new Dimension(1063, 808));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.linkText("Catalog")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div/ul/li[3]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div/ul/li[4]"));
      assert(elements.size() == 0);
    }
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }
  // @Test
  // public void tEST3CATALOG() {
  //   driver.get("http://localhost:8080");
  //   driver.manage().window().setSize(new Dimension(1060, 808));
  //   js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
  //   driver.findElement(By.xpath("//a")).click();
  //   {
  //     WebElement element = driver.findElement(By.xpath("//li[2]/img"));
  //     String attribute = element.getAttribute("src");
  //     vars.put("image", attribute);
  //   }
  //   assertEquals(vars.get("image").toString(), "http://localhost:8080images/cat2.jpg");
  // }
  @Test
  public void tEST5RENTACAT() {
    driver.get("http://localhost:8080");
    driver.manage().window().setSize(new Dimension(1066, 811));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button"));
      assert(elements.size() > 0);
    }
    assertThat(driver.findElement(By.xpath("//button")).getText(), is("Rent"));
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[3]/div[3]/button"));
      assert(elements.size() > 0);
    }
    assertThat(driver.findElement(By.xpath("//div[3]/div[3]/button")).getText(), is("Return"));
  }
  @Test
  public void tEST6RENT() {
    driver.get("http://localhost:8080");
    driver.manage().window().setSize(new Dimension(1051, 806));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    driver.findElement(By.id("rentID")).click();
    driver.findElement(By.id("rentID")).sendKeys("1");
    driver.findElement(By.cssSelector(".form-group:nth-child(3) .btn")).click();
    assertThat(driver.findElement(By.xpath("//div/ul/li")).getText(), is("Rented out"));
    assertThat(driver.findElement(By.xpath("//div/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
    assertThat(driver.findElement(By.xpath("//div[2]/div[4]")).getText(), is("Success!"));
  }
  @Test
  public void tEST7RETURN() {
    driver.get("http://localhost:8080");
    driver.manage().window().setSize(new Dimension(1054, 808));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=true\";document.cookie = \"3=false\";");
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    driver.findElement(By.id("returnID")).click();
    driver.findElement(By.id("returnID")).sendKeys("2");
    driver.findElement(By.cssSelector(".form-group:nth-child(4) .btn")).click();
    assertThat(driver.findElement(By.xpath("//div/ul/li")).getText(), is("ID 1. Jennyanydots"));
    assertThat(driver.findElement(By.xpath("//div/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
    assertThat(driver.findElement(By.xpath("//div[3]/div[4]")).getText(), is("Success!"));
  }
  @Test
  public void tEST8FEEDACAT() {
    driver.get("http://localhost:8080");
    driver.manage().window().setSize(new Dimension(1058, 808));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button"));
      assert(elements.size() > 0);
    }
    assertThat(driver.findElement(By.xpath("//button")).getText(), is("Feed"));
  }
  @Test
  public void tEST9FEED() {
    driver.get("http://localhost:8080");
    driver.manage().window().setSize(new Dimension(1062, 808));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    driver.findElement(By.id("catnips")).click();
    driver.findElement(By.id("catnips")).sendKeys("6");
    driver.findElement(By.cssSelector(".btn")).click();
    assertThat(driver.findElement(By.xpath("//div[4]")).getText(), is("Nom, nom, nom."));
  }
  @Test
  public void tEST10GREETACAT() {
    driver.get("http://localhost:8080");
    driver.manage().window().setSize(new Dimension(1065, 808));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.linkText("Greet-A-Cat")).click();
    assertThat(driver.findElement(By.xpath("//div[2]/h4")).getText(), is("Meow!Meow!Meow!"));
  }
  // @Test
  // public void tEST11GREETACATWITHNAME() {
  //   driver.get("http://localhost:8080greet-a-cat/Jennyanydots");
  //   js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
  //   assertThat(driver.findElement(By.xpath("//div[2]/h4")).getText(), is("Meow! from Jennyanydots."));
  // }

}
