package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WikiInfopage {
    WebDriver driver;
    WebDriverWait wait;
    public WikiInfopage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
    }

    public String getPageTitle() {
        return driver.findElement(By.className("mw-page-title-main")).getText();
    }

}