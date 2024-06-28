package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    WebDriver driver;
    public Loginpage(WebDriver d1){
        this.driver=d1;
        PageFactory.initElements(d1,this);
    }

    @FindBy(css = "#Email")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(css = "#Password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(css = "[type='submit']")
    @CacheLookup
    WebElement Login_link;

    @FindBy(linkText = "Logout")
    @CacheLookup
    WebElement Logout_link;

    public void setEmail(String emailId){
        txtEmail.clear();
        txtEmail.sendKeys(emailId);
    }

    public void setPassword(String pass){
        txtPassword.clear();
        txtPassword.sendKeys(pass);
    }


    public void click_Login(){
        Login_link.click();
    }

    public void click_Logout(){
        Logout_link.click();
    }
}
