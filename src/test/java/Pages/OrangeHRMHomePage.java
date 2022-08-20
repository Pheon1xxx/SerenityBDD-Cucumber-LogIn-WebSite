package Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMHomePage extends PageObject {

    public void enterUName(){
        $(By.name("username")).type("Admin");
    }
    public void enterPassword(){
        $(By.name("password")).type("admin123");
    }
    public void clickLogin(){
        $(By.buttonText("Login")).click();
    }

}
