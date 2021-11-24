package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Point;

import java.time.Duration;

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
}
