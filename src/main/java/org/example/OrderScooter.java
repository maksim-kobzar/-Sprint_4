package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class OrderScooter {
    private WebDriver driver;

    private By buttonOne = By.xpath("//div[@class=\"Header_Nav__AGCXC\"]/button[text()=\"Заказать\"]");
    private By buttonTwo = By.xpath("//div[@class=\"Home_FinishButton__1_cWm\"]/button[text()=\"Заказать\"]");

    //Локаторы полей страницы Для кого самокат
    private By name = By.xpath("//input[@placeholder=\"* Имя\"]"); //поле ввода имени
    private By surname = By.xpath("//input[@placeholder=\"* Фамилия\"]"); //поле ввода фамилии
    private By address = By.xpath("//input[@placeholder=\"* Адрес: куда привезти заказ\"]"); //поле ввода адреса
    public By metro = By.className("select-search__input"); //поле ввода станции метро
    private By telephone = By.xpath("//input[@placeholder=\"* Телефон: на него позвонит курьер\"]"); //поле ввода фамилии

    private By buttonOrderModal = By.xpath("//div[@class=\"Order_Modal__YZ-d3\"]//button[text()=\"Посмотреть статус\"]"); //заголовок окна оформленного заказа


    public void clickButtonOne() {
        driver.findElement(buttonOne).click();
    }

    public void clickButtonTwo() {
        driver.findElement(buttonTwo).click();
    }

    public OrderScooter(WebDriver driver) {
        this.driver = driver;
    }

    //метод заполнения поля Имени
    public void setName(String userName) {
        driver.findElement(name).sendKeys(userName);
    }

    //метод заполнения поля Фамилии
    public void setSurname(String userSurname) {
        driver.findElement(surname).sendKeys(userSurname);
    }

    //метод заполнения поля Адреса
    public void setAddress(String userAddress) {
        driver.findElement(address).sendKeys(userAddress);
    }

    //метод заполнения поля Метро
    public void setMetro(String userMetro) {
        driver.findElement(metro).sendKeys(userMetro);
    }

    //метод заполнения поля Телефон
    public void setTelephone(String userTelephone) {
        driver.findElement(telephone).sendKeys(userTelephone);
    }

    //Локаторы полей страницы Про аренду
    public By deliveryDate = By.xpath("//input[@placeholder=\"* Когда привезти самокат\"]"); //поле ввода Когда привезти самокат
    public By rentalPeriod = By.className("Dropdown-control"); //поле выбора периода
    private By selectionColor = By.className("Checkbox_Label__3wxSf"); //выбор цвета - церный жемчуг
    private By comment = By.xpath("//input[@placeholder=\"Комментарий для курьера\"]"); //поле выбора периода
    public By buttonOrder = By.xpath("//div[@class=\"Order_Buttons__1xGrp\"]/button[text()=\"Заказать\"]"); //кнопка заказать

    public By buttonOrderTwo = By.xpath("//div[@class=\"Order_Buttons__1xGrp\"]/button[text()=\"Да\"]"); //кнопка да

    public void setDeliveryDate(String delDate) {
        driver.findElement(deliveryDate).sendKeys(delDate);
    }

    public void setRentalPeriod(String rentPeriod) {
        driver.findElement(rentalPeriod).sendKeys(rentPeriod);
    }

    public void setSelectionColor() {
        driver.findElement(selectionColor).click();
    }

    public void setComment(String comments) {
        driver.findElement(comment).sendKeys(comments);
    }

    public void checBatenOrderModal() {
        String actual = driver.findElement(buttonOrderModal).getText();
        assertEquals("Ошибка в создании заказа", "Посмотреть статус", actual);

    }


}








