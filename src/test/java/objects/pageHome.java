package objects;

import config.setUp;
import org.openqa.selenium.By;

public class pageHome extends setUp {


    By buttonCreatedCompanyName = By.xpath("//h1[text()=\""+companyName+"\"]");
    public By getButtonCreatedCompanyName() {
        return buttonCreatedCompanyName;
    }

    By buttonCreatedHQ = By.xpath("//h1[text()=\""+HQName+"\"]/ancestor::div[contains(@class, \"Card_Card\")]");
    public By getButtonCreatedHQ() {
        return buttonCreatedHQ;
    }

    By buttonCreatedTeam = By.xpath("//h1[text()=\""+teamName+"\"]/ancestor::div[contains(@class, \"Card_Card\")]");
    public By getButtonCreatedTeam() {
        return buttonCreatedTeam;
    }

    By buttonCreatedProject = By.xpath("//h1[text()=\""+projectName+"\"]/ancestor::div[contains(@class, \"Card_Card\")]");
    public By getButtonCreatedProject() {
        return buttonCreatedProject;
    }

    By buttonDocsAndFiles = By.xpath("//h1[text()=\"Docs & Files\"]/ancestor::a");
    public By getButtonDocsAndFiles() {
        return buttonDocsAndFiles;
    }

}
