package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckOutPage extends PageObject {

    @FindBy(css = " #billing_address_1")
    private WebElementFacade addressField;

    @FindBy(css = " #billing_city")
    private WebElementFacade cityAddressField;

    @FindBy(css = "#billing_state")
    private WebElementFacade stateField;

    @FindBy(css = "#billing_postcode")
    private WebElementFacade postCodeField;

    @FindBy(css = "#billing_phone")
    private WebElementFacade telephoneField;

    @FindBy(css = ".place-order #place_order")
    private WebElementFacade placeOrderButton;

    @FindBy(css = "#billing_first_name")
    private WebElementFacade firstNameField;

    @FindBy(css = "#billing_last_name")
    private WebElementFacade lastNameField;

    @FindBy(css = "#billing_email")
    private WebElementFacade emailField;

    @FindBy(css = "p.woocommerce-notice")
    private WebElementFacade orderConfirmationMessage;


    public void setAddressField(String value) {
        typeInto(addressField, value);
    }

    public void setCityAddressField(String value) {
        typeInto(cityAddressField, value);
    }

    public void setStateField(String state) {
        stateField.selectByVisibleText("Bihor");
    }

    public void setPostCodeField(String value) {
        typeInto(postCodeField, value);
    }

    public void setTelephoneField(String value) {
        typeInto(telephoneField, value);
    }


    public void placeOrderButton() {
        clickOn(placeOrderButton);
    }

    public void setFirstNameField(String value) {
        typeInto(firstNameField, value);
    }

    public void setLastNameField(String value) {
        typeInto(lastNameField, value);
    }

    public void setemailField(String value) {
        typeInto(emailField, value);
    }

    public String getOrderConfirmationMessage() {
        return orderConfirmationMessage.getText();
    }

}






