package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerpage {
    WebDriver driver;
    public AddCustomerpage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    By lnkCustomers_Menu=By.xpath("//nav/ul/li[4]/a");
    By lnkCustomer_menitem=By.xpath("//p[text()=' Customers']");
    By btnAddNew=By.xpath("//a[@class='btn btn-primary']");
    By txtEmail=By.name("Email");
    By txtPassword=By.name("Password");
    By txtFirstname=By.name("FirstName");
    By txtLastname=By.name("LastName");
    By genederMale=By.id("Gender_Male");
    By genderFemale=By.id("Gender_Female");
    By Dateofbirth=By.name("DateOfBirth");
    By Companyname=By.name("Company");
    By Is_taxattampt=By.name("IsTaxExempt");

}
