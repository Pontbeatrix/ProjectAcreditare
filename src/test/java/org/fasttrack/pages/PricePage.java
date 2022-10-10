package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class PricePage extends BasePage {

    @FindBy(css = "a[href='http://qa3.fasttrackit.org:8008/shop']")
    private WebElementFacade shopButton;

    @FindBy(css = ".orderby :last-child")
    private WebElementFacade dropDownpricelist;

    @FindBy(css = ".price  :first-child")
    private WebElementFacade firstProductPrice;

    @FindBy(css = ".price :nth-child(2)")
    private WebElementFacade secondProductPrice;

    public void clickShopButton() {
        clickOn(shopButton);
    }

    public void clickDropDownpricelist() {
        clickOn(dropDownpricelist);
    }


    public boolean checkFirstAndSecondProductPrice() {


        int firstProduct = convertStringToInteger(firstProductPrice.getText());
        int secondProduct = convertStringToInteger(secondProductPrice.getText());

        return firstProduct != secondProduct;

    }

}