class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> g = new ArrayList<>();
        for(int i=0;i<V;i++) g.add(new ArrayList<>());
        for(int[] edge:edges){
            g.get(edge[0]).add(edge[1]);
            g.get(edge[1]).add(edge[0]);
        }
        return g;
    }
}