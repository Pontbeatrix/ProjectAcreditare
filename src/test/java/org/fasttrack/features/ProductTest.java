package org.fasttrack.features;

import org.fasttrack.utils.Constans;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void reviewAndCommentProduct() {
        loginSteps.doLogin(Constans.USER_EMAIl, Constans.USER_PASS);
        searchSteps.navigateToProductName("Hoodie with Zipper");
        productSteps.reviewButton();
        productSteps.ratingButton();
        productSteps.setCommentField("Un hanorac foarte bun de care sunt foarte mulțumit. Îl folosesc prin casă și este perfect pentru nevoile mele.");
        productSteps.reviewAndCommentButton();
    }

    @Test
    public void checkIfProductCommentIsAvailable() {
        loginSteps.doLogin(Constans.USER_EMAIl, Constans.USER_PASS);
        searchSteps.navigateToProductName("Hoodie with Zipper");
        productSteps.reviewButton();
        productSteps.checkCommentIsVisible();

    }

    @Test
    public void checkCategoryDropDownField() {
        loginSteps.doLogin(Constans.USER_EMAIl, Constans.USER_PASS);
        priceSteps.clickShopButton();
        productSteps.setSortByAverageDropDownField("Sort by average rating");
        productSteps.waitABit(1000);
        priceSteps.clickShopButton();
        productSteps.setSortByNewnessDropDownField("Sort by newness");
        productSteps.waitABit(1000);
        priceSteps.clickShopButton();
        productSteps.setSortByLowToHighDropDownField("Sort by price: low to high");
        productSteps.waitABit(1000);
        priceSteps.clickShopButton();
        productSteps.setSortByHighToLowDropDownField("Sort by price: high to low");
        productSteps.waitABit(1000);

    }


}
