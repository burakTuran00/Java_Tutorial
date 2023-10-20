import java.util.ArrayList;

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
}
