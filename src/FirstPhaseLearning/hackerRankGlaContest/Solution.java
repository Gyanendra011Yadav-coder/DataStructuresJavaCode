package hackerRankGLAContest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Gyanendra Yadav
 * @created 07/02/2022- 5:45 PM
 * @project DataStructuresJavaCode
 */
public class Solution {
    static final int CHARS = 26;
    int V;
    List<List<Integer>> adj;
    int[] in;

    // Constructor
    Solution(int V)
    {
        this.V = V;
        in = new int[V];
        adj = new ArrayList<>(CHARS);

        for(int i = 0; i < CHARS; i++)
        {
            adj.add(i, new ArrayList<>());
        }
    }

    // Function to add an edge to graph
    void addEdge(int v, int w)
    {
        adj.get(v).add(w);
        in[w]++;
    }

    // Method to check if this graph
// is Eulerian or not
    boolean isEulerianCycle()
    {

        // Check if all non-zero degree
        // vertices are connected
        if (!isSC())
            return false;

        // Check if in degree and out
        // degree of every vertex is same
        for(int i = 0; i < V; i++)
            if (adj.get(i).size() != in[i])
                return false;

        return true;
    }

    // This function returns true if all
// non-zero degree vertices of graph
// are strongly connected. Please refer
    boolean isSC()
    {

        // Mark all the vertices as not
        // visited (For first DFS)
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++)
            visited[i] = false;

        // Find the first vertex with
        // non-zero degree
        int n;
        for(n = 0; n < V; n++)
            if (adj.get(n).size() > 0)
                break;

        // Do DFS traversal starting from
        // first non zero degree vertex.
        DFSUtil(n, visited);

        // If DFS traversal doesn't visit all
        // vertices, then return false.
        for(int i = 0; i < V; i++)
            if (adj.get(i).size() > 0 && !visited[i])
                return false;

        // Create a reversed graph
        Solution gr = getTranspose();

        // Mark all the vertices as not
        // visited (For second DFS)
        for(int i = 0; i < V; i++)
            visited[i] = false;

        // Do DFS for reversed graph starting
        // from first vertex. Starting Vertex
        // must be same starting point of first DFS
        gr.DFSUtil(n, visited);

        // If all vertices are not visited in
        // second DFS, then return false
        for(int i = 0; i < V; i++)
            if (adj.get(i).size() > 0 && !visited[i])
                return false;

        return true;
    }

    // Function to do DFS starting from v.
// Used in isConnected();
// A recursive function to do DFS
// starting from v
    void DFSUtil(int v, boolean[] visited)
    {

        // Mark the current node as
        // visited and print it
        visited[v] = true;

        // Recur for all the vertices
        // adjacent to this vertex
        for(Integer i : adj.get(v))
            if (!visited[i])
            {
                DFSUtil(i, visited);
            }
    }

    // Function that returns reverse
// (or transpose) of this graph
// This function is needed in isSC()
    Solution getTranspose()
    {
        Solution g = new Solution(V);
        for(int v = 0; v < V; v++)
        {

            // Recur for all the vertices
            // adjacent to this vertex
            for(Integer i : adj.get(v))
            {
                g.adj.get(i).add(v);
                g.in[v]++;
            }
        }
        return g;
    }

    // This function takes an of strings
// and returns true if the given array
// of strings can be chained to form cycle
    static boolean canBeChained(String[] arr, int n)
    {

        // Create a graph with 'alpha' edges
        Solution g = new Solution(CHARS);

        // Create an edge from first character
        // to last character of every string
        for(int i = 0; i < n; i++)
        {
            String s = arr[i];
            g.addEdge(s.charAt(0) - 'a',
                    s.charAt(s.length() - 1) - 'a');
        }

        // The given array of strings can be
        // chained if there is an eulerian
        // cycle in the created graph
        return g.isEulerianCycle();
    }

    // Driver code
    public static void main(String[] args) throws Exception
    {
        Scanner scannerObject = new Scanner(System.in);
        int size=scannerObject.nextInt();
        String[] stringArray = new String[size];
        for(int i=0; i<size;i++){
            stringArray[i]= scannerObject.next();
        }
        System.out.println((canBeChained(stringArray, size) ?"True" :"False"));
    }
}