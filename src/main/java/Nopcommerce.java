import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nopcommerce {
    public static void main(String[] args) {
        EdgeOptions edge=new EdgeOptions();
        edge.addArguments("--remote-allow-origins=*");
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver(edge);
        driver.get("http://admin-demo.nopcommerce.com/login");
driver.manage().window().maximize();

WebElement email=driver.findElement(By.cssSelector("#Email"));
//        driver.findElement(By.xpath("//input[@type='email']"));
email.clear();
email.sendKeys("admin@yourstore.com");

WebElement pass=driver.findElement(By.cssSelector("#Password"));
        //driver.findElement(By.xpath("//input[@type='password']"));
pass.clear();
pass.sendKeys("admin");

 WebElement login=driver.findElement(By.cssSelector("[type='submit']"));
 login.click();
//Actions ac=new Actions(driver);
// WebElement custom=driver.findElement(By.xpath("//p[text()=' Customers']"));
// ac.moveToElement(custom).clickAndHold().build().perform();
 driver.findElement(By.xpath("//nav/ul/li[4]/a")).click();
 driver.findElement(By.xpath("//p[text()=' Customers']")).click();
 driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
    }
}
