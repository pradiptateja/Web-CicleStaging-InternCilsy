package objects;

import org.openqa.selenium.By;

public class pageLogin {

    By btn_loginGoogle = By.xpath("//*[text() = 'Login with Google Account']/parent::div");
    public By getBtn_loginGoogle() {
        return btn_loginGoogle;
    }

    By btn_profile = By.xpath("//div[@data-identifier=\"pradiptateja1@gmail.com\"]");
    public By getBtn_profile() {
        return btn_profile;
    }

}
