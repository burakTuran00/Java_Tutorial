import java.util.*;

class BiggertoSmallerString implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2)
    {
       return -o1.compareTo(o2);
    }
}

class Player implements Comparable<Player>
{
    private String name;
    private int id;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID:"+this.id +" - "+ "Name:"+ this.name;
    }

    @Override
    public int compareTo(Player player)
    {
        if(this.id < player.id)
        {
            return -1;
        }
        else if(this.id > player.id)
        {
            return 1;
        }
        else {
            return 0;
        }
    }
}

class Smaller2BiggerPlayer implements Comparator<Player>
{
    @Override
    public int compare(Player o1, Player o2) {
        if(o1.getId() < o2.getId())
        {
            return -1;
        }
        else if(o1.getId() > o2.getId())
        {
            return 1;
        }
        else {
            return 0;
        }
    }
}

class Bigger2SmallerPlayer implements Comparator<Player>
{
    @Override
    public int compare(Player o1, Player o2) {
        if(o1.getId() < o2.getId())
        {
            return 1;
        }
        else if(o1.getId() > o2.getId())
        {
            return -1;
        }
        else {
            return 0;
        }
    }
}

class Smaller2BiggerStringPlayer implements Comparator<Player>
{
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class Main
{

    public static void main(String[] args)
    {
        List<String>  listString = new ArrayList<String>();

        listString.add("java");
        listString.add("c++");
        listString.add("python");
        listString.add("php");
        listString.add("go");

        Collections.sort(listString, new BiggertoSmallerString());

        for(String s : listString)
        {
            System.out.println(s);
        }

        List<Player> listPlayer = new ArrayList<Player>();

        listPlayer.add(new Player("Murat",5));
        listPlayer.add(new Player("Kerem",1));
        listPlayer.add(new Player("Jacob",11));
        listPlayer.add(new Player("Luna",231));

        Player p1 = new Player("Murat" ,1);
        Player p2 = new Player("Yusuf",24);

        Collections.sort(listPlayer,new Smaller2BiggerPlayer());

        Collections.sort(listPlayer,new Bigger2SmallerPlayer());

        Collections.sort(listPlayer,new Smaller2BiggerStringPlayer());

        for(Player p : listPlayer)
        {
            System.out.println(p.toString());
        }

    }
}