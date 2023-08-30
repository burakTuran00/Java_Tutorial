public class ComputerEngineer implements IEngineer
{
    private boolean cleanPerson;
    private boolean solider;

    public ComputerEngineer(boolean cleanPerson, boolean solider) {
        this.cleanPerson = cleanPerson;
        this.solider = solider;
    }
    @Override
    public void didYouDoSolider()
    {
        if(solider)
        {
            System.out.println("I did my solider task.");
        }
        else {
            System.out.println("I didn't my solider task yet!");
        }
    }

    @Override
    public String averageNote(double value)
    {
        return "Avarage:" + value;
    }

    @Override
    public void areYouClean()
    {
        if(cleanPerson)
        {
            System.out.println("I'm not a clean person!");
        }
        else {
            System.out.println("I'm a clean person.");
        }
    }

    @Override
    public void experience(String[] array)
    {
        System.out.println("As a compute engineer, I did work for those companies.");

        for (int i=0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
