package org.example.lesson2_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentFramePageMoreChecks {

    private WebDriver driver;
    private WebDriverWait wait;

    public PaymentFramePageMoreChecks(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void switchToPaymentFrame() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                By.cssSelector("iframe[src*='bepaid']")));
    }

    public String getSumOnFrame() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='pay-description__cost']/span"))).getText();
    }

    public String getDisplayedPhoneNumber() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='pay-description__text']/span[contains(text(),'Номер:')]"))).getText();
    }

    public String getButtonText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[contains(text(),'Оплатить')]"))).getText();
    }

    public void checkCardFieldPlaceholders() {
        WebElement cardNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[text()='Номер карты']")));
        assertTrue(cardNumber.isDisplayed(), "Не найдено поле: Номер карты");

        WebElement expiry = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[text()='Срок действия']")));
        assertTrue(expiry.isDisplayed(), "Не найдено поле: Срок действия");

        WebElement cvc = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[text()='CVC']")));
        assertTrue(cvc.isDisplayed(), "Не найдено поле: CVC");

        WebElement cardHolder = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[text()='Имя и фамилия на карте']")));
        assertTrue(cardHolder.isDisplayed(), "Не найдено поле: Имя и фамилия на карте");
    }

    public void checkPaymentSystemIcons() {
        WebElement visa = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//img[contains(@src,'visa-system.svg')]")));
        WebElement mastercard = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//img[contains(@src,'mastercard-system.svg')]")));
        WebElement mir = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//img[contains(@src,'mir-system-ru.svg')]")));
        WebElement belkart = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//img[contains(@src,'belkart-system.svg')]")));
        WebElement maestro = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//img[contains(@src,'maestro-system.svg')]")));

        assertTrue(visa.isDisplayed(), "Иконка Visa не отображается");
        assertTrue(mastercard.isDisplayed(), "Иконка MasterCard не отображается");
        assertTrue(mir.isDisplayed(), "Иконка МИР не отображается");
        assertTrue(belkart.isDisplayed(), "Иконка Белкарт не отображается");
        assertTrue(maestro.isDisplayed(), "Иконка Maestro не отображается");
    }
}