import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTest {
    public static void main(String[] args) {

        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();//Create object
        driver.get(baseurl);//Launch the url

        //Give implicit time to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is " + title);
        //Print the current url
        System.out.println("Curent Url" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source :" + driver.getPageSource());

        //Enter the email to emailfield
        WebElement emailfield = driver.findElement(By.id("user[email]"));
        emailfield.sendKeys("Admin");
        //Enter password to password field
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("abc123");

        //close the browser
        driver.quit();


    }


}
