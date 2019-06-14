package com.testBase;

import base.MobileAPI2;
import com.pageBase.HomePage;
import com.pageBase.ShoppingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingPageTest<Shopping> extends MobileAPI2 {
    ShoppingPage shoppingPage;

    Shopping shopping= (Shopping) PageFactory.initElements(appiumDriver, HomePage.class);

    @BeforeMethod
    public void initialization(){
    }

    @Test(enabled = false)
    public void testSetShopping(){

        shopping.notifyAll ();
    }

    @Test(enabled = false)
    public  void testSetWeeklyadd(){

        shopping.notify
                ();
    }
    @Test(enabled = false)
    public void testSetCartWheel(){

        shopping.notify ();
    }




}
