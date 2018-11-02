package Pages;

import Utilities.TableList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class TablePage {
    @FindBy(id = "content")
    private WebElement content;

    WebDriver driver;
    private List<WebElement> trlist;
    private List<TableList> tableLists = new ArrayList<TableList>();

    public TablePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        trlist = content.findElements(By.tagName("tr"));
    }

    public List<TableList> getListOfTr() {
        for (WebElement tr : trlist) {
            tableLists.add(new TableList(tr));
        }
        return tableLists;
    }
}
