package GraphDataStructure;

import java.util.Vector;

/**
 * You are given the number of vertices(V) and the number of edges(E) of an undirected graph,
 * the task is to print the count of the minimum number of edges that must be removed from the
 * graph to break all of its cycles.
 */
public class RemoveEdgeRemoveCycle {
        @SuppressWarnings("unchecked")
        static Vector<Integer> []vec = new Vector[100001];
        static boolean []vis = new boolean[100001];
        static int connectedComponent = 1;
        static void dfs(int node)
        {
            vis[node] = true;
            for(int x : vec[node])
            {
                if (!vis[x])
                {
                    connectedComponent++;
                    dfs(x);
                }
            }
        }
        static void addEdge(int u, int v)
        {
            vec[u].add(v);
            vec[v].add(u);
        }
        static void minEdgeRemoved(int vetices, int edges,
                                   int Edges[][])
        {
            for(int i = 0; i <edges ; i++)
            {
                addEdge(Edges[i][0],
                        Edges[i][1]);
            }
            int k = 0;
            for(int i = 1; i <= vetices; i++)
            {
                if (!vis[i])
                {
                    connectedComponent = 1;
                    dfs(i);
                    k++;
                }
            }

            // Print the final count
            System.out.print(vetices - edges + k + "\n");
        }
        public static void main(String[] args)
        {
            int N = 3, M = 2;

            int Edges[][] = { { 1, 2 }, { 2, 3 } };

            for(int i = 0; i < vec.length; i++)
                vec[i] = new Vector<Integer>();
            minEdgeRemoved(N, M, Edges);
        }
    }


