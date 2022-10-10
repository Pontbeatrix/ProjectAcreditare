package org.fasttrack.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(css = "#menu-item-1730")
    private WebElementFacade accountLink;

    @FindBy(css = ".fa-search ")
    private WebElementFacade searchFieldButton;

    @FindBy(css = ".search-block .search-form .search-field")
    private WebElementFacade searchField;

    @FindBy(css = ".search-form .search-submit")
    private WebElementFacade searchButton;

    @FindBy(css = ".caroufredsel_wrapper")
    private WebElementFacade bannerClickButton;
    @FindBy(css = ".home-slider-wrap .home-slider-prev")
    private WebElementFacade bannerRightButton;

    @FindBy(css = ".home-slider-wrap .home-slider-next")
    private WebElementFacade bannerLeftButton;

    @FindBy(css = " .home-slider-block-bg")
    private WebElementFacade bannerTextCatching;

    @FindBy(css = " .home-slider-block-bg")
    private WebElementFacade bannerLastTextCatching;

    @FindBy(css = " .entry-content > p:first-child")
    private WebElementFacade homePageAboutMessage;

    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public void clickSearchFieldButton() {
        clickOn(searchFieldButton);
    }

    public void setSearchField(String value) {
        typeInto(searchField, value);
    }

    public void clickSearchButton() {
        clickOn(searchButton);
    }

    public void clickBannerClickButton() {
        clickOn(bannerClickButton);
    }

    public void clickBannerRightButton() {
        clickOn(bannerRightButton);
    }

    public void clickBannerLeftButton() {
        clickOn(bannerLeftButton);
    }

    public String getBannerTextCatching() {
        return bannerTextCatching.getText();
    }

    public String getBannerLastTextCatching() {
        return bannerLastTextCatching.getText();
    }

    public String getHomePageAboutMessage() {
        return homePageAboutMessage.getText();
    }


}


