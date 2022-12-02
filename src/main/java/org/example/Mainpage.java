package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Mainpage extends Basepage {

    public Mainpage(WebDriver driver){super(driver);
    }
    public void searchQuery(String query){
        findAndType(By.id("searchInput"),query);
    }
    public void selectFirstSearchResult(){findAndClick(By.className("suggestions-result"));}
}
