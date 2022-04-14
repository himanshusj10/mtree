package com.Framework.Concentrix.OR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomeOR {
WebDriver driver;
@FindBy(how=How.XPATH,using="//*[@class='_2IX_2- _3mctLh VJZDxU']/preceding::input[1]") WebElement email;
@FindBy(xpath = "//*[@class='_2IX_2- _3mctLh VJZDxU']")WebElement password;
@FindBy(xpath="//*[@type='password']/following::button[1]") WebElement login;
@FindBy(xpath="//*[@class='_2KpZ6l _2doB4z']")WebElement cross;
public HomeOR(WebDriver d){
	driver = d;
	PageFactory.initElements(d, this);
}


public void clickLogin() {
	login.click();
}

public void setUsername(String val) {
	email.sendKeys(val);
}

public void setPassword(String val) {
	password.sendKeys(val);
}
public void clickCross( ) {
	cross.click();
}
}
