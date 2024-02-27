



/*Note:  BellMAN Ford Algo:
        --> It is not apply for negative cycle weight.
        negative cycle weight means sum of all edges weight in cycle should not be negative.
        --> It can apply on negative weight of edges but not negative cycle weight.
        -->Time complexity: O(V*E) V-- V-1 iteration and E--> visits all edges in one iteration.
 * 
 * 
 * 
 * 
 */
import java.util.*;;
public class BellmanFordAlg {
    static class Edge
    {
        int src;
        int dest;
        int wt;
        Edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void createGraph(ArrayList<Edge>graph) //Another approach to read the graph.
    {
       
      
       graph.add(new Edge(0, 1, 2));
       graph.add(new Edge(0, 2, 4));
       graph.add(new Edge(1, 2, -4));
       graph.add(new Edge(2, 3, 2));
       graph.add(new Edge(3, 4, 4));
       graph.add(new Edge(4, 1, -1));

    }

    public static void bellmanford(ArrayList<Edge>graph,int src,int V)// Time Complexity: O(V*E)
    {
        int dist[]=new int[V];
        for(int i=0;i<dist.length;i++)
        {
            if(i!=src)
            {
                dist[i]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<V-1;i++)
        {
                 for(int k=0;k<graph.size();k++)
                {
                    Edge e=graph.get(k);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;
                    if(dist[u]+wt <dist[v] && dist[u]!=Integer.MAX_VALUE)
                    {
                        dist[v]=dist[u]+wt;
                    }
                }
        }

        for(int i=0;i<dist.length;i++)
        {
            System.err.print(dist[i]+ " ");
        }
    }



   
   /*  public static void createGraph(ArrayList<Edge>[]graph) Another approach to read the graph.
    {
        int V=graph.length;
       for(int i=0;i<V;i++)
       {
        graph[i]=new ArrayList<>();
       }
       graph[0].add(new Edge(0, 1, 2));
       graph[0].add(new Edge(0, 2, 4));
       graph[1].add(new Edge(1, 2, -4));
       graph[2].add(new Edge(2, 3, 2));
       graph[3].add(new Edge(3, 4, 4));
       graph[4].add(new Edge(4, 1, -1));

    }
    public static void bellmanford(ArrayList<Edge>[]graph,int src)// Time Complexity: O(V*E)
    {
        int dist[]=new int[graph.length];
        for(int i=0;i<dist.length;i++)
        {
            if(i!=src)
            {
                dist[i]=Integer.MAX_VALUE;
            }
        }
        int V=graph.length;
        for(int i=0;i<V-1;i++)
        {
            for(int j=0;j<graph.length;j++)
            {
                for(int k=0;k<graph[j].size();k++)
                {
                    Edge e=graph[j].get(k);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;
                    if(dist[u]+wt <dist[v] && dist[u]!=Integer.MAX_VALUE)
                    {
                        dist[v]=dist[u]+wt;
                    }
                }
            }
        }

        for(int i=0;i<dist.length;i++)
        {
            System.err.print(dist[i]+ " ");
        }




    }
    */

    public static void main(String[] args) {
        int V=5;
       // ArrayList<Edge>[]graph=new ArrayList[V];//method 1
       ArrayList<Edge>graph=new ArrayList<>();
        createGraph(graph);

        bellmanford(graph,0,V);

    }
   
}
