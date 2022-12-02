package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

abstract class Basepage {
    WebDriver driver;
        WebDriverWait wait;
        public Basepage(WebDriver driver) {
            this.driver = driver;
            wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        }

        public void findAndClick(By selector) {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
            element.click();
        }

        public void findAndType(By selector,String input){
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
            element.sendKeys(input);
        }

    }
