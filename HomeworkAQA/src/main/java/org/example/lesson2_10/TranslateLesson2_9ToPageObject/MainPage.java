package org.example.lesson2_10.TranslateLesson2_9ToPageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.mts.by/");
    }

    public void enterPhone(String phone) {
        driver.findElement(By.xpath("//input[@placeholder='Номер телефона']")).sendKeys(phone);
    }

    public void enterAmount(String amount) {
        driver.findElement(By.xpath("//input[@placeholder='Сумма']")).sendKeys(amount);
    }

    public void enterEmail(String email) {
        driver.findElement(By.xpath("//input[@placeholder='E-mail для отправки чека']")).sendKeys(email);
    }

    public void clickContinue() {
        driver.findElement(By.xpath("//button[normalize-space()='Продолжить']")).click();
    }

    public void clickMoreAboutService() {
        driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']")).click();
    }
}