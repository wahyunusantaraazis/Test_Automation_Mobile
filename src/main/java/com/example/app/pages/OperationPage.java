package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class OperationPage extends BasePageObject {

    public void inputUsername(String username){
        type(MobileBy.id("username"),username);
    }
    public void inputangka1 (String angka1){
        type(MobileBy.id("et_1"), angka1);
    }

    public void inputangka2 (String angka2){
        type(MobileBy.id("et_2"),  angka2);
    }

    public void clickDropDownOperator(){
        click(MobileBy.id("spinner_1"));
    }
    public void choosePlus (){
        click(MobileBy.xpath("//android.widget.TextView[@resource-id='android:id/text1']"));
    }
    public void chooseMinus(){
        click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
    }
    public void chooseDivided(){
        click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]"));
    }
    public void chooseTimes(){
        click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]"));
    }
    public void clickEqualsBtn(){
        click(MobileBy.id("acb_calculate"));
    }

    public String getHasil(){
        return getText(MobileBy.id("tv_result"));
    }

}
