class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean [] visited = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        ans.add(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int curr = q.poll();
            for(Integer nb : adj.get(curr)){
                if(!visited[nb]){
                    q.add(nb);
                    ans.add(nb);
                    visited[nb] = true;
                }
            }
        }
        return ans;
        
    }
}