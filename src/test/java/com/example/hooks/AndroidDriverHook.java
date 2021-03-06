package com.example.hooks;

import com.example.app.drivers.AndroidDriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.thucydides.core.model.TakeScreenshots;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AndroidDriverHook {

  @Before(value = "@android")
  public void beforeScenario() {
    AndroidDriverInit.initialize();
  }

  @After(value = "@android")
  public void afterScenario(Scenario scenario) {
//    TakesScreenshot screenshot = AndroidDriverInit.driver;
//    byte[] imageByte = screenshot.getScreenshotAs(OutputType.BYTES);
//    scenario.attach(imageByte,"image/png",scenario.getId());
    //error
    AndroidDriverInit.quit();
  }

}
