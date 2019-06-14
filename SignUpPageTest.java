package com.testBase;

import base.MobileAPI2;
import com.pageBase.SignUpPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpPageTest extends MobileAPI2 {

    public SignUpPage signUp=null;

    @BeforeMethod
    public void initialization(){
        signUp = PageFactory.initElements(appiumDriver, SignUpPage.class);
    }

    @Test(enabled = false)
    public void testCreateAccount(){
        signUp.createAccount();
    }
    @Test(enabled = false)
    public void testAccountCreation(){ //test to run
        signUp.createAccount();
        signUp.accountCreation("mohdfaruque89@gmail.com");
        signUp.accountCreationfirst("mohd");
        signUp.accountCreationlast("faruque");
        signUp.accountCreationphone("9290000805)");
        signUp.accountCreationpassword("sami2008");
    }
    @Test(enabled = false)
    public void testAccountCreation2(){
        signUp.createAccount();
        signUp.accountCreation("abc123@gmail.com");
        signUp.accountCreationfirst("ohan");
        signUp.accountCreationlast("Rafiq");
        signUp.accountCreationphone("6462860000");
        signUp.accountCreationpassword("abcvf");
    }
    @Test(enabled = false)
    public void testAccountCreation3(){
        signUp.createAccount();
        signUp.accountCreation("abcd1234@gmail.com");
        signUp.accountCreationfirst("alam");
        signUp.accountCreationlast("malik");
        signUp.accountCreationphone("1234567890)");
        signUp.accountCreationpassword("loveinu123");
    }

    @Test(enabled = false)
    public void testAccountCreation4(){
        signUp.createAccount();
        signUp.accountCreation("mannan1900@gmail.com");
        signUp.accountCreationfirst("mannan");
        signUp.accountCreationlast("miah");
        signUp.accountCreationphone("1235678034)");
        signUp.accountCreationpassword("asdfg123");
    }

    @Test(enabled = false)
    public void testAccountCreation5(){
        signUp.createAccount();
        signUp.accountCreation("niamul@gmail.com ");
        signUp.accountCreationfirst("niamul");
        signUp.accountCreationlast("haq");
        signUp.accountCreationphone("38765432190)");
        signUp.accountCreationpassword("asdqw123");
    }

}
