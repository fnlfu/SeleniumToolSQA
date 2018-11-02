package Steps;

import Utilities.TableList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TableSteps {
    private WebDriver driver;

    private Random r = new Random();
    private List<TableList> tableLists;

    public TableSteps(WebDriver driver) {
        this.driver = driver;
        this.tableLists = new ArrayList<TableList>();
    }

    public TableSteps(WebDriver driver, List<TableList> tableLists) {
        this.driver = driver;
        this.tableLists = tableLists;
    }

    public TableSteps setTableLists() {
        List<WebElement> trList = driver.findElements(By.cssSelector("[summary='Sample Table'] tbody tr"));
        for (WebElement tr : trList) {
            tableLists.add(new TableList(tr));
        }
        return new TableSteps(driver, tableLists);
    }

    public List<TableList> getTableLists() {
        return tableLists;
    }

    public TableSteps getRandom() {
        int rand = r.nextInt(400) + 400;
        System.out.println(rand);
        for (TableList el : tableLists) {
            if (el.getHeight() >= rand)
                el.printTable();
        }
        return new TableSteps(driver, tableLists);

    }
}
