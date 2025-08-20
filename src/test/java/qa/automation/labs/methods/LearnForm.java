package qa.automation.labs.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import qa.automation.labs.page.objects.LearnOR;

import java.time.Duration;

public class LearnForm {

    public static String uRL = "https://testing.qaautomationlabs.com/";
    public static int implicitWait = 20;
    public static WebDriver driver;

    @BeforeTest
    public static void setupBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
        driver.manage().deleteAllCookies();
        driver.get(uRL);
        System.out.println(driver.getTitle());
        driver.findElement(LearnOR.LEFT_MENU_FORM_OPTION).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
    }

    @Test
    public static void enterValueInFirstName() {
        try {

            driver.findElement(LearnOR.FROM_FIRST_NAME).sendKeys("Nitin");
        } catch (Exception e) {

        }
    }

    @Test
    public static void enterValueInMiddleName() {
        try {

            driver.findElement(LearnOR.FROM_MIDDLE_NAME).sendKeys("K");
        } catch (Exception e) {

        }
    }

    @Test
    public static void enterValueInLastName() {
        try {

            driver.findElement(LearnOR.FROM_LAST_NAME).sendKeys("Singh");
        } catch (Exception e) {

        }
    }

    @Test
    public static void enterValueInEmail() {
        try {

            driver.findElement(LearnOR.FROM_EMAIL).sendKeys("Nitin@gmail.com");
        } catch (Exception e) {

        }
    }

    @Test
    public static void enterValueInPassword() {
        try {

            driver.findElement(LearnOR.FROM_PASSWORD).sendKeys("Nitin@123");
        } catch (Exception e) {

        }
    }

    @Test
    public static void enterValueInAddress() {
        try {

            driver.findElement(LearnOR.FROM_ADDRESS).sendKeys("Phase 9");
        } catch (Exception e) {

        }
    }

    @Test
    public static void enterValueInCity() {
        try {

            driver.findElement(LearnOR.FROM_CITY).sendKeys("Mohali");
        } catch (Exception e) {

        }

    }

    @Test
    public static void enterValueInStates() {
        try {

            driver.findElement(LearnOR.FROM_STATE).sendKeys("PB");
        } catch (Exception e) {

        }
    }

    @Test
    public static void enterValueInPIN_CODE() {
        try {

            driver.findElement(LearnOR.FROM_PIN_CODE).sendKeys("160061");
        } catch (Exception e) {

        }
    }

    @Test
    public static void clickSubmit() {
        try {

            driver.findElement(LearnOR.FROM_SUBMIT_BUTOON).click();
            String verifyForm = driver.findElement(By.id("message")).getText();
            System.out.println(verifyForm);
        } catch (Exception e) {

        }
    }


    @AfterTest
    public static void teardownBrowser() {
        driver.quit();
    }


}
