package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProductSteps extends BaseSteps {

    @Step
    public void reviewButton() {
        productPage.clickReviewButton();
    }

    @Step
    public void ratingButton() {
        productPage.clickRatingButton();
    }

    @Step
    public void setCommentField(String comment) {
        productPage.setCommentField(comment);
    }

    @Step
    public void reviewAndCommentButton() {
        productPage.clickReviewAndCommentButton();
    }

    @Step
    public void checkCommentIsVisible() {
        Assert.assertEquals(("Un hanorac foarte bun de care sunt foarte mulțumit. Îl folosesc prin casă și este perfect pentru nevoile mele.").toLowerCase(), productPage.getCheckCommentIsVisible().toLowerCase());
    }

    @Step
    public void setSortByAverageDropDownField(String averageDropDownField) {
        productPage.setSortByAverageDropDownField(averageDropDownField);
    }

    @Step
    public void setSortByNewnessDropDownField(String newnessDropDownField) {
        productPage.setSortByNewnessDropDownField(newnessDropDownField);
    }

    @Step
    public void setSortByLowToHighDropDownField(String lowToHighDropDownField) {
        productPage.setSortByLowToHighDropDownField(lowToHighDropDownField);
    }

    @Step
    public void setSortByHighToLowDropDownField(String highToLowDropDownField) {
        productPage.setSortByHighToLowDropDownField(highToLowDropDownField);
    }
}





