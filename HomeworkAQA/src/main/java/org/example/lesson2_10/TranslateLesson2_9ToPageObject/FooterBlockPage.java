package org.example.lesson2_10.TranslateLesson2_9ToPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterBlockPage {
    private WebDriver driver;

    public FooterBlockPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLogoVisible(String altText) {
        return driver.findElement(By.xpath("//img[@alt='" + altText + "']")).isDisplayed();
    }
}