package org.fasttrack.features;

import org.junit.Test;

public class PriceTest extends BaseTest {

    @Test
    public void checkProductPrice() {
        priceSteps.clickShopButton();
        priceSteps.clickDropDownPriceList();
        priceSteps.checkFirstAndSecondProductPrice();

    }


}

