package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.Loginpage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Stepdef {
    WebDriver driver;
    Logger logger;
    Properties prop;
    FileInputStream fis;
    ChromeOptions options;
Loginpage lp;

@Before
public void launch()throws IOException {
  logger= LogManager.getLogger(Loginpage.class);

    EdgeOptions edge=new EdgeOptions();
    edge.addArguments("--remote-allow-origins=*");
    WebDriverManager.edgedriver().setup();
    driver=new EdgeDriver(edge);
logger.info("launching the browser");

}
    @Given("User launch the browser")
    public void user_launch_the_browser() {

        lp=new Loginpage(driver);
        logger.info("driver intialized");
    }
    @When("User opents the url {string}")
    public void user_opents_the_url(String url) {
       driver.get(url);
       driver.manage().window().maximize();
       logger.info("launching the url");
    }
    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String user, String pass) {

       lp.setEmail(user);
       logger.info("enter the url");
       lp.setPassword(pass);
       logger.info("enter the password");
    }
    @When("Click on login")
    public void click_on_login() {
       lp.click_Login();
       logger.info("clicked the login button");
    }
    @Then("Page title should be {string}")
    public void page_title_should_be(String title) {
      if (driver.getPageSource().contains("Login was unsuccessful")){
          driver.close();
          Assert.assertTrue(false);
      }else {
          Assert.assertEquals(title,driver.getTitle());
          logger.info("comparing both titles");
      }
    }


    @When("User click on Log out link")
    public void user_click_on_log_out_link() {
       lp.click_Logout();
       logger.info("clicking the logout button");
    }
//    @Then("close browser")
//    public void close_browser() {
//       driver.quit();
//    }


    @After
    public void teardown(){
    driver.quit();
    logger.info("close the driver");
    }

}
/*
 String path="src//test/resources/application.properties";
prop=new Properties();
fis=new FileInputStream(path);
prop.load(fis);
String br= prop.getProperty("browser");
if(br.equals("chrome")){
    options=new ChromeOptions();
    options.addArguments("--disable-extensions");
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
} else if (br.equals("edge")) {
    EdgeOptions edge=new EdgeOptions();
    edge.addArguments("--remote-allow-origins=*");
    WebDriverManager.edgedriver().setup();
    driver=new EdgeDriver(edge);

}else if(br.equals("fire")){
    WebDriverManager.firefoxdriver().setup();
    driver=new FirefoxDriver();

}
 */