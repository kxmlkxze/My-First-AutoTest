package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ProfilePage {

    public WebDriver driver;

    public ProfilePage(WebDriver driver){                                                           //Конструктор
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/header/div/div[2]/div[3]/deferred-side-panel/include-fragment/react-partial-anchor/button/span/span")
    private WebElement accountButton2;

    @FindBy(xpath = "//*[@id=\":rv:\"]")
    private WebElement signOut;

    @FindBy(xpath = "/html/body/div[1]/div[4]/main/div/div[3]/div/div[2]/form/input[3]")
    private WebElement signOutButton;


    public void setAccountButton2(){                                       //Метод для входа в настройки аккаунта
        accountButton2.click();
    }
    public void setSignOut(){                                               //Метод для нажати кнопки для выхода
        signOut.click();
    }
    public void setSignOutButton(){                                          //Метод для нажати кнопки для выхода
        signOutButton.click();
    }
}
