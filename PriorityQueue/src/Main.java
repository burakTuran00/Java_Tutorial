import java.rmi.Remote;
import java.util.PriorityQueue;
import java.util.Queue;

class Player implements Comparable<Player>
{
    private String name;
    private int id;
    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Player player) {
        if(this.id < player.id )
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

public class Main
{
    /*
    Queue Interface ve PriorityQueue Sınıfı

    PriorityQueue normal Queue mantığı gibi davranmaz. Elemanlar öncelik sıralarına göre yüksek öncelik kazanıp
    (
    In integer, smaller number most priority, bigger number less priority
    In string, alphabetic
    )

    kuyrukta önlere geçer (Tıpkı Hastanedeki Acil Servisler Gibi).

    add veya offer() metodları --------> Kuyruğa eleman ekler.(Önceden gördüğümüz özellikleri taşırlar.)
    clear() metodu --------> Kuyruğu Temizler.
    contains(Object o) ------> o objesi kuyruğun içindeyse true, değilse false döner.
    peek() ------> Kuyruğun başındaki elemanı döner.Eğer kuyruk boşsa null referans döner.
    poll() -----> Kuyruğun başındaki elemanı çıkartır ve değer olarak döner. Eğer kuyruk boşsa null referans döner.
    size()------> Kuyruğun içindeki eleman sayısını döner.
        */
    public static void main(String[] args)
    {
        Queue<Integer> priorityQueue = new PriorityQueue<Integer>();

        priorityQueue.offer(5);
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(100);

        System.out.println(priorityQueue.peek());
        priorityQueue.clear();

        System.out.println(priorityQueue.contains(10));

        while (!priorityQueue.isEmpty())
        {
            System.out.println("Removing "+priorityQueue.poll());
        }

        Queue<Player> queue = new PriorityQueue<Player>();

        queue.offer(new Player("Murat",1));
        queue.offer(new Player("Mehmet",24));
        queue.offer(new Player("Kemal",18));

        while (!queue.isEmpty())
        {
            System.out.println("Removing "+ queue.poll());
        }
    }
}