package laba8;

import java.util.LinkedList;

class Graph
{
    private int numVertices;
    private LinkedList<Integer> adjLists[];

    Graph(int vertices)
    {
        numVertices = vertices;
        adjLists = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList();
    }

    void addEdge(int src, int dest)
    {
        adjLists[src].add(dest);
    }

    public static void main(String args[])
    {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        for (LinkedList<Integer> gr: g.adjLists
             ) {
            for (int i:gr
                 ) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}