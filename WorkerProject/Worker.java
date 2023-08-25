public class Worker {
    private String name;
    private String surname;
    private int id;

    public Worker(String name, String surname, int id)
    {
        this.setName(name);
        this.setSurname(surname);
        this.setId(id);
    }

    public void ShowInfo()
    {
        System.out.println("--------- Information Of Worker ---------");
        System.out.println("Name:"+getName());
        System.out.println("Surname:"+getSurname());
        System.out.println("ID:"+getId());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
