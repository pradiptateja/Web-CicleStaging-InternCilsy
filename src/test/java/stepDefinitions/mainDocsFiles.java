package stepDefinitions;

import config.setUp;
import objects.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class mainDocsFiles extends setUp {

    pageHome elementPageHome = new pageHome();
    pageDocsFiles elementPageDocsFiles = new pageDocsFiles();

    @Given("user is at Company page")
    public void user_is_at_company_page() {
        WebElement headerCreatedCompany = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getButtonCreatedCompanyName()));
        headerCreatedCompany.isDisplayed();
    }

    @When("user clicks existing HQ")
    public void user_clicks_existing_hq() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getButtonCreatedHQ())).click();
    }
    @When("user clicks Docs & Files menu")
    public void user_clicks_docs_files_menu() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getButtonDocsAndFiles())).click();
    }
    @Then("user is directed to Docs&Files page")
    public void user_is_directed_to_docs_files_page() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getHeaderDocsAndFiles())).isDisplayed();

    }
    @Then("user can see Add item button")
    public void user_can_see_add_item_button() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonAddItems())).isDisplayed();
    }
    @Then("user can see Edit folder button")
    public void user_can_see_edit_folder_button() {
        //Web Only, skipped
    }

    @When("user clicks existing Team")
    public void user_clicks_existing_team() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getButtonCreatedTeam())).click();
    }

    @When("user clicks existing Project")
    public void user_clicks_existing_project() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getButtonCreatedProject())).click();
    }

    @Then("user can see add new doc button")
    public void user_can_see_add_new_doc_button() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonAddDoc())).isDisplayed();
    }

    @Then("user can see create new folder button")
    public void user_can_see_create_new_folder_button() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonAddFolder())).isDisplayed();
    }

    @Then("user can see upload files button")
    public void user_can_see_upload_files_button() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonAddFile())).isDisplayed();
    }

    @When("user clicks close or back button")
    public void user_clicks_close_or_back_button() {
        driver.navigate().back();
    }

}
