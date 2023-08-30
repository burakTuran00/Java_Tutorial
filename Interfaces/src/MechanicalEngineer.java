public class MechanicalEngineer implements IEngineer
{
    private boolean cleanPerson;

    private boolean solider;

    public MechanicalEngineer(boolean cleanPerson, boolean solider) {
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
        if(array.length == 0)
        {
            System.out.println("Doesn't have any experience!");
        }
        else {
            System.out.println("I've worked for these companies as a mechanical engineer.");

            for(String x : array)
            {
                System.out.println(x);
            }
        }
    }

    public void getReferance(String[] array)
    {
        if(array.length == 0)
        {
            System.out.println("Doesn't exist any referance!");
        }
        else
        {
            System.out.println("My referances.");
            for(String x : array)
            {
                System.out.println(x);
            }
        }
    }
}
