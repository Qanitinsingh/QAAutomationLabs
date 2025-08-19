package qa.automation.labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LearnForm {

    public static WebDriver driver;
    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();

driver.get("https://testing.qaautomationlabs.com/");
System.out.println(driver.getTitle());

driver.findElement(By.cssSelector(".mt-2 ul li:nth-of-type(5) a[href='form.php']")).click();
// implicit wait is the soft wait we use to give after each operation to make sure that selenium is not throwing any exception before the given time
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.findElement(By.cssSelector("#userForm #firstname")).sendKeys("Nitin");
        driver.findElement(By.cssSelector("#userForm #middlename")).sendKeys("K");
        driver.findElement(By.cssSelector("#userForm #lastname")).sendKeys("Singh");
        driver.findElement(By.cssSelector("#userForm #email")).sendKeys("Nitin@gmail.com");
        driver.findElement(By.cssSelector("#userForm #password")).sendKeys("Nitin@123");
        driver.findElement(By.cssSelector("#userForm #address")).sendKeys("Homeland");
        driver.findElement(By.cssSelector("#userForm #city")).sendKeys("Mohali");
        driver.findElement(By.cssSelector("#userForm #states")).sendKeys("Punjab");
        driver.findElement(By.cssSelector("#userForm #pincode")).sendKeys("160061");
        System.out.println("Form inputs values is eneterd");
        driver.findElement(By.cssSelector("#userForm .btn-sm")).click();

        String verifyForm= driver.findElement(By.id("message")).getText();
        System.out.println(verifyForm);

driver.quit();




    }
}
