import java.util.*;
public class MinimumSpanningTreePrimsAlg {
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
    static class Pair implements Comparable<Pair>{
        int n;
        int cost;
        Pair(int n,int cost)
        {
            this.n=n;
            this.cost=cost;
        }
        @Override
        public int compareTo(Pair p2)//path based sorting pairs
        {
            return this.cost-p2.cost;
        }
}
    
    
    public static void createGraph(ArrayList<Edge>[]graph)
    {
        int V=graph.length;
       for(int i=0;i<V;i++)
       {
        graph[i]=new ArrayList<>();
       }
       graph[0].add(new Edge(0, 1, 10));
       graph[0].add(new Edge(0, 2, 15));
       graph[0].add(new Edge(0, 3, 30));
       graph[1].add(new Edge(1, 0, 10));
       graph[1].add(new Edge(1, 3, 40));
       graph[2].add(new Edge(2, 0, 15));
       graph[2].add(new Edge(2, 3, 50));
       graph[3].add(new Edge(3, 1, 40));
       graph[3].add(new Edge(3, 2, 50));
       
    }
    public static void primes( ArrayList<Edge>[]graph)
    {
        int V=graph.length;
        boolean vis[]=new boolean[V];
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalCost=0;//min cost for spanning tree
        while(!pq.isEmpty())
        {
            Pair cur=pq.remove();
            if(!vis[cur.n])
            {
                vis[cur.n]=true;
                finalCost+=cur.cost;
                for(int i=0;i<graph[cur.n].size();i++)
                {
                    Edge e=graph[cur.n].get(i);
                    pq.add(new Pair(e.dest,e.wt));
                }
            }
            
        }
        System.err.println("Minum Spannin tree weight: "+finalCost);

    }

    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge>[]graph=new ArrayList[V];
        createGraph(graph);
        primes(graph);
    }
}
