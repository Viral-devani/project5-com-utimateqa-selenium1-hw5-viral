import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("Webdriver.edge.driver", "msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Launch the Url
        driver.get(baseUrl);

        //give implicit time to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :" + title);

        //Print the current url
        System.out.println("Current Url :" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source :" + driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source :" + driver.getPageSource());
        //Enter the email to email field
        WebElement emailField = driver.findElement(By.name("user[email]"));
        emailField.sendKeys("abc123@gmail.com");
        //Enter password to password field
        WebElement passwordField = driver.findElement((By.name("user[password]")));
        passwordField.sendKeys("abc123");

        //Close the browser
        driver.quit();

    }
}

