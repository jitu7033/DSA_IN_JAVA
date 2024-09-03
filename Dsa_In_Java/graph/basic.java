package graph;
import java.util.*;
public class basic {
    static class  edge{
        int src;
        int dest;
        int wt;
        public edge(int s, int d,int wt){
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }
    public static void createGraph(ArrayList<edge>graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0,1,10));

        graph[1].add(new edge(1,0,10));
        graph[1].add(new edge(1,2,5));

        graph[2].add(new edge(2,0,4));
        graph[2].add(new edge(2,1,4));
        graph[2].add(new edge(2,3,-3));

        graph[3].add(new edge(3,1,6));
        graph[3].add(new edge(3,2,19));

    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);
        for(int i=0; i<graph[2].size(); i++){
            edge e = graph[2].get(i);
            System.out.println(e.dest+" , "+e.wt);
        }
    }
}














