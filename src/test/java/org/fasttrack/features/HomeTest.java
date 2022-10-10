package org.fasttrack.features;

import org.junit.Test;

public class HomeTest extends BaseTest {

    @Test
    public void checkIfBannerButtonIsWorking() {
        homeSteps.waitABit(2555);
        homeSteps.clickBannerClickButton();
        homeSteps.clickBannerLeftButton();
        homeSteps.clickBannerRightButton();
        homeSteps.clickBannerLeftButton();
        homeSteps.clickBannerRightButton();
        homeSteps.clickBannerLeftButton();
        homeSteps.clickBannerRightButton();
        homeSteps.clickBannerLeftButton();
        homeSteps.clickBannerRightButton();

    }

    @Test
    public void checkIfBannerImagineTextAppear() {
        homeSteps.bannerTextCatching();
        homeSteps.waitABit(6000);
        homeSteps.bannerLastTextCatching();


    }

    @Test
    public void checkHomePageDescriptionMessage() {
        homeSteps.homePageAboutMessage();

    }

}
