package org.fasttrack.features;

import org.fasttrack.utils.Constans;
import org.junit.Test;

public class BlogTest extends BaseTest {

    @Test
    public void blogCommentWriting() {

        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        blogSteps.clickBlogButton();
        blogSteps.setBlogCommentField("Varietate de produse gasesc de tot ce am nevoie numai de aici voi comanda. O zi placuta\n" +
                "ヽ(^。^)丿");
        blogSteps.successBlogCommentAppear();
        blogSteps.clickBlogSubmitButton();

    }
}