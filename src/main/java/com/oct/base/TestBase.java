package com.oct.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {

public static WebDriver driver;

  public static void initialize(){

      ChromeOptions chromeOptions = new ChromeOptions();
      chromeOptions.addArguments("start-maximized");

      WebDriverManager.chromedriver().setup();

      driver = new ChromeDriver(chromeOptions);
      driver.get("https://google.com");



  }


}
