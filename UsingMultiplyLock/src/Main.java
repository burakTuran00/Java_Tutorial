public class Main
{
    public static void main(String[] args)
    {
        ListWorker worker = new ListWorker();
        worker.StartAll();

      /*  long start = System.currentTimeMillis();

        worker.adjustValue();

        long end = System.currentTimeMillis();

        System.out.println("Time:"+(end-start));*/
    }
}