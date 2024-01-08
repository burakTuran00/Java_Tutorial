abstract class AHuman implements IHuman
{
    abstract void makeRose();


    @Override
    public void makeNoise()
    {
        System.out.println("Weird Noise");
    }
}
