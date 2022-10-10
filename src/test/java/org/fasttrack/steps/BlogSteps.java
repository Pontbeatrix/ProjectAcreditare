package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class BlogSteps extends BaseSteps {

    @Step
    public void clickBlogButton() {
        blogPage.clickBlogButton();

    }

    @Step
    public void setBlogCommentField(String text) {
        blogPage.setBlogCommentField(text);
    }

    @Step
    public void clickBlogSubmitButton() {
        blogPage.clickBlogSubmitButton();
    }

    @Step
    public void successBlogCommentAppear() {
        String expected = "Varietate de produse gasesc de tot ce am nevoie numai de aici voi comanda. O zi placuta\n" +
                "ヽ(^。^)丿";
        String actual = blogPage.getSuccessBlogCommentAppear();
        Assert.assertEquals(expected, actual);
    }
}