package cucumberJava;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.eo.Do;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class annotation {

    WebDriver driver;
    ChromeOptions options;
    Robot robot;

    @Before
    public void setUp() {
        options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        driver = new ChromeDriver(options);
    }

    @Given("^I Open Kumparan web Login/Register$")
    public void i_Open_Kumparan_web_Login_Register() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://kumparan.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//A[@class='btn btn-link color-primary'][text()='Log In / Sign Up']")).click();
        Thread.sleep(2000);
    }

    @Given("^I am Register as the Facebook user$")
    public void i_am_Register_as_the_Facebook_user() throws Throwable {
        driver.findElement(By.xpath("//BUTTON[@class='btn btn-block btn-lg btn-fb btn-glow metro']")).click();
        Thread.sleep(5000);
}

    @When("^i input the username and password FB Negative$")
    public void i_input_the_username_and_password_FB_Negative() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        for (String winHandle : driver.getWindowHandles())
        {
            driver.switchTo().window(winHandle);
            System.out.println("Window switch");
            System.out.println(driver.getTitle());
            if (driver.getTitle().contains("Facebook"))
            {
            driver.findElement(By.xpath("//INPUT[@id='email']")).sendKeys("kumparan@gmail.com");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//INPUT[@id='pass']")).sendKeys("kumparan");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//LABEL[@id='loginbutton']")).click();
        }
        }
    }

    @When("^I input the username and password FB Positive$")
    public void i_input_the_username_and_password_FB_Positive() throws Throwable {
        for (String winHandle : driver.getWindowHandles())
        {
            driver.switchTo().window(winHandle);
            System.out.println("Window switch");
            System.out.println(driver.getTitle());
            if (driver.getTitle().contains("Facebook"))
            {
                robot = new Robot();
                driver.findElement(By.xpath("//INPUT[@id='email']")).click();
                Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_DELETE);
            robot.keyRelease(KeyEvent.VK_DELETE);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//INPUT[@id='email']")).sendKeys("donnygfrance@gmail.com");
            //input the right username and pass to make this Scenario Run Smoothly
            Thread.sleep(3000);
            driver.findElement(By.xpath("//INPUT[@id='pass']")).sendKeys("Donny1211");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//LABEL[@id='loginbutton']")).click();
            Thread.sleep(10000);
            //use code bellow for first Time User
//            driver.findElement(By.xpath("//BUTTON[@value='1'][text()='Lanjutkan sebagai Donny']")).click();
//            Thread.sleep(20000);
        }
        }
    }

    @Given("^I am Register as the GooglePlus user$")
    public void i_am_Register_as_the_GooglePlus_user() throws Throwable {
        driver.findElement(By.xpath("//BUTTON[@class='btn btn-block btn-lg btn-gplus btn-glow']")).click();
        Thread.sleep(3000);
    }

    @When("^i input the username and password G\\+ Negative$")
    public void i_input_the_username_and_password_G_Negative() throws Throwable {
        for (String winHandle : driver.getWindowHandles())
        {
            driver.switchTo().window(winHandle);
            System.out.println("Window switch");
            System.out.println(driver.getTitle());
            if (driver.getTitle().contains("Sign in - Google Accounts"))
            {
                driver.findElement(By.xpath("//INPUT[@id='identifierId']")).sendKeys("Kumparan@gmail.com");
                Thread.sleep(3000);
                driver.findElement(By.xpath("//INPUT[@type='password']")).sendKeys("kumparan");
                Thread.sleep(3000);
                driver.findElement(By.xpath("//LABEL[@id='loginbutton']")).click();
            }
        }
    }

    @When("^I input the username and password G\\+ Positive$")
    public void i_input_the_username_and_password_G_Positive() throws Throwable {
        for (String winHandle : driver.getWindowHandles())
        {
            driver.switchTo().window(winHandle);
            System.out.println("Window switch");
            System.out.println(driver.getTitle());
            if (driver.getTitle().contains("Sign in - Google Accounts"))
            {
                robot = new Robot();
                driver.findElement(By.xpath("//INPUT[@id='identifierId']")).click();
                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_A);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_A);
                robot.keyPress(KeyEvent.VK_DELETE);
                robot.keyRelease(KeyEvent.VK_DELETE);
                Thread.sleep(1000);
                //input the right username and pass to make this Scenario Run Smoothly
                driver.findElement(By.xpath("//INPUT[@id='identifierId']")).sendKeys("donnygfrance@gmail.com");
                Thread.sleep(3000);
                driver.findElement(By.xpath("//INPUT[@type='password']")).sendKeys("Donny1211");
                Thread.sleep(3000);
                driver.findElement(By.xpath("//LABEL[@id='loginbutton']")).click();
            }
        }
    }

    @Then("^i will registered as Kumparan User$")
    public void i_will_registered_as_Kumparan_User() throws Throwable {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            System.out.println("Window switch");
            System.out.println(driver.getTitle());
            if (driver.getTitle().contains("kumparan")) {
                driver.findElement(By.xpath("(//IMG[@role='presentation'])[1]")).click();
                Thread.sleep(5000);
                driver.findElement(By.xpath("//A[@href='/donny-gumelar-france']")).click();
                //change "/donny-gumelar-france" to ure username on FB or G+ to make the scenario pass
                Thread.sleep(5000);
            }
        }
    }

    @Given("^I Open Kumparan web$")
    public void i_Open_Kumparan_web() throws Throwable {
        driver.get("https://kumparan.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
    }

    @Given("^I Open any Article$")
    public void i_Open_any_Article() throws Throwable {
        driver.findElement(By.xpath("//A[@class='btn-default-color'][text()='Pelaku Penembakan Florida Pernah Rekam Video Viral Menyayat Lengan']")).click();
        Thread.sleep(5000);
    }

    @When("^I write a Comment$")
    public void i_write_a_Comment() throws Throwable {
        driver.findElement(By.xpath("//TEXTAREA[@placeholder='Tulis Komentarmu']")).sendKeys("Test");
        Thread.sleep(5000);
    }

    @When("^Post the Comment Registered$")
    public void post_the_Comment_Registered() throws Throwable {
        for (String winHandle : driver.getWindowHandles())
        {
            driver.switchTo().window(winHandle);
            System.out.println("Window switch");
            System.out.println(driver.getTitle());
            if (driver.getTitle().contains("Facebook"))
            {
                //Put the right Username and password
            driver.findElement(By.xpath("//INPUT[@id='email']")).sendKeys("kumparan@gmail.com"); //dummy Data for emial and password
            Thread.sleep(3000);
            driver.findElement(By.xpath("//INPUT[@id='pass']")).sendKeys("kumparan");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//LABEL[@id='loginbutton']")).click();
                driver.findElement(By.xpath("//A[@class='btn-default-color'][text()='Pelaku Penembakan Florida Pernah Rekam Video Viral Menyayat Lengan']")).click();
                Thread.sleep(5000);
                driver.findElement(By.xpath("//TEXTAREA[@placeholder='Tulis Komentarmu']")).sendKeys("Test");
                Thread.sleep(5000);
                driver.findElement(By.xpath("(//SPAN[text()='Post'])[1]")).click();
                Thread.sleep(5000);

        }
        }
    }

    @Then("^The Comment will posted on Recent$")
    public void the_Comment_will_posted_on_Recent() throws Throwable {
        //Because i don't still understand how the business process yet but overral it's will looks like this//
//        driver.findElement(By.xpath("//A[@class='btn btn-link btn-default-color padd-hor-none elem-button-comment inactive']")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//A[@id='controlled-tab-example-tab-2']")).click();
//        Thread.sleep(5000);
    }

    @When("^Post the Comment notRegistered$")
    public void post_the_Comment_notRegistered() throws Throwable {
        driver.findElement(By.xpath("(//SPAN[text()='Post'])[1]")).click();
        Thread.sleep(5000);
    }

    @After
    public void teardown() {
        driver.quit();
    }

}
