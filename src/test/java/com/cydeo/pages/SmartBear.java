package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBear {
    public SmartBear() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //user name
    @FindBy(xpath = "//input[@id='ctl00_MainContent_username']")
    public WebElement username;

    //password
    @FindBy(xpath = "//input[@id='ctl00_MainContent_password']")
    public WebElement password;

    //login button
    @FindBy(xpath = "//input[@id='ctl00_MainContent_login_button']")
    public WebElement login_button;

    //order button
    @FindBy(xpath = "//a[.='Order']")
    public WebElement order_button;

    // select Album Family
    @FindBy(xpath= "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
    public WebElement familyAlbum;

    // quantity
    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
    public WebElement quantity;

    // costumer name
    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtName']")
    public WebElement costumer_name;


    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox2']")
    public WebElement street;

    // city
    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")
    public WebElement city;

    //state
    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox4']")
    public WebElement state;

    //zip code
    @FindBy( xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox5']")
    public WebElement zipcode;

    // visa
    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_cardList_0']")
    public WebElement visa;

    //cardnumber
    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")
    public WebElement cardnumber;

    //expiration day
    @FindBy( xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox1']")
    public WebElement expiration;

    //process button
    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement process_button;


    //all order button
    @FindBy(xpath = "//a[@href='Default.aspx']")
    public WebElement allOrderBtn;

    @FindBy(xpath = "//tr[2]/td[2]")
    public WebElement nameVerify;

    @FindBy(linkText = "View all orders")
    public WebElement viewAllOrderButton;

    public boolean isInList(String name){
        boolean isIn=false;
        if(nameVerify.getText().contains(name)){
            isIn=true;
        }
        return isIn;



}}
