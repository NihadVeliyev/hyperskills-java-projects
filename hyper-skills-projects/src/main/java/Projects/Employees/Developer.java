package Projects.Employees;

public class Developer extends Employee {
    String mainLanguage;
    String[] skills;

    public Developer(String name, String email, String experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }
}