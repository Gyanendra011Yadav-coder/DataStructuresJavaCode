package FirstPhaseLearning.gfgProblemOfTheDay;

import java.util.ArrayList;

public class partyinTown {
    private static boolean[] visited;

    static int partyHouse(int N, ArrayList<ArrayList<Integer>> adj) {
        int ans = Integer.MAX_VALUE;
        for (int i = 1 ; i <= N ; i++) {
            visited = new boolean[N+1];
            ans = Math.min(ans, dfs(adj, i));
        }
        return ans;
    }

    private static int dfs(ArrayList<ArrayList<Integer>> adj, int s) {
        visited[s] = true;
        int temp = 0;
        for (int adjacent: adj.get(s)) {
            if (!visited[adjacent]) {
                temp = Math.max(temp, 1 + dfs(adj, adjacent));
            }
        }

        return temp;
    }
}
