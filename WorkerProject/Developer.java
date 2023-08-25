import javax.lang.model.element.NestingKind;

public class Developer extends  Worker
{
    private String languages;
    public Developer(String name, String surname, int id, String languages)
    {
        super(name,surname,id);
        this.languages = languages;
    }

    public void ToFormat(String operatingSystem)
    {
        System.out.println(getName() + "'s setting up the "+operatingSystem);
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("The developer know language of "+languages);
    }
    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
}
