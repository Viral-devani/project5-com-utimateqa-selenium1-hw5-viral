import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultiBrowserTest {
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name ,eg.: chrome,firefox,edge :");
        String browser = scanner.nextLine();

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if ((browser.equalsIgnoreCase("firefox"))) {
            System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("Webdriver.edge.driver", "msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");

        }
        driver.get(baseUrl);

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title :" + title);

        //Print the page source
        System.out.println("Page source" + driver.getPageSource());

        //Give implicit time to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Enter email to emailfield
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("abc123@gmail.com");

        //Enter password to password field
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("abc123");

        //Close the browser
        driver.quit();

    }
}
