package homepage;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends MobileAPI2 {

    @FindBy(id = "com.ebay.mobile:id/button_register")
    WebElement Register;

    @FindBy(id = "com.ebay.mobile:id/button_business")
    WebElement CreateaBusinessAccount;

    @FindBy(id = "businessname")
    WebElement LegalbusinessName;

    @FindBy(id = "businessemail")
    WebElement LegalBusinessEmail;

    @FindBy(id = "rbusinessemail")
    WebElement ReenterEmail;

    @FindBy(id = "PASSWORD_BIZREG")
    WebElement Password;

    @FindBy(id = "phoneFlagComp1Business")
    WebElement LegalBusinessPhone;

    public void clickOnRegister() throws InterruptedException {
        Register.click();
        Thread.sleep(5);
    }
    public void clickOnCreateaBusinessAccount() throws InterruptedException {
        CreateaBusinessAccount.getText();
        Thread.sleep(5);
    }
    public void inputLegalbusinessName() throws InterruptedException {
        LegalbusinessName.sendKeys("mohd");
        Thread.sleep(5);
    }
    public void inputLegalBusinessEmail() throws InterruptedException {
        LegalBusinessEmail.sendKeys("mohdfaruque89@gmail.com");
        Thread.sleep(5);
    }
    public void ReenterEmail() throws InterruptedException {
        ReenterEmail.sendKeys("mohdfaruque89@gmail.com");
        Thread.sleep(5);
    }
    public void Password() throws InterruptedException {
        Password.sendKeys("Sami2008");
        Thread.sleep(5);
    }
    public void LegalBusinessPhone() throws InterruptedException {
        LegalBusinessPhone.sendKeys("9173280457");
        Thread.sleep(5);
    }




}
