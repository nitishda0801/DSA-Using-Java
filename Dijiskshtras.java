import java.util.ArrayList;
import java.util.PriorityQueue;


/*Note:
---> It  not work on negative weight of edges.it may not give the shortest path on negative weight of edges.
--->Time Complexity:  O(E*log(V)); --> E-- for iterating all edges and log(V)-- for priority queue to find shortest weight

 */

public class Dijiskshtras {//Time Complexity: O(E*log(V));


    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
        static class Pair implements Comparable<Pair>{
                int n;
                int path;
                Pair(int n,int path)
                {
                    this.n=n;
                    this.path=path;
                }
                @Override
                public int compareTo(Pair p2)//path based sorting pairs
                {
                    return this.path-p2.path;
                }
        }
    
    public static void dijiskshtras(ArrayList<Edge>[]graph,int src)
    {
        int n=graph.length;
        int dist[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(i!=src)
            {
                dist[i]=Integer.MAX_VALUE;
            }
        }
        boolean vis[]=new boolean[n];

        PriorityQueue<Pair>pq=new PriorityQueue<>();
        pq.add(new Pair(src,dist[src]));
        while(!pq.isEmpty())
        {
            Pair cur=pq.remove();
            if(!vis[cur.n])
            {
                vis[cur.n]=true;
                for(int i=0;i<graph[cur.n].size();i++)
                {
                    Edge e=graph[cur.n].get(i);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;

                    if(dist[u]+wt <dist[v])
                    {
                        dist[v]=dist[u]+wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }

            }
        }

        for(int i=0;i<dist.length;i++)// ans: 0 2 3 8 6 9
        {
            System.out.print(dist[i]+" ");
        }
    }
    public static void createGraph(ArrayList<Edge>[]graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1 ,2));
        graph[0].add(new Edge(0, 2 ,4));

        graph[1].add(new Edge(1, 3 ,7));
        graph[1].add(new Edge(1, 2 ,1));

        graph[2].add(new Edge(2, 4 ,3));

        graph[3].add(new Edge(3, 5 ,1));

        graph[4].add(new Edge(4, 3 ,2));
        graph[4].add(new Edge(4, 5 ,5));

    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge>[]graph=new ArrayList[V];
        createGraph(graph);
        dijiskshtras(graph, 0);
    }
}
