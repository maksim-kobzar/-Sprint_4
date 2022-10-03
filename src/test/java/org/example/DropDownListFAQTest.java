package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.DropDownListFAQ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DropDownListFAQTest {
    private WebDriver driver;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
    }

    @Test
    public void accordion_1() {
        DropDownListFAQ objDropDownListFAQ = new DropDownListFAQ(driver);
        objDropDownListFAQ.clickAccordionButton1();
        objDropDownListFAQ.textComparison1();
    }

    @Test
    public void accordion_2() {
        DropDownListFAQ objDropDownListFAQ = new DropDownListFAQ(driver);
        objDropDownListFAQ.clickAccordionButton2();
        objDropDownListFAQ.textComparison2();
    }

    @Test
    public void accordion_3() {
        DropDownListFAQ objDropDownListFAQ = new DropDownListFAQ(driver);
        objDropDownListFAQ.clickAccordionButton3();
        objDropDownListFAQ.textComparison3();
    }

    @Test
    public void accordion_4() {
        DropDownListFAQ objDropDownListFAQ = new DropDownListFAQ(driver);
        objDropDownListFAQ.clickAccordionButton4();
        objDropDownListFAQ.textComparison4();
    }

    @Test
    public void accordion_5() {
        DropDownListFAQ objDropDownListFAQ = new DropDownListFAQ(driver);
        objDropDownListFAQ.clickAccordionButton5();
        objDropDownListFAQ.textComparison5();
    }

    @Test
    public void accordion_6() {
        DropDownListFAQ objDropDownListFAQ = new DropDownListFAQ(driver);
        objDropDownListFAQ.clickAccordionButton6();
        objDropDownListFAQ.textComparison6();
    }

    @Test
    public void accordion_7() {
        DropDownListFAQ objDropDownListFAQ = new DropDownListFAQ(driver);
        objDropDownListFAQ.clickAccordionButton7();
        objDropDownListFAQ.textComparison7();
    }

    @Test
    public void accordion_8() {
        DropDownListFAQ objDropDownListFAQ = new DropDownListFAQ(driver);
        objDropDownListFAQ.clickAccordionButton8();
        objDropDownListFAQ.textComparison8();
    }

    @After
    public void cleanUp() {
        driver.quit();
    }
}
