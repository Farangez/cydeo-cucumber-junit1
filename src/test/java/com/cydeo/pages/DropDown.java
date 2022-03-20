package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DropDown {

    public DropDown(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "dropdown")
public WebElement optionDropdown;

    @FindBy(xpath = "//select[@id='dropdown']//option[@value='1']")
    public WebElement dropdownOption1;

    @FindBy(xpath = "//select[@id='dropdown']//option[@value='2']")
    public WebElement dropdownOption2;

    @FindBy(id="year")
    public WebElement yearDropdown;

    @FindBy(id="month")
    public WebElement monthDropdown;

    @FindAll(@FindBy(id="month"))
    public List<WebElement> monthOptions;

    @FindBy(id="day")
    public WebElement dayDropdown;

    @FindBy (xpath = "//select[@name='Languages']")
    public WebElement languageDropdown;

    @FindBy (id ="dropdownMenuLink")
    public WebElement dropdownLink;

}
