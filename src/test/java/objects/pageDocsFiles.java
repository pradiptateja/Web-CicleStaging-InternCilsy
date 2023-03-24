package objects;

import config.setUp;
import org.openqa.selenium.By;

public class pageDocsFiles extends setUp {

    By buttonAddItems = By.xpath("//*[@data-testid=\"AddIcon\"]/parent::div/parent::div");
    public By getButtonAddItems() {
        return buttonAddItems;
    }

    By HeaderDocsAndFiles = By.xpath("//h1[text()='Docs & Files']");
    public By getHeaderDocsAndFiles() {
        return HeaderDocsAndFiles;
    }

    By buttonAddDoc = By.xpath("//p[text()='Add a New Doc']/parent::div");
    public By getButtonAddDoc() {
        return buttonAddDoc;
    }

    By buttonAddFile = By.xpath("//p[text()='Upload Files']/parent::div");
    public By getButtonAddFile() {
        return buttonAddFile;
    }

    By buttonAddFolder = By.xpath("//p[text()='Create a New Folder']/parent::div");
    public By getButtonAddFolder() {
        return buttonAddFolder;
    }

    By inputDocTitle = By.xpath("//textarea[@placeholder=\"Type a title...\"]");
    public By getInputDocTitle() {
        return inputDocTitle;
    }

    By inputDocContent = By.xpath("//div[@class=\"fr-element fr-view\"]");
    public By getInputDocContent() {
        return inputDocContent;
    }

    By buttonAddSubsDoc = By.xpath("//div[@role=\"button\"]");
    public By getButtonAddSubsDoc() {
        return buttonAddSubsDoc;
    }

    By checklistSubsDoc = By.xpath("//*[contains(@data-testid, \"CheckBox\")]");
    public By getChecklistSubsDoc() {
        return checklistSubsDoc;
    }

    By buttonDoneSubsDoc = By.xpath("//*[text()='Done']/parent::div");
    public By getButtonDoneSubsDoc() {
        return buttonDoneSubsDoc;
    }

    By buttonPublish = By.xpath("//*[text()='Publish']/parent::button");
    public By getButtonPublish() {
        return buttonPublish;
    }

    By switchPublicPrivate = By.xpath("//input[@name=\"switchItem\"]");
    public By getSwitchPublicPrivate() {
        return switchPublicPrivate;
    }

    By toastSuccess = By.xpath("//*[contains(text(), 'success')]");
    public By getToastSuccess() {
        return toastSuccess;
    }

    public By getCreatedDoc(String documentTitle) {
        By createdDoc = By.xpath("//*[text() = '"+documentTitle+"']//ancestor::a");
        return createdDoc;
    }

    By buttonOptionDoc = By.xpath("//*[contains(@class, 'RoundAction')]");
    public By getButtonOptionDoc() {
        return buttonOptionDoc;
    }

    By buttonEditDoc = By.xpath("//*[@data-testid=\"EditIcon\"]");
    public By getButtonEditDoc() {
        return buttonEditDoc;
    }

    By buttonPublishChange = By.xpath("//*[text()='Publish Changes']/parent::button");
    public By getButtonPublishChange() {
        return buttonPublishChange;
    }

    By buttonArchiveDoc = By.xpath("//*[text()='Archive This Doc']/parent::div");
    public By getButtonArchiveDoc() {
        return buttonArchiveDoc;
    }

    By buttonOk = By.xpath("//*[text()='Delete']/ancestor::button");
    public By getButtonOk() {
        return buttonOk;
    }

    By toastMandatory = By.xpath("//*[contains(text(), 'must be filled')]");
    public By getToastMandatory() {
        return toastMandatory;
    }

    public By getTitleDoc(String newDocTitle) {
        By titleDoc = By.xpath("//h1[text() = '"+newDocTitle+"']");
        return titleDoc;
    }

    By buttonDocCheers = By.xpath("//div[contains(@class,\"CheersButton\")]");
    public By getButtonDocCheers() {
        return buttonDocCheers;
    }

    By inputDocCheers = By.xpath("//input[@placeholder=\"Give'em cheers!\"]");
    public By getInputDocCheers() {
        return inputDocCheers;
    }

    By buttonDoneDocCheers = By.xpath("//*[@data-testid=\"CheckCircleOutlineIcon\"]");
    public By getButtonDoneDocCheers() {
        return buttonDoneDocCheers;
    }

    public By getCreatedCheers(String txtCheers) {
        By createdCheers = By.xpath("//p[text()= '"+txtCheers+"']");
        return createdCheers;
    }

    By buttonDeleteCheersDoc = By.xpath("//*[@data-testid=\"DeleteIcon\"]");
    public By getButtonDeleteCheersDoc() {
        return buttonDeleteCheersDoc;
    }


    By inputComment = By.xpath("//input[@placeholder=\"Add new comment...\"]");
    public By getInputComment() {
        return inputComment;
    }

    By buttonSubmit = By.xpath("//*[text()='Post']/ancestor::button");
    public By getButtonSubmit() {
        return buttonSubmit;
    }

    public By getCreatedComment(String comment) {
        By createdComment = By.xpath("//*[text()='"+comment+"']");
        return createdComment;
    }

    By ButtonOptionCreatedComment = By.xpath("//*[@data-testid=\"MoreHorizOutlinedIcon\"]");
    public By getButtonOptionCreatedComment() {
        return ButtonOptionCreatedComment;
    }

    By toastSuccessEditComment = By.xpath("//*[contains(text(), 'success')]");
    public By getToastSuccessEditComment() {
        return toastSuccessEditComment;
    }

    By buttonReplyComment = By.xpath("//*[text()='Reply']/ancestor::a");
    public By getButtonReplyComment() {
        return buttonReplyComment;
    }

    By toastArchiveSuccess = By.xpath("//*[contains(text(), 'success')]");
    public By getToastArchiveSuccess() {
        return toastArchiveSuccess;
    }
}
