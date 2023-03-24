package stepDefinitions;

import config.setUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.security.Key;
import java.util.List;

public class docsFunctionality extends setUp {
    pageDocsFiles elementPageDocsFiles = new pageDocsFiles();

    String newDocTitle = docTitle1+" New";
    String newTextComment = textComment+" New";

    @When("user clicks add button")
    public void user_clicks_add_button() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonAddItems())).click();
    }
    @When("user clicks new Doc")
    public void user_clicks_new_doc() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonAddDoc())).click();
    }

    @When("user input Doc title")
    public void user_input_doc_title() throws InterruptedException {
        WebElement inputDocTitle = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getInputDocTitle()));
        inputDocTitle.click();
        Thread.sleep(3000);
        inputDocTitle.sendKeys(docTitle1);
    }

    @When("user input Doc content")
    public void user_input_doc_content() {
        WebElement inputDocContent = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getInputDocContent()));
        inputDocContent.sendKeys(docContent1);

    }

    @When("user add subscriber")
    public void user_add_subscriber() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonAddSubsDoc())).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getChecklistSubsDoc())).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonDoneSubsDoc())).click();

    }

    @When("user clicks publish")
    public void user_clicks_publish() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonPublish())).click();
    }

    @Then("user is notified success message")
    public void user_is_notified_success_message() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getToastSuccess())).isDisplayed();
    }

    @Then("user can see created Doc on the page")
    public void user_can_see_created_doc_on_the_page() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getCreatedDoc(docTitle1))).isDisplayed();
    }

    @When("user clicks created Docs")
    public void user_clicks_created_docs() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getCreatedDoc(docTitle1))).click();
    }

    @When("user clicks option button")
    public void user_clicks_option_button() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonOptionDoc())).click();
    }

    @When("user clicks Edit button")
    public void user_clicks_edit_button() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonEditDoc())).click();
    }

    @When("user switch on private option")
    public void user_switch_on_private_option() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getSwitchPublicPrivate())).click();
    }

    @When("user clicks Publish Changes")
    public void user_clicks_publish_changes() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonPublishChange())).click();
    }

    @Then("user can see locked mark on the page")
    public void user_can_see_locked_mark_on_the_page() {
        //skip, element not available in mobile
    }

    @When("user clicks Archive this button")
    public void user_clicks_archive_this_button() {
        //skipped in web
    }

    @Then("user is notified Doc is already archived")
    public void user_is_notified_doc_is_already_archived() {
        //skipped
    }

    @Then("user is notified title must be filled")
    public void user_is_notified_title_must_be_filled() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getToastMandatory())).isDisplayed();
    }

    @Then("user is notified description must be filled")
    public void user_is_notified_description_must_be_filled() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getToastMandatory())).isDisplayed();
    }

    @When("user input new name")
    public void user_input_new_name() {
        WebElement inputDocTitle = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getInputDocTitle()));
        inputDocTitle.click();
        inputDocTitle.sendKeys(Keys.CONTROL+"A");
        inputDocTitle.sendKeys(Keys.BACK_SPACE);
        inputDocTitle.sendKeys(newDocTitle);
    }

    @When("user input new Description")
    public void user_input_new_description() {
        WebElement inputDocContent = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getInputDocContent()));
        inputDocContent.click();
        inputDocContent.sendKeys(docContent1+" New");
    }

    @Then("user can see the changes on the page")
    public void user_can_see_the_changes_on_the_page() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getTitleDoc(newDocTitle)));
    }

    @When("user switch off private option")
    public void user_switch_off_private_option() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getSwitchPublicPrivate())).click();

    }

    @Then("user cannot see locked mark on the page")
    public void user_cannot_see_locked_mark_on_the_page() {
        // skipped, element cannot be detected in Mobile app
    }

    @When("user clicks cancel or back button")
    public void user_clicks_cancel_or_back_button() {
        driver.navigate().back();
    }

    @When("user clicks cheers button")
    public void user_clicks_cheers_button() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonDocCheers())).click();
    }

    @When("user input cheers words")
    public void user_input_cheers_words() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getInputDocCheers())).sendKeys(docCheers);
    }

    @When("user clicks done button")
    public void user_clicks_done_button() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonDoneDocCheers())).click();
    }

    @Then("user is notified success cheers message")
    public void user_is_notified_success_cheers_message() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getToastSuccess())).isDisplayed();
    }

    @Then("user can see created cheers on Doc")
    public void user_can_see_created_cheers_on_doc() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getCreatedCheers(docCheers))).isDisplayed();
    }

    @When("user clicks on created cheers")
    public void user_clicks_on_created_cheers() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getCreatedCheers(docCheers))).click();
    }

    @When("user clicks delete button")
    public void user_clicks_delete_button() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonDeleteCheersDoc())).click();
    }

    @Then("user is notified success delete cheers message")
    public void user_is_notified_success_delete_cheers_message() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getToastSuccess())).isDisplayed();
    }

    @Then("user cannot see created cheers on Doc")
    public void user_cannot_see_created_cheers_on_doc() {
        List<WebElement> createdCheers = driver.findElements(elementPageDocsFiles.getCreatedCheers(docCheers));
        int elementSize = createdCheers.size();
        Assert.assertEquals(0, elementSize);
    }

    @When("user clicks on comment section")
    public void user_clicks_on_comment_section() {
       //skipped
    }

    @When("user input comment")
    public void user_input_comment() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getInputComment())).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getInputComment())).sendKeys(textComment);
    }

    @When("user clicks post button")
    public void user_clicks_post_button() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonSubmit())).click();
    }

    @Then("user is notified success message adding comment")
    public void user_is_notified_success_message_adding_comment() {
        //Skipped, web only
    }

    @Then("user can see created comment on page")
    public void user_can_see_created_comment_on_page() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getCreatedComment(textComment))).isDisplayed();
    }

    @When("user clicks options on existing comment")
    public void user_clicks_options_on_existing_comment() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonOptionCreatedComment())).click();
    }

    @When("user input edited comment")
    public void user_input_edited_comment() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getInputComment())).sendKeys(newTextComment);
    }

    @Then("user is notified success message editing comment")
    public void user_is_notified_success_message_editing_comment() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getToastSuccessEditComment())).isDisplayed();
    }

    @Then("user can see edited comment on page")
    public void user_can_see_edited_comment_on_page() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getCreatedComment(newTextComment)));
    }

    @When("user clicks reply on existing comment")
    public void user_clicks_reply_on_existing_comment() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonReplyComment())).click();
    }

    @Then("user is notified success message adding reply")
    public void user_is_notified_success_message_adding_reply() {
        //Skipped, web only
    }

    @Then("user can see created reply on page")
    public void user_can_see_created_reply_on_page() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getCreatedComment(textComment)));
    }

    @When("user confirm delete button")
    public void user_confirm_delete_button() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getButtonOk())).click();
    }

    @Then("user is notified delete comment success")
    public void user_is_notified_delete_comment_success() {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDocsFiles.getToastArchiveSuccess())).isDisplayed();
    }

    @Then("user cannot see the deleted comment on page")
    public void user_cannot_see_the_deleted_comment_on_page() {
        List<WebElement> createdComment = driver.findElements(elementPageDocsFiles.getCreatedComment(newTextComment));
        Assert.assertEquals(createdComment.size(),0);
    }

}
