package Tests;

import Pages.MenuPage;
import Steps.FormSteps;
import Steps.MenuSteps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormTest extends BaseTest {

    FormSteps formSteps;

    @BeforeMethod
    public void setUpTest() {
        formSteps = new FormSteps(driver,0);

    }

    @Test
    public void testForm() {

        new MenuSteps(driver).selectForm();

        formSteps.setParameters()
                 .submit();
    }
}
