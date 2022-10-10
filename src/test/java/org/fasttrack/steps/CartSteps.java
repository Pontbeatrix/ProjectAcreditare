package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps {

    @Step
    public void addProductToCart() {
        cartPage.clickAddCartButton();

    }

    @Step
    public void viewCartButton() {
        cartPage.clickViewCartButton();
    }

    @Step
    public void checkoutButton() {
        cartPage.clickCheckoutButton();
    }

    @Step
    public void checkSuccessMessage(String productName) {
        String expected = "“" + productName.toLowerCase() + "” has been added to your cart.".toLowerCase();
        String actual = cartPage.getSuccessMessage().toLowerCase();
        Assert.assertEquals(expected, actual);

    }

    @Step
    public void checkSubtotalPrice() {
        Assert.assertTrue(cartPage.checkIfSubtotalMatches());
    }

    @Step
    public void checkTotalPrice() {
        Assert.assertTrue(cartPage.checkIfTotalPriceMatches());
    }

    @Step
    public void setModifyQuantityField(String quantityField) {
        cartPage.setModifyQuantityField(quantityField);
    }

    @Step
    public void clickQuantityField() {
        cartPage.clickQuantityField();
    }

    @Step
    public void clickRemoveProductButton() {
        cartPage.clickRemoveProductButton();
    }

    @Step

    public void checkCartEmptyMessage() {
        String expected = "Your cart is currently empty.".toLowerCase();
        String actual = cartPage.getCheckCartEmptyMessage().toLowerCase();
        Assert.assertEquals(expected, actual);


    }

    @Step
    public void setMyCouponCodeField(String couponCodeField) {
        cartPage.setMyCouponCodeField(couponCodeField);
    }

    @Step
    public void clickApplyCouponButton() {
        cartPage.clickApplyCouponButton();
    }

    @Step
    public void successMessageCouponApplied() {
        Assert.assertEquals(("Coupon code applied successfully.").toLowerCase(), cartPage.getSuccessMessageCouponApplied().toLowerCase());
    }


}
