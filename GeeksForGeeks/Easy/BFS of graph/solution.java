class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        boolean[] visited = new boolean[adj.size()];

        q.offer(0);
        visited[0] = true;

        while (!q.isEmpty()) {

            int node = q.poll();
            ans.add(node);

            for (int neighbor : adj.get(node)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }

        return ans;
    }
}