import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Graph {
    class Edge
    {
        int src;
        int dest;
        int wgh;
        public Edge(int s,int d,int w)
        {
            this.src=s;
           this.dest=d;
           this.wgh=d;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[]){
        int V=graph.length;
        for(int i=0;i<V;i++)
        {
            graph[i]=new ArrayList<>();
        }
        Graph g=new Graph();
        graph[0].add(g.new Edge(0, 1, 1));
        graph[0].add(g.new Edge(0, 2, 1));


        graph[1].add(g.new Edge(1, 0, 1));
        graph[1].add(g.new Edge(1, 3, 1));


        graph[2].add(g.new Edge(2, 0, 1));
        graph[2].add(g.new Edge(2, 4, 1));

        graph[3].add(g.new Edge(3, 1, 1));
        graph[3].add(g.new Edge(3, 4, 1));
        graph[3].add(g.new Edge(3, 5, 1));

        graph[4].add(g.new Edge(4, 2, 1));
        graph[4].add(g.new Edge(4, 3, 1));
        graph[4].add(g.new Edge(4, 5, 1));

        graph[5].add(g.new Edge(5, 3, 1));
        graph[5].add(g.new Edge(5, 4, 1));
        graph[5].add(g.new Edge(5, 6, 1));

        graph[6].add(g.new Edge(6, 5, 1));


    }
    public static void BFS(ArrayList<Edge>graph[])
    {
        // Time Complexity: O(V+E)
        boolean visited[]=new boolean[graph.length];
        Queue<Integer>q=new LinkedList();
        q.add(0);//source node
        while(!q.isEmpty())
        {
            int cur =q.poll();
            if(!visited[cur])
            {
                System.err.print(cur+ " ");
                visited[cur]=true;
                for(int i=0;i<graph[cur].size();i++)
                {
                    q.offer(graph[cur].get(i).dest);
                }
            }
        }
    }
    public static void DFS(ArrayList<Edge>graph[],int cur,boolean []vis)
    {
        // Time Complexity: O(V+E)
        System.err.print(cur+" ");
        vis[cur]=true;
        for(int i=0;i<graph[cur].size();i++)
        {
            Edge e=graph[cur].get(i);
            if(!vis[e.dest])
            {
                DFS(graph, e.dest, vis);
            }
        }
    }
    public static boolean  hasPath(ArrayList<Edge> [] graph,int src,int dest,boolean vis[])
    {
        if(src==dest) return true;
        vis[src]=true;

        for(int i=0;i<graph[src].size();i++)
        {
            Edge e=graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis))
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> [] graph= new ArrayList[V];
        Graph g=new Graph();
        createGraph(graph);
        BFS(graph);
        System.err.println();
        DFS(graph,0,new boolean[V]);
        boolean path=hasPath(graph,0,5,new boolean[V]);
        System.err.println(path);
    }
}
