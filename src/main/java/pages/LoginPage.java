package pages;

import config.Config;
import fieldDecorator.elements.Button;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    private String homeUrl = Config.getProperty("homeUrl");

    public void login() {
        driver.get(homeUrl);//example
        waitUntilPageLoaded();
    }

    @FindBy(name = "email")
    private WebElement emailTextField;

    public WebElement getEmailTextField() {
        return emailTextField;
    }

    @FindBy(name = "passwd")
    private WebElement passwordTextField;

    public WebElement getPasswordTextField() {
        return passwordTextField;
    }

    @FindBy(xpath = "//button[@id=\"SubmitLogin\"]")
    private Button submitButton;

    public Button getSubmitButton() {
        return submitButton;
    }


}
