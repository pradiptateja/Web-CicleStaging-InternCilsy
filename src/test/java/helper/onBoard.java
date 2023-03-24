package helper;

import config.setUp;
import objects.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class onBoard extends setUp {
    pageWelcome elementPageWelcome = new pageWelcome();
    pageLogin elementPageLogin = new pageLogin();

    public void login() {

        int loginButton = driver.findElements(elementPageLogin.getBtn_loginGoogle()).size();

        if (loginButton != 0) {
            wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getBtn_loginGoogle())).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getBtn_profile())).click();

            wait.until(ExpectedConditions.presenceOfElementLocated(elementPageWelcome.getBtn_createdCompany())).click();

        } else if ( driver.findElements(elementPageWelcome.getBtn_createdCompany()).size() != 0 ) {
            wait.until(ExpectedConditions.presenceOfElementLocated(elementPageWelcome.getBtn_createdCompany())).click();
        }


    }
}
