package org.fasttrack.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends PageObject {

    @FindBy(css = "a[href='http://qa3.fasttrackit.org:8008/blog']")
    private WebElementFacade blogButton;

    @FindBy(css = ".comment-form-comment :last-child")
    private WebElementFacade blogCommentField;

    @FindBy(css = ".form-submit #submit")
    private WebElementFacade blogSubmitButton;

    @FindBy(css = "#div-comment-1751 .comment-content")
    private WebElementFacade successBlogCommentAppear;


    public void clickBlogButton() {
        clickOn(blogButton);
    }

    public void setBlogCommentField(String text) {
        typeInto(blogCommentField, text);
    }

    public void clickBlogSubmitButton() {
        clickOn((blogSubmitButton));
    }

    public String getSuccessBlogCommentAppear() {
        return successBlogCommentAppear.getText();
    }


}
