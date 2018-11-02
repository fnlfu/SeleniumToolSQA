package Utilities;

import Pages.IFramePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PickIFrame {
    private WebDriver driver;

    public PickIFrame(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver selectFirstIFrame() {
        driver.switchTo().defaultContent();
        WebElement frame = new IFramePage(driver).getFirIFrame();
        driver.switchTo().frame(frame);
        return driver;
    }

    public WebDriver selectSecIFrame() {
        driver.switchTo().defaultContent();
        return driver.switchTo().frame(new IFramePage(driver).getSecIFrame());
    }
}
