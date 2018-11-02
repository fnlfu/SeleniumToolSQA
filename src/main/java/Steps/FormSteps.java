package Steps;

import Pages.FormPage;
import Utilities.UserData;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class FormSteps {
    private WebDriver driver;
    private int user;
    private List<UserData> users = new ArrayList<UserData>();
    private FormPage page;


    public FormSteps(WebDriver driver, int user) {
        this.driver = driver;
        this.user = user;
        this.page = new FormPage(driver);
        this.users.add(new UserData("Adam", "Adamowski", 1, 1, "10.10.2018", 1, 1, 1, 1));
        this.users.add(new UserData("Ewa", "Ewanowska", 0, 2, "10.10.2018", 0, 0, 0, 0));
    }

    public FormSteps setParameters() {
        page.setFirstName(users.get(user).getFirstName());
        page.setLastName(users.get(user).getLastName());
        page.setSex(users.get(user).getSex());
        page.setExp(users.get(user).getExp());
        page.setDatepicker(users.get(user).getDatepicker());
        page.setProfession(users.get(user).getProfession());
        page.setPhoto();
        page.setTool(users.get(user).getTool());
        page.setContinents(users.get(user).getContinents());
        page.setSelenium_commands(users.get(user).getSelenium_commands());
        return new FormSteps(driver, user);
    }

    public void submit() {
        page.setSubmit();
    }

}
