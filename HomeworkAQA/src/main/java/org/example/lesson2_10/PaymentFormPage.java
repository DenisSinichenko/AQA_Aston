package org.example.lesson2_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class PaymentFormPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public PaymentFormPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void selectOption(String optionText) {
        WebElement selector = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(@class,'select__header')]")));
        selector.click();

        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[.//span[normalize-space()='" + optionText + "']]")));
        option.click();
    }

    public String getPlaceholderById(String fieldId) {
        WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(fieldId)));
        return field.getAttribute("placeholder");
    }
}