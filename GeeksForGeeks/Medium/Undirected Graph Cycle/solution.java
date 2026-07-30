class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
            
        }
        for(int[] ed:edges){
            int u=ed[0];
            int v=ed[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(dfs(i,-1,vis,adj)) return true;
            }
        }
        return false;
    }
    private boolean dfs(int i, int par,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[i]=true;
        for(int j:adj.get(i)){
            if(!vis[j]){
                if(dfs(j,i,vis,adj)) return true;
            }
           else if(j!=par) return true;
        }
        return false;
    }
}