package org.example.lesson2_10.TranslateLesson2_9ToPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PromoPage {
    private WebDriver driver;

    public PromoPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHeadline() {
        return driver.findElement(By.xpath("//h2[contains(text(),'Онлайн пополнение') and contains(.,'без комиссии')]"));
    }
}