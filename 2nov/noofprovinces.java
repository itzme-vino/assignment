class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        int numProvince = 0;
        boolean[] visited = new boolean[V+1];
        for(int i=0; i<V; i++){
            if(!visited[i]){
            numProvince++;
            dfs(i, adj, visited);
            }
        }
        return numProvince;
    }
    
    public static void dfs(int n, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        visited[n]=true;
        for(int i=0; i<adj.get(n).size(); i++){
            if(!visited[i] && adj.get(n).get(i)==1){
                dfs(i, adj, visited);
            }
        }
    }
};