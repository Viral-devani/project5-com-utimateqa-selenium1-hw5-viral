import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);//luanch the url

        //Give implicit time to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Print title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :" + title);

        //Print current Url
        System.out.println("Current Url" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source" + driver.getPageSource());

        //Enter email to email field
        WebElement emailfield = driver.findElement(By.id("user[email]"));
        emailfield.sendKeys("test123@gmail.com");//Type Email in Email field

        //Enter password to passwordfield
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("abc123");//type password

        //Close the browser
        driver.quit();

    }

}
