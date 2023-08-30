public class Main
{
    public static void main(String[] args)
    {
      //  IEngineer engineer1 = new IEngineer(); // don't allow to create that. just using for other implement class.

        ComputerEngineer computerEngineer = new ComputerEngineer(false ,false);
        computerEngineer.didYouDoSolider();
        computerEngineer.areYouClean();
        System.out.println(computerEngineer.averageNote(3.24));
        String[] experiences = {"Vestel","Microsoft","Dell"};
        computerEngineer.experience(experiences);

        MechanicalEngineer mechanicalEngineer = new MechanicalEngineer(false,true);
        String[] experiences2 = {};
        String[] referance = {"Sam Witciky","Alfred Nolan"};
        mechanicalEngineer.areYouClean();
        mechanicalEngineer.didYouDoSolider();
        System.out.println(mechanicalEngineer.averageNote(2.75));
        mechanicalEngineer.experience(experiences2);
        mechanicalEngineer.getReferance(referance);
        mechanicalEngineer.Work(); // from another interface
    }
}