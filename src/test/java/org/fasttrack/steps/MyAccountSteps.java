package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class MyAccountSteps extends BaseSteps {

    @Step
    public void clickMyAccountButton() {
        myAccountPage.clickMyAccountButton();
    }

    @Step
    public void clickAccountDetailsButton() {
        myAccountPage.clickAccountDetailsButton();
    }

    @Step
    public void setCurrentPasswordField(String currentpassword) {
        myAccountPage.setCurrentPasswordField(currentpassword);
    }

    @Step
    public void setNewPasswordField(String newpassword) {
        myAccountPage.setNewPasswordField(newpassword);
    }

    @Step
    public void setNewPasswordConfirmField(String newpasswordconfirm) {
        myAccountPage.setNewPasswordConfirmField(newpasswordconfirm);
    }

    @Step
    public void clickSaveChangesPasswordButton() {
        myAccountPage.clickSaveChangesPasswordButton();
    }

    @Step
    public void checkPasswordMessageConfirmation() {
        Assert.assertEquals(("ACCOUNT DETAILS CHANGED SUCCESSFULLY.").toLowerCase(), myAccountPage.getCheckPasswordMessageConfirmation().toLowerCase());

    }

    @Step
    public void clickMyOrdersButton() {
        myAccountPage.clickMyOrdersButton();
    }

    @Step
    public void clickMyViewOrderButton() {
        myAccountPage.clickMyViewOrderButton();
    }

    @Step
    public void checkMyLastOrderNumber() {
        Assert.assertEquals(("Order #3782 was placed on September 27, 2022 and is currently Processing.").toLowerCase(), myAccountPage.getMyLastOrderNumber().toLowerCase());
    }
}