package runner;
import config.setUp;
import helper.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        plugin = "html:target/HTML_ReportNew.html",
        tags = ""
)
public class runAll extends setUp {

    static requestAPI requestAPI = new requestAPI();
    @BeforeClass
    public static void beforeClass() {
        requestAPI.createCompany();
        requestAPI.createTeam(companyId);
        requestAPI.createHQ(companyId);
        requestAPI.createProject(companyId);
    }

    @AfterClass
    public static void afterAll() {
        requestAPI.deleteCompany(companyId);
    }
}
