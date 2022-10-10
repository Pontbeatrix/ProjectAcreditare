package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomeSteps extends BaseSteps {

    @Step
    public void clickBannerClickButton() {
        homePage.clickBannerClickButton();
    }

    @Step
    public void clickBannerRightButton() {
        homePage.clickBannerRightButton();
    }

    @Step
    public void clickBannerLeftButton() {
        homePage.clickBannerLeftButton();
    }

    @Step
    public void bannerTextCatching() {
        String expected = "A LITTLE EXTRA THOUGHT\n".toLowerCase() + "It's that little extra thought that counts".toLowerCase();
        String actual = homePage.getBannerTextCatching().toLowerCase();
        Assert.assertEquals(expected, actual);


    }

    @Step
    public void bannerLastTextCatching() {
        String expected = "ONLINE SHOPPING\n".toLowerCase() + "Install WooCommerce to start building your online store".toLowerCase();
        String actual = homePage.getBannerLastTextCatching().toLowerCase();
        Assert.assertEquals(expected, actual);
    }

    @Step
    public void homePageAboutMessage() {
        String expected = "This is an example page. It’s different from a blog post because it will stay in one place and will show up in your site navigation (in most themes). Most people start with an About page that introduces them to potential site visitors. It might say something like this:".toLowerCase();
        String actual = homePage.getHomePageAboutMessage().toLowerCase();
        Assert.assertEquals(expected, actual);
    }
}