// Breadth FS = Traverse a graph level by level
//              Utilizes a Queue
//              Better if destination is on average close to start
//              siblings are visited before children

// Depth FS =   Traverse a graph branch by branch
//              Utilizes a Stack
//              Better if destination in on average far from the start
//              children are visited before siblings
//              more popular for games and puzzles

public class Main
{
    public static void main(String[] args)
    {
        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.breadthFirstSearch(0);
    }
}