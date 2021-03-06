package com.cydeo.OscarReview.week6.pomForReview;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WaitTasksPage {

    public WaitTasksPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "alert")
    public WebElement alertActivate;

    @FindBy(id = "enable-button")
    public WebElement enable;

    @FindBy(id = "disable")
    public WebElement disable;


}
