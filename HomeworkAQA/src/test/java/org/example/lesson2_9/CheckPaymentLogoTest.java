package org.example.lesson2_9;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckPaymentLogoTest extends BaseTest{

    @Test
    public void testPaymentLogo() {
        driver.get("https://www.mts.by/");

        WebElement visa = driver.findElement(By.xpath("//img[@alt='Visa']"));
        WebElement masterCard = driver.findElement(By.xpath("//img[@alt='MasterCard']"));
        WebElement masterCardSecure = driver.findElement(By.xpath("//img[@alt='MasterCard Secure Code']"));
        WebElement belCart = driver.findElement(By.xpath("//img[@alt='Белкарт']"));
        WebElement verifiedByVisa = driver.findElement(By.xpath("//img[@alt='Verified By Visa']"));

        assertTrue(visa.isDisplayed(), "Логотип Visa отсутствует");
        assertTrue(masterCard.isDisplayed(), "Логотип MasterCard отсутствует");
        assertTrue(masterCardSecure.isDisplayed(), "Логотип MasterCard Secure Code отсутствует");
        assertTrue(belCart.isDisplayed(), "Логотип Белкарт отсутствует");
        assertTrue(verifiedByVisa.isDisplayed(), "Логотип Verified by Visa отсутствует");
    }
}