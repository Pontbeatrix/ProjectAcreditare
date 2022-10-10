package org.fasttrack.features;
import org.fasttrack.utils.Constans;
import org.junit.Test;


public class CartTest extends BaseTest {

    @Test
    public void loginAndAddToCartTest() {
        loginSteps.doLogin(Constans.USER_EMAIl, Constans.USER_PASS);
        searchSteps.navigateToProductName("CAP");
        cartSteps.addProductToCart();

    }

    @Test
    public void checkTotalAndSubtotalTest() {
        loginSteps.doLogin(Constans.USER_EMAIl, Constans.USER_PASS);
        searchSteps.navigateToProductName("BELT");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("BELT");
        searchSteps.navigateToProductName("CAP");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("CAP");
        cartSteps.viewCartButton();
        cartSteps.checkSubtotalPrice();
        cartSteps.checkTotalPrice();
    }

    @Test
    public void addProductsQuantityAndRemove() {
        loginSteps.doLogin(Constans.USER_EMAIl, Constans.USER_PASS);
        searchSteps.navigateToProductName("BELT");
        cartSteps.addProductToCart();
        searchSteps.navigateToProductName("CAP");
        cartSteps.addProductToCart();
        searchSteps.navigateToProductName("bzZDKvQo");
        cartSteps.clickQuantityField();
        cartSteps.setModifyQuantityField("45");
        cartSteps.addProductToCart();
        cartSteps.viewCartButton();
        cartSteps.clickRemoveProductButton();
        cartSteps.viewCartButton();
        cartSteps.clickRemoveProductButton();
        cartSteps.viewCartButton();
        cartSteps.clickRemoveProductButton();
        cartSteps.viewCartButton();
    }

    @Test
    public void checkIfCartEmptyMessage() {
        loginSteps.doLogin(Constans.USER_EMAIl, Constans.USER_PASS);
        cartSteps.viewCartButton();
        cartSteps.checkCartEmptyMessage();
    }

    @Test
    public void addCouponCodeToMyCart() {
        loginSteps.doLogin(Constans.USER_EMAIl, Constans.USER_PASS);
        searchSteps.navigateToProductName("BELT");
        cartSteps.addProductToCart();
        searchSteps.navigateToProductName("CAP");
        cartSteps.addProductToCart();
        searchSteps.navigateToProductName("bzZDKvQo");
        cartSteps.clickQuantityField();
        cartSteps.setModifyQuantityField("45");
        cartSteps.addProductToCart();
        cartSteps.viewCartButton();
        cartSteps.setMyCouponCodeField("branzas2022");
        cartSteps.clickApplyCouponButton();
        cartSteps.successMessageCouponApplied();

    }


}



