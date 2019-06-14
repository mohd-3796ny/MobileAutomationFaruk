package homepage;

import base.MobileAPI2;

public class RegestrationPage extends MobileAPI2 {

    RegestrationPage regestrationPage;
    public void Login() {
        clickByXpath("//android.widget.LinearLayout[@content-desc=\"Sign in or Register\"]/android.widget.LinearLayout/android.widget.Button[2]\n");
        typeByXpath("//android.widget.LinearLayout[@content-desc=\"Sign in\"]/android.widget.EditText\n","mohd");
        typeByXpath("//android.widget.LinearLayout[@content-desc=\"Sign in\"]/android.widget.RelativeLayout[2]","Dhaka1234@");
        clickByXpath("//android.widget.LinearLayout[@content-desc=\"Sign in\"]/android.widget.LinearLayout[1]/android.widget.Button[2]\n");
    }

    public void signUP() throws InterruptedException {

        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.View/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[1]\n");
        typeByXpath("//android.webkit.WebView[@content-desc=\"Get started with eBay\"]/android.view.View[2]/android.view.View[2]/android.widget.EditText\n","mohd");
        typeByXpath("//android.webkit.WebView[@content-desc=\"Get started with eBay\"]/android.view.View[2]/android.view.View[5]/android.widget.EditText\n","faruque");
        typeByXpath("//android.webkit.WebView[@content-desc=\"Get started with eBay\"]/android.view.View[4]/android.widget.EditText\n","mohd123gmail");
        typeByXpath("//android.webkit.WebView[@content-desc=\"Get started with eBay\"]/android.view.View[8]/android.widget.EditText\n","123abc");

        wait(5);

        clickByXpath("//android.widget.Button[@content-desc=\" Please complete the form to activate this button\"]\n");
    }


    public void swipeDown() throws InterruptedException {
        Thread.sleep(3000);
        Thread.sleep(3000);
    }





}
