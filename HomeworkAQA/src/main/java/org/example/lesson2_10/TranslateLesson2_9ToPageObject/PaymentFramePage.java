package org.example.lesson2_10.TranslateLesson2_9ToPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class PaymentFramePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public PaymentFramePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void switchToFrame() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[src*='bepaid']")));
    }

    public String getConfirmationText() {
        WebElement confirm = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[contains(text(),'Услуги связи')]")));
        return confirm.getText();
    }
}