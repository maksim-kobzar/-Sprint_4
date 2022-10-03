package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class DropDownListFAQ {
    private WebDriver driver;
    //Раскрытие пунктов меню
    private By accordionButton1 = By.id("accordion__heading-0");
    private By accordionButton2 = By.id("accordion__heading-1");
    private By accordionButton3 = By.id("accordion__heading-2");
    private By accordionButton4 = By.id("accordion__heading-3");
    private By accordionButton5 = By.id("accordion__heading-4");
    private By accordionButton6 = By.id("accordion__heading-5");
    private By accordionButton7 = By.id("accordion__heading-6");
    private By accordionButton8 = By.id("accordion__heading-7");

    public DropDownListFAQ(WebDriver driver) {
        this.driver = driver;
    }


    public void clickAccordionButton1() {
        driver.findElement(accordionButton1).click();
    }

    public void clickAccordionButton2() {
        driver.findElement(accordionButton2).click();}

    public void clickAccordionButton3() {
        driver.findElement(accordionButton3).click();}

    public void clickAccordionButton4() {
        driver.findElement(accordionButton4).click();}

    public void clickAccordionButton5() {
        driver.findElement(accordionButton5).click();}

    public void clickAccordionButton6() {
        driver.findElement(accordionButton6).click();}

    public void clickAccordionButton7() {
        driver.findElement(accordionButton7).click();}

    public void clickAccordionButton8() {
        driver.findElement(accordionButton8).click();}

    String text1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    String text2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    String text3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    String text4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    String text5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    String text6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    String text7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    String text8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    // Сравнение текста
    private By textAccordion1 = By.xpath("//div[@aria-labelledby=\"accordion__heading-0\"]/p");
    private By textAccordion2 = By.xpath("//div[@aria-labelledby=\"accordion__heading-1\"]/p");
    private By textAccordion3 = By.xpath("//div[@aria-labelledby=\"accordion__heading-2\"]/p");
    private By textAccordion4 = By.xpath("//div[@aria-labelledby=\"accordion__heading-3\"]/p");
    private By textAccordion5 = By.xpath("//div[@aria-labelledby=\"accordion__heading-4\"]/p");
    private By textAccordion6 = By.xpath("//div[@aria-labelledby=\"accordion__heading-5\"]/p");
    private By textAccordion7 = By.xpath("//div[@aria-labelledby=\"accordion__heading-6\"]/p");
    private By textAccordion8 = By.xpath("//div[@aria-labelledby=\"accordion__heading-7\"]/p");

    public void textComparison1() {
        String actual = driver.findElement(textAccordion1).getText();
        assertEquals("Ошибка - не правильный текст", text1, actual);}

    public void textComparison2() {
        String actual = driver.findElement(textAccordion2).getText();
        assertEquals("Ошибка - не правильный текст", text2, actual);}

    public void textComparison3() {
        String actual = driver.findElement(textAccordion3).getText();
        assertEquals("Ошибка - не правильный текст", text3, actual);}

    public void textComparison4() {
        String actual = driver.findElement(textAccordion4).getText();
        assertEquals("Ошибка - не правильный текст", text4, actual);}

    public void textComparison5() {
        String actual = driver.findElement(textAccordion5).getText();
        assertEquals("Ошибка - не правильный текст", text5, actual);}

    public void textComparison6() {
        String actual = driver.findElement(textAccordion6).getText();
        assertEquals("Ошибка - не правильный текст", text6, actual);}

    public void textComparison7() {
        String actual = driver.findElement(textAccordion7).getText();
        assertEquals("Ошибка - не правильный текст", text7, actual);}

    public void textComparison8() {
        String actual = driver.findElement(textAccordion8).getText();
        assertEquals("Ошибка - не правильный текст", text8, actual);}
}