package Steps;

import Pages.IFramePage;
import Utilities.PickIFrame;
import org.openqa.selenium.WebDriver;

public class IFrameSteps {
    private WebDriver driver;

    public IFrameSteps(WebDriver driver) {
        this.driver = driver;
    }

    private IFrameSteps selectFirstIFrame() {
        driver = new PickIFrame(driver).selectFirstIFrame();
        return new IFrameSteps(driver);
    }

    private IFrameSteps selectSecIFrame() {
        driver = new PickIFrame(driver).selectSecIFrame();
        return new IFrameSteps(driver);
    }

    public IFrameSteps selectSubmitInFirstFrame() {
        selectFirstIFrame();
        new IFramePage(driver).getSubmitBtn().click();
        return new IFrameSteps(driver);
    }

    public IFrameSteps selectReadMoreInSecFrame() {
        selectSecIFrame();
        new IFramePage(driver).getReadMoreBtn().click();
        return new IFrameSteps(driver);
    }
}
