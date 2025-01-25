import java.util.ArrayList;

public class AllPathFromStoTInGraphDirectedGraph { //Time Complexity: V^V; Exponential time complexity
    class Edge{
        int src;
        int dest;
        Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
        }
    }
    public static void AllPath(ArrayList<Edge>[]graph, int src,int dest, String path)
    {
        if(src==dest)
        {
            System.err.println(path+dest);

        }
        for(int j=0;j<graph[src].size();j++)
        {
            Edge e=graph[src].get(j);
            AllPath(graph, e.dest, dest, path+src);
        }
    }

public static void createGraph(ArrayList<Edge>[] graph)
    {
        AllPathFromStoTInGraphDirectedGraph tp=new AllPathFromStoTInGraphDirectedGraph();
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }

        graph[0].add(tp.new Edge(0, 3));
       
        graph[2].add(tp.new Edge(2, 3));

        graph[3].add(tp.new Edge(3, 1));

        graph[4].add(tp.new Edge(4, 0));
        graph[4].add(tp.new Edge(4, 1));
        
        graph[5].add(tp.new Edge(5, 0));
        graph[5].add(tp.new Edge(5, 2));

    }

    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge>[] graph=new ArrayList[V];
        createGraph(graph);
        int src=5,dest=1;
        AllPath(graph, src, dest,"");
    }
}
