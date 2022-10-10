package org.fasttrack.features;

import org.fasttrack.utils.Constans;
import org.junit.Test;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn("pontebeatrix");
    }

    @Test
    public void loginWithInvalidPasswordTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.NEW_USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedIn();
    }


}
