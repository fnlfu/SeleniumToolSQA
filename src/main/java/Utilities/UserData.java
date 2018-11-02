package Utilities;

public class UserData {
    private String firstName;
    private String lastName;
    private int sex;
    private int exp;
    private String datepicker;
    private int profession;
    private int tool;
    private int continents;
    private int selenium_commands;

    public UserData(String firstName, String lastName, int sex, int exp, String datepicker, int profession, int tool, int continents, int selenium_commands) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.exp = exp;
        this.datepicker = datepicker;
        this.profession = profession;
        this.tool = tool;
        this.continents = continents;
        this.selenium_commands = selenium_commands;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSex() {
        return sex;
    }

    public int getExp() {
        return exp;
    }

    public String getDatepicker() {
        return datepicker;
    }

    public int getProfession() {
        return profession;
    }

    public int getTool() {
        return tool;
    }

    public int getContinents() {
        return continents;
    }

    public int getSelenium_commands() {
        return selenium_commands;
    }

}
