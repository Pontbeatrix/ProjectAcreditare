package org.fasttrack.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {
    @FindBy(css = ".single_add_to_cart_button.button ")
    private WebElementFacade addCartButton;
    @FindBy(css = "a[href='http://qa3.fasttrackit.org:8008/checkout']")
    private WebElementFacade checkoutButton;

    @FindBy(css = ".fa.fa-shopping-cart") //.button.wc-forward
    private WebElementFacade viewCartButton;

    public void clickAddCartButton() {
        clickOn(addCartButton);
    }

    public void clickCheckoutButton() {
        clickOn(checkoutButton);
    }

    public void clickViewCartButton() {
        clickOn(viewCartButton);
    }


    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successMessage;


    @FindBy(css = " .product-subtotal .woocommerce-Price-amount.amount")
    private List<WebElementFacade> subtotalProductsList;

    @FindBy(css = ".cart-subtotal .woocommerce-Price-amount.amount")
    private WebElementFacade subtotalCartPrice;

    @FindBy(css = ".shipping .woocommerce-Price-amount.amount")
    private WebElementFacade taxPrice;

    @FindBy(css = ".order-total .woocommerce-Price-amount.amount")
    private WebElementFacade totalCartPrice;

    public String getSuccessMessage() {
        return successMessage.getText().replace("View cart\n", "");
    }

    public int getProductsSubtotal() {
        int sum = 0;
        for (WebElementFacade elementFacade : subtotalProductsList) {
            sum += convertStringToInteger(elementFacade.getText());
        }
        return sum;
    }

    public boolean checkIfSubtotalMatches() {
        int expected = getProductsSubtotal();
        int actual = convertStringToInteger(subtotalCartPrice.getText());
        return expected == actual;
    }

    public boolean checkIfTotalPriceMatches() {
        int subtotal = getProductsSubtotal();
        int fee = convertStringToInteger(taxPrice.getText());
        int expectedTotal = subtotal + fee;
        int actualTotal = convertStringToInteger(totalCartPrice.getText());
        return expectedTotal == actualTotal;
    }

    @FindBy(css = "div.quantity .input-text.qty.text")
    private WebElementFacade clickQuantityField;

    @FindBy(css = "div.quantity .input-text.qty.text")
    private WebElementFacade modifyQuantityField;

    @FindBy(css = ".woocommerce-cart-form__cart-item.cart_item a.remove")
    private WebElementFacade removeProductButton;

    @FindBy(css = ".cart-empty")
    private WebElementFacade checkCartEmptyMessage;

    @FindBy(css = "#coupon_code")
    private WebElementFacade myCouponCodeField;

    @FindBy(css = ".coupon .button")
    private WebElementFacade applyCouponButton;

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successMessageCouponApplied;

    public void clickQuantityField() {
        clickOn(clickQuantityField);
    }

    public void setModifyQuantityField(String value) {
        typeInto(modifyQuantityField, value);
    }

    public void clickRemoveProductButton() {
        clickOn(removeProductButton);
    }

    public String getCheckCartEmptyMessage() {
        return checkCartEmptyMessage.getText();
    }

    public void setMyCouponCodeField(String value) {
        typeInto(myCouponCodeField, value);
    }

    public void clickApplyCouponButton() {
        clickOn(applyCouponButton);
    }

    public String getSuccessMessageCouponApplied() {
        return successMessageCouponApplied.getText();
    }


}
