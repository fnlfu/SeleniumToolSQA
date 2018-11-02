package Tests;

import Steps.MenuSteps;
import Steps.TableSteps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TableTest extends BaseTest {


    TableSteps tableSteps;

    @BeforeMethod
    public void setUpTest() {
        tableSteps = new TableSteps(driver);
    }

    @Test
    public void testTable() {
        new MenuSteps(driver).selectTable();

        tableSteps.setTableLists()
                .getRandom();

    }
}
