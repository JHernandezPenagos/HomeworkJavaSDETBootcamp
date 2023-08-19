/*package com.jime.selenium.pf;

import com.ti.base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class MainPage {
    WebDriver driver = DriverFactory.getInstance().getDriver();

    @FindBy(className = "wpsp-schoolname")
    private WebElement spnSchoolTitle;

    @FindBy(linkText = "wpsp-schoolname")
    private WebElement btnCreateNew;
    //private By btnCreateNew = By.linkText("Create New");

    @FindBy(id = "d_teacher")
    private WebElement icnTrash;
    //private By icnTrash = By.id("d_teacher");

    @FindBy(xpath = "//*[text()='Ok']")
    private WebElement btoOk;
    //private By btoOk = By.xpath();

    protected MainPage() {
        PageFactory.initElements(driver, this);
    }
    //esto es super importante para que la anotacion @FindBy pueda funcionar

   *//* private String getSchoolName() { spnSchoolTitle.getText();
        return
                //driver.findElement(spnSchoolTitle).getText();
    }*//*

    public void verifySchoolName() {
        Assert.assertEquals(getSchoolName(), "Titanium School");
    }

    public void clickCreateNew() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(*//*driver.findElement(*//*btnCreateNew));
        *//*driver.findElement(*//*btnCreateNew.click();
    }

    *//*protected void deleteRow() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(icnTrash));
       *//**//* *//**//**//**//*List<WebElement> trashIcons = driver.findElements(*//**//**//**//*icnTrash;*//**//*
        WebElement delete = icnTrash.get(icnTrash.size() - 1);
        delete.click();
    }*//*

    protected void confirmWindow() {
        new WebDriverWait(driver, Duration.ofSeconds(8))
                .until(ExpectedConditions.elementToBeClickable(btoOk));
        *//*driver.findElement(*//*btoOk.click();

        new WebDriverWait(driver, Duration.ofSeconds(8))
                .until(ExpectedConditions.invisibilityOf(btoOk));
    }
}*/
