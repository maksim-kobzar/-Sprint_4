package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OrderScooterTest {
    private WebDriver driver;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // готовим нужный форматтер
    String date = LocalDate.now().plusDays(2).format(formatter); // получаем текущую дату, прибавляем к ней 2 дня и форматируем


    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
       //WebDriverManager.firefoxdriver().setup();
       //driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();

    }

    @Test //Заполнение формы Для кого
    public void setName() {
        OrderScooter objOrderScooter = new OrderScooter (driver);
        objOrderScooter.clickButtonOne();
        objOrderScooter.setName("Максим");
        objOrderScooter.setSurname("Кобзарь");
        objOrderScooter.setAddress("Москва, ул Ленина 25, кв 40");
        objOrderScooter.setMetro("Черкизовская");
        driver.findElement(By.xpath("//ul[@class='select-search__options']/li[1]")).click();
        objOrderScooter.setTelephone("+79999999999");
        driver.findElement(By.xpath("//button[text()=\"Далее\"]")).click();
        objOrderScooter.setDeliveryDate(date);
        driver.findElement(objOrderScooter.deliveryDate).sendKeys(Keys.ENTER);
        driver.findElement(objOrderScooter.rentalPeriod).click();
        driver.findElement(By.xpath("//div[@class=\"Dropdown-menu\"]/div[text()=\"пятеро суток\"]")).click();
        objOrderScooter.setSelectionColor();
        objOrderScooter.setComment("Привези мне как можно скорее");
        driver.findElement(objOrderScooter.buttonOrder).click();
        driver.findElement(objOrderScooter.buttonOrderTwo).click();
        objOrderScooter.checBatenOrderModal();
    }
    @Test
    public void orderData (){
        OrderScooter objOrderScooter = new OrderScooter (driver);
        objOrderScooter.clickButtonTwo();
        objOrderScooter.setName("Сидоров");
        objOrderScooter.setSurname("Сидр");
        objOrderScooter.setAddress("Новосибирск, ул Калужская 25, кв 40");
        objOrderScooter.setMetro("Черкизовская");
        driver.findElement(By.xpath("//ul[@class='select-search__options']/li[1]")).click();
        objOrderScooter.setTelephone("+78888888579");
        driver.findElement(By.xpath("//button[text()=\"Далее\"]")).click();
        objOrderScooter.setDeliveryDate(date);
        driver.findElement(objOrderScooter.deliveryDate).sendKeys(Keys.ENTER);
        driver.findElement(objOrderScooter.rentalPeriod).click();
        driver.findElement(By.xpath("//div[@class=\"Dropdown-menu\"]/div[text()=\"пятеро суток\"]")).click();
        objOrderScooter.setSelectionColor();
        objOrderScooter.setComment("Нужно привезти заказ как можно быстрее - быстрее пули!");
        driver.findElement(objOrderScooter.buttonOrder).click();
        driver.findElement(objOrderScooter.buttonOrderTwo).click();
        objOrderScooter.checBatenOrderModal();
    }

    @After
    public void cleanUp(){
        driver.quit();
    }
}