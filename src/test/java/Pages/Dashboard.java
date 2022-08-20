package Pages;

import net.thucydides.core.annotations.Step;

public class Dashboard {
    OrangeHRMDashBoard dashBoard;

    @Step
    public void verifyAdmin(){
        dashBoard.loginVerified();
    }

}
