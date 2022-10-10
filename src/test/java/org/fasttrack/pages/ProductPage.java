package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {
    @FindBy(css = ".single_add_to_cart_button.button ")
    private WebElementFacade addToCartButton;


    public void clickAddToCart() {
        clickOn(addToCartButton);
    }

    @FindBy(css = "a[href='#tab-reviews']")
    private WebElementFacade reviewButton;

    @FindBy(css = "p .star-3")
    private WebElementFacade ratingButton;

    @FindBy(css = " #comment")
    private WebElementFacade commentField;

    @FindBy(css = "#submit")
    private WebElementFacade reviewAndCommentButton;

    @FindBy(css = "div.description")
    private WebElementFacade checkCommentIsVisible;

    @FindBy(css = ".orderby")
    private WebElementFacade sortByDropDownField;


    public void clickReviewButton() {
        clickOn(reviewButton);
    }

    public void clickRatingButton() {
        clickOn(ratingButton);
    }

    public void setCommentField(String value) {
        typeInto(commentField, value);
    }

    public void clickReviewAndCommentButton() {
        clickOn(reviewAndCommentButton);
    }

    public String getCheckCommentIsVisible() {
        return checkCommentIsVisible.getText();
    }

    public void setSortByAverageDropDownField(String averageDropDownField) {
        sortByDropDownField.selectByVisibleText("Sort by average rating");
    }

    public void setSortByNewnessDropDownField(String newnessDropDownField) {
        sortByDropDownField.selectByVisibleText("Sort by newness");
    }

    public void setSortByLowToHighDropDownField(String lowToHighDropDownField) {
        sortByDropDownField.selectByVisibleText("Sort by price: low to high");
    }

    public void setSortByHighToLowDropDownField(String highToLowDropDownField) {
        sortByDropDownField.selectByVisibleText("Sort by price: high to low");
    }

}

