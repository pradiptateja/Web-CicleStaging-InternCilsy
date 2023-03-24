package objects;

import org.openqa.selenium.By;

public class pageWelcome {

    By btn_createdCompany = By.xpath("//h1[text()='CompanyA']/parent::div/parent::div");
    public By getBtn_createdCompany() {
        return btn_createdCompany;
    }


}
