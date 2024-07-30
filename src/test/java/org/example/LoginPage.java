package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver){                                                             //Конструктор
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/header/div/div[2]/div/div/div/a")
    private WebElement accountButton;

    @FindBy(xpath = "//*[@id=\"login_field\"]")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"login\"]/div[4]/form/div/input[13]")
    private WebElement signIn;


    public void setAccountButton(){                                              //Метод для нажатия кнопки входа
        accountButton.click();
    }
    public void setLogin(String login){                                                  //Метод для ввода логина
        loginField.sendKeys(login);
    }
    public void setPasswordField(String password){                                       //Метод для ввода пароля
        passwordField.sendKeys(password);
    }
    public void setSignIn(){                                                              //Метод для регистрации
        signIn.click();
    }

}
