package GraphDataStructure;

import java.util.Scanner;

public class minimumEdgesRemove {
  public int minEdge(int vertex, int edge){
      return (vertex-edge)+1;
  }

    public static void main(String[] args) {
      minimumEdgesRemove min = new minimumEdgesRemove();
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        int edges = sc.nextInt();
        int result=min.minEdge(vertex,edges);
        System.out.println(result);
    }

}
