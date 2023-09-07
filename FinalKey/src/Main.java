public class Main {
    public static void main(String[] args)
    {
        FinalTest f1 = new FinalTest("Object1");
        FinalTest f2 = new FinalTest("Object2");

        System.out.println("Object number:"+f1.numberOfObject);
        System.out.println("Object number:"+f2.numberOfObject);

        System.out.println("database name:"+ Database.databaseName);
        System.out.println("username:"+ Database.userName);
        System.out.println("password:"+Database.password);

    }
}