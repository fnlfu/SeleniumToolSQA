package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;

public class FormPage {
    private WebDriver driver;
    @FindBy(name = "firstname")
    private WebElement firstName;
    @FindBy(name = "lastname")
    private WebElement lastName;
    @FindBy(name = "sex")
    private List<WebElement> sex;
    @FindBy(name = "exp")
    private List<WebElement> exp;
    @FindBy(id = "datepicker")
    private WebElement datepicker;
    @FindBy(name = "profession")
    private List<WebElement> profession;
    @FindBy(name = "tool")
    private List<WebElement> tool;
    @FindBy(name = "photo")
    private WebElement photo;
    @FindBy(name = "continents")
    private WebElement continents;
    @FindBy(name = "selenium_commands")
    private WebElement selenium_commands;
    @FindBy(name = "submit")
    private WebElement submit;

    public FormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setFirstName(String FirstName) {
        this.firstName.sendKeys(FirstName);
    }

    public void setLastName(String LastName) {
        this.lastName.sendKeys(LastName);
    }

    public void setSex(int Sex) {
        this.sex.get(Sex).click();
    }

    public void setExp(int Exp) {
        this.exp.get(Exp).click();
    }

    public void setDatepicker(String Datepicker) {
        this.datepicker.sendKeys(Datepicker);
    }

    public void setProfession(int Profession) {
        this.profession.get(Profession).click();
    }

    public void setTool(int Tool) {
        this.tool.get(Tool).click();
    }

    public void setContinents(int Continents) {
        Select sel = new Select(this.continents);
        sel.selectByIndex(Continents);
    }

    public void setSelenium_commands(int Selenium_commands) {
        Select sel = new Select(this.selenium_commands);
        sel.selectByIndex(Selenium_commands);
    }

    public void setPhoto() {
        File file = new File("src/test/img/img.png");
        this.photo.sendKeys(file.getAbsolutePath());
    }

    public void setSubmit() {
        this.submit.click();
    }


}
