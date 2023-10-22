 import java.util.ArrayList;
 import java.util.LinkedList;
 import java.util.Queue;

public class Graph
{
    ArrayList<Node> nodes;
    int[][] matrix;
    public Graph(int size)
    {
        this.matrix = new int[size][size];  // adjusting to size of the array. space O(n'2)
        nodes = new ArrayList<Node>();
    }

    public void addNode(Node node)
    {
        nodes.add(node);
    }

    public void addEdge(int src, int dst)
    {
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst)
    {
        if(matrix[src][dst] == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void print()
    {
        System.out.print("  ");
        for(Node node : nodes)
        {
            System.out.print(node.data + " "); // print rows such as A-B-C-D-E
        }

        System.out.println();

        for (int i=0; i < matrix.length; i++)
        {
            System.out.print(nodes.get(i).data  + " "); // print columns

            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public void breadthFirstSearch(int src)
    {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while (queue.size() != 0)
        {
            src = queue.poll();
            System.out.println(nodes.get(src).data + " = visited");

            for(int i = 0; i < matrix[src].length; i++)
            {
                if(matrix[src][i] == 1 && !visited[i])
                {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
