package Steps;

import Pages.MenuPage;
import org.openqa.selenium.WebDriver;

public class MenuSteps {

    WebDriver driver;
    MenuPage page;


    public MenuSteps(WebDriver driver) {
        this.driver = driver;
        page = new MenuPage(driver);
    }

    public void selectIFrame() {
        page.getDemoSites().click();
        page.getiFrame().click();
    }

    public void selectForm() {
        page.getDemoSites().click();
        page.getForm().click();
    }

    public void selectTable() {
        page.getDemoSites().click();
        page.getTable().click();
    }


}
