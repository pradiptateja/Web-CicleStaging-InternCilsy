package stepDefinitions;

import config.setUp;
import helper.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;


public class hook extends setUp {

    onBoard onBoard = new onBoard();

    @Before
    public void Before() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.setHeadless(true);
        opt.addArguments("user-data-dir=C:/Users/ThinkPad/AppData/Local/Google/Chrome/User Data");
        opt.addArguments("--profile-directory=Default");
        opt.addArguments("--no-sandbox");
        opt.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(opt);
        driver.get("https://staging.cicle.app/");

        driver.manage().window().maximize();

        wait = new WebDriverWait(driver,duration);

        onBoard.login();


    }


    @After
    public void after(Scenario scenario) throws IOException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        if (scenario.isFailed()){
            FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/failed/" + scenario.getName() + ".png"));
        } else {
            FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/success/" + scenario.getName() + ".png"));
        }

        driver.quit();
    }
}
