package src.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class TopoLogicalSort {

    class Edge{
        int src;
        int dest;
        Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph)
    {
        TopoLogicalSort tp=new TopoLogicalSort();
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
       
        graph[2].add(tp.new Edge(2, 3));

        graph[3].add(tp.new Edge(3, 1));

        graph[4].add(tp.new Edge(4, 0));
        graph[4].add(tp.new Edge(4, 1));

        
        graph[5].add(tp.new Edge(5, 0));
        graph[5].add(tp.new Edge(5, 2));



    }
    public static void toptlogicalSortDFS(ArrayList<Edge> graph[],int src,boolean vis[], Stack<Integer> st)
    {

        vis[src]=true;
        for(int i=0;i<graph[src].size();i++)
        {
            Edge e=graph[src].get(i);
            if(!vis[e.dest])
            toptlogicalSortDFS(graph, e.dest, vis, st);
        }
        st.push(src);
    }
    public static void findindeg(ArrayList<Edge>grap[],int indeg[])
    {
        for(int i=0;i<grap.length;i++)
        {
            for(int j=0;j<grap[i].size();j++)
            {
                Edge e=grap[i].get(j);
                indeg[e.dest]++;//storing the count of indegree
            }
        }
    }
    public static void tpsort(ArrayList<Edge>[] graph)
    {
        int indeg[]=new int[graph.length];
        findindeg(graph,indeg);
        Queue<Integer> q=new LinkedList();
        for(int i=0;i<indeg.length;i++)
        {
            if(indeg[i]==0) //if indegree is zero than add index to queue.
            q.offer(i);
        }
        while (!q.isEmpty()) {
            int cur=q.poll();
            System.err.print(cur+ " ");
            for(int j=0;j<graph[cur].size();j++)
            {
                Edge e=graph[cur].get(j);
                indeg[e.dest]--;
                if(indeg[e.dest]==0)
                {
                    q.offer(e.dest);
                }
            }
        }
        System.err.println();

    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge>[] graph=new ArrayList[V];
        createGraph(graph);
        tpsort(graph);
        Stack<Integer> st=new Stack<>();
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
                toptlogicalSortDFS(graph,i,vis,st);
            }
        }
        while(!st.isEmpty())
        {
            System.err.print(st.pop()+" ");
        }
    }
}
