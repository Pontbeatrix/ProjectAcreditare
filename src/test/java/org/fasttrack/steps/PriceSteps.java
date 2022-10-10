package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class PriceSteps extends BaseSteps {

    @Step
    public void clickShopButton() {
        pricePage.clickShopButton();
    }

    @Step
    public void clickDropDownPriceList() {
        pricePage.clickDropDownpricelist();
    }


    @Step
    public void checkFirstAndSecondProductPrice() {
        Assert.assertTrue(pricePage.checkFirstAndSecondProductPrice());
    }


}

