package config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class setUp {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    protected static int duration = 10;



    //Global Variable
    protected static String companyName = "CompanyA";
    protected static String teamName = "TeamA";
    protected static String HQName = "HQA";
    protected static String projectName = "ProjectA";
    protected static String companyId;

    protected static String docTitle1 = "DocA";
    protected static String docContent1 = "Desc for DocA";
    protected static String docCheers = "Yay!";
    protected static String textComment = "Comment sample";
}
