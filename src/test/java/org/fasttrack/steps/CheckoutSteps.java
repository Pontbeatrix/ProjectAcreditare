package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps {
    @Step
    public void checkoutButton() {
        cartPage.clickCheckoutButton();

    }

    @Step
    public void setUseraddress(String address) {
        checkOutPage.setAddressField(address);
    }

    @Step
    public void setUserCityaddress(String cityaddress) {
        checkOutPage.setCityAddressField(cityaddress);
    }

    @Step
    public void setStateField(String state) {
        checkOutPage.setStateField(state);
    }

    @Step
    public void setPostCodeField(String postCode) {
        checkOutPage.setPostCodeField(postCode);
    }

    @Step
    public void setTelephonefield(String telephone) {
        checkOutPage.setTelephoneField(telephone);
    }

    @Step
    public void placeOrderButton() {
        checkOutPage.placeOrderButton();
    }

    @Step
    public void setFirstNameField(String firstname) {
        checkOutPage.setFirstNameField(firstname);
    }

    @Step
    public void setLastNameField(String lastname) {
        checkOutPage.setLastNameField(lastname);
    }

    @Step
    public void setemailField(String emailfield) {
        checkOutPage.setemailField(emailfield);
    }

    @Step
    public void orderConfirmationMessage() {
        waitABit(2000);
        String expected = "Thank you. Your order has been received.".toLowerCase();
        String actual = checkOutPage.getOrderConfirmationMessage().toLowerCase();
        Assert.assertEquals(expected, actual);

    }

}