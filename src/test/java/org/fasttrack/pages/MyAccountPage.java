package org.fasttrack.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageObject {

    @FindBy(css = "a[href='http://qa3.fasttrackit.org:8008/my-account']")
    private WebElementFacade myAccountButton;

    @FindBy(css = ".woocommerce-MyAccount-navigation a[href='http://qa3.fasttrackit.org:8008/my-account/edit-account/']")
    private WebElementFacade accountDetailsButton;

    @FindBy(css = "#password_current")
    private WebElementFacade currentPasswordField;

    @FindBy(css = "#password_1")
    private WebElementFacade newPasswordField;
    @FindBy(css = "#password_2")
    private WebElementFacade newPasswordconfirmField;

    @FindBy(css = ".woocommerce-Button.button")
    private WebElementFacade saveChangesPasswordButton;

    @FindBy(css = ".woocommerce .woocommerce-message")
    private WebElementFacade checkPasswordMessageConfirmation;

    @FindBy(css = "li a[href='http://qa3.fasttrackit.org:8008/my-account/orders/']")
    private WebElementFacade myOrdersButton;

    @FindBy(css = ".woocommerce-orders-table__cell.woocommerce-orders-table__cell-order-actions a[href='http://qa3.fasttrackit.org:8008/my-account/view-order/3782/']")
    private WebElementFacade myViewOrderButton;

    @FindBy(css = ".woocommerce-MyAccount-content > p")
    private WebElementFacade myLastOrderNumber;

    public void clickMyAccountButton() {
        clickOn(myAccountButton);
    }

    public void clickAccountDetailsButton() {
        clickOn(accountDetailsButton);
    }

    public void setCurrentPasswordField(String value) {
        typeInto(currentPasswordField, value);
    }

    public void setNewPasswordField(String value) {
        typeInto(newPasswordField, value);
    }

    public void setNewPasswordConfirmField(String value) {
        typeInto(newPasswordconfirmField, value);
    }

    public void clickSaveChangesPasswordButton() {
        clickOn(saveChangesPasswordButton);
    }

    public String getCheckPasswordMessageConfirmation() {
        return checkPasswordMessageConfirmation.getText();
    }

    public void clickMyOrdersButton() {
        clickOn(myOrdersButton);
    }

    public void clickMyViewOrderButton() {
        clickOn(myViewOrderButton);
    }

    public String getMyLastOrderNumber() {
        return myLastOrderNumber.getText();
    }


}
