package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
    private WebDriver driver;
    private WebElement Home;
    @FindBy(css = ".menu-item-17611")
    private WebElement DemoSites;
    @FindBy(css = "[href*='automation-practice-table']")
    private WebElement table;
    @FindBy(css = "[href*='automation-practice-form']")
    private WebElement form;
    @FindBy(css = "[href*='iframe-practice-page']")
    private WebElement iFrame;



    public MenuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getHome() {
        return Home;
    }

    public WebElement getDemoSites() {
        return DemoSites;
    }

    public WebElement getTable() {
        return table;
    }

    public WebElement getForm() {
        return form;
    }

    public WebElement getiFrame() {
        return iFrame;
    }
}
