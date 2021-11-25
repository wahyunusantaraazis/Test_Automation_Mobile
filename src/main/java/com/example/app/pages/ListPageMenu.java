package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Point;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class ListPageMenu extends BasePageObject {
    public void swipelist() {
        TouchAction action = new TouchAction(getDriver());
        AndroidElement containerList = find(MobileBy.id("recycler_view"));
        Point coordinate = containerList.getCenter();
        PointOption start = PointOption.point(coordinate);
        PointOption end = PointOption.point(coordinate.getX(), coordinate.getY() + -1000);
        //builder
        action
                .press(start)
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(end)
                .release()
                .perform();
    }
    public void longpress(){
        TouchAction action = new TouchAction(getDriver());
        AndroidElement containerList = find(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView"));
        action.longPress(PointOption.point(containerList.getCenter()))
                .waitAction(WaitOptions.waitOptions(
                        Duration.of(5, ChronoUnit.SECONDS))).release()
                .perform();

    }
    public void TapMultipleTimes(){
        TouchAction action = new TouchAction(getDriver());
        AndroidElement tapmultiple = find(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView"));
        action.tap(TapOptions.tapOptions().withTapsCount(10)
                        .withElement(ElementOption.element(tapmultiple)))
                .perform();

    }






}
