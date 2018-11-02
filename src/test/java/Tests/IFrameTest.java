package Tests;

import Steps.IFrameSteps;
import Steps.MenuSteps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrameTest extends BaseTest {
    IFrameSteps iFrameSteps;

    @BeforeMethod
    public void setUpTest() {
        iFrameSteps = new IFrameSteps(driver);
    }

    @Test
    public void testIFrame() {
        new MenuSteps(driver).selectIFrame();
        iFrameSteps.selectSubmitInFirstFrame().selectSubmitInFirstFrame();

    }
}
