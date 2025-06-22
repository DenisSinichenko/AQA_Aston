package org.example.lesson2_9;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FillTheFieldsTest extends BaseTest{

    @Test
    public void testSubmitCommunicationServiceForm() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.mts.by/");

        driver.findElement(By.xpath("//input[@placeholder='Номер телефона']")).sendKeys("297777777");
        driver.findElement(By.xpath("//input[@placeholder='Сумма']")).sendKeys("100");
        driver.findElement(By.xpath("//input[@placeholder='E-mail для отправки чека']")).sendKeys("dzyanis92@gmail.com");

        driver.findElement(By.xpath("//button[normalize-space()='Продолжить']")).click();

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[src*='bepaid']")));

        WebElement confirm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Услуги связи')]")));
        assertTrue(confirm.getText().contains("375297777777"), "Номер не подтвержден");
    }
}