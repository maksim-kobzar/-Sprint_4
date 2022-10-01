package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class DropDownListFAQ {
    private WebDriver driver;
    //Раскрытие пунктов меню
    private By accordionButton_1 = By.id("accordion__heading-0");
    private By accordionButton_2 = By.id("accordion__heading-1");
    private By accordionButton_3 = By.id("accordion__heading-2");
    private By accordionButton_4 = By.id("accordion__heading-3");
    private By accordionButton_5 = By.id("accordion__heading-4");
    private By accordionButton_6 = By.id("accordion__heading-5");
    private By accordionButton_7 = By.id("accordion__heading-6");
    private By accordionButton_8 = By.id("accordion__heading-7");

    public DropDownListFAQ(WebDriver driver) {
        this.driver = driver;
    }


    public void clickAccordionButton_1 (){
        driver.findElement(accordionButton_1).click();
    }

    public void clickAccordionButton_2 (){
        driver.findElement(accordionButton_2).click();
    }

    public void clickAccordionButton_3 (){
        driver.findElement(accordionButton_3).click();
    }

    public void clickAccordionButton_4 (){
        driver.findElement(accordionButton_4).click();
    }

    public void clickAccordionButton_5 (){
        driver.findElement(accordionButton_5).click();
    }

    public void clickAccordionButton_6 (){
        driver.findElement(accordionButton_6).click();
    }

    public void clickAccordionButton_7 (){
        driver.findElement(accordionButton_7).click();
    }

    public void clickAccordionButton_8 (){
        driver.findElement(accordionButton_8).click();
    }

    String text1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    String text2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    String text3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    String text4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    String text5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    String text6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    String text7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    String text8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    // Сравнение текста
    private By textAccordion_1 = By.xpath("//div[@aria-labelledby=\"accordion__heading-0\"]/p");
    private By textAccordion_2 = By.xpath("//div[@aria-labelledby=\"accordion__heading-1\"]/p");
    private By textAccordion_3 = By.xpath("//div[@aria-labelledby=\"accordion__heading-2\"]/p");
    private By textAccordion_4 = By.xpath("//div[@aria-labelledby=\"accordion__heading-3\"]/p");
    private By textAccordion_5 = By.xpath("//div[@aria-labelledby=\"accordion__heading-4\"]/p");
    private By textAccordion_6 = By.xpath("//div[@aria-labelledby=\"accordion__heading-5\"]/p");
    private By textAccordion_7 = By.xpath("//div[@aria-labelledby=\"accordion__heading-6\"]/p");
    private By textAccordion_8 = By.xpath("//div[@aria-labelledby=\"accordion__heading-7\"]/p");

    public void textComparison_1 (){
        String actual = driver.findElement(textAccordion_1).getText();
        assertEquals("Ошибка - не правильный текст", text1, actual);
    }

    public void textComparison_2 (){
        String actual = driver.findElement(textAccordion_2).getText();
        assertEquals("Ошибка - не правильный текст", text2, actual);
    }

    public void textComparison_3 (){
        String actual = driver.findElement(textAccordion_3).getText();
        assertEquals("Ошибка - не правильный текст", text3, actual);
    }

    public void textComparison_4 (){
        String actual = driver.findElement(textAccordion_4).getText();
        assertEquals("Ошибка - не правильный текст", text4, actual);
    }

    public void textComparison_5 (){
        String actual = driver.findElement(textAccordion_5).getText();
        assertEquals("Ошибка - не правильный текст", text5, actual);
    }

    public void textComparison_6 (){
        String actual = driver.findElement(textAccordion_6).getText();
        assertEquals("Ошибка - не правильный текст", text6, actual);
    }

    public void textComparison_7 (){
        String actual = driver.findElement(textAccordion_7).getText();
        assertEquals("Ошибка - не правильный текст", text7, actual);
    }

    public void textComparison_8 (){
        String actual = driver.findElement(textAccordion_8).getText();
        assertEquals("Ошибка - не правильный текст", text8, actual);
    }
}