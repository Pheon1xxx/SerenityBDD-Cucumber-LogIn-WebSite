package Pages;

import net.thucydides.core.annotations.Step;

public class HomePage  {

    OrangeHRMHomePage homePage;
    @Step
    public void openApp(){
        homePage.open();
    }

    @Step
    public void enterUsername(){
        homePage.enterUName();
    }

    @Step
    public void enterPassword(){
        homePage.enterPassword();
    }

    @Step
    public void clickOnLoginButton(){
        homePage.clickLogin();
    }
}
