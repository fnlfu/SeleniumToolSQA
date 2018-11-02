package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IFramePage {
    private WebDriver driver;
    @FindBy(name = "iframe1")
    private WebElement firIFrame;
    @FindBy(name = "iframe2")
    private WebElement secIFrame;
    @FindBy(name = "submit")
    private WebElement submitBtn;
    @FindBy(css = "[href*='p=1'][class*='btn-primary']")
    private WebElement ReadMoreBtn;

    public IFramePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getFirIFrame() {
        return firIFrame;
    }

    public WebElement getSecIFrame() {
        return secIFrame;
    }

    public WebElement getSubmitBtn() {
        return submitBtn;
    }

    public WebElement getReadMoreBtn() {
        return ReadMoreBtn;
    }
}
