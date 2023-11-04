class Solution {
    int result=0;
    public int countCompleteComponents(int n, int[][] edges) {

        //first store the graph
        List<List<Integer>>li=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            li.add(new ArrayList<>());
        }
        for(int []edge:edges)
        {
            int first=edge[0];
            int second=edge[1];
            li.get(first).add(second);
            li.get(second).add(first);

        }

      boolean visited[]=new boolean[n];
      Queue<Integer>q=new LinkedList<>();
      
      for(int i=0;i<n;i++)
      {
          if(!visited[i])
          {
              bfs(li,visited,i,q);
          }
      }
       return result;
        
    }
    public void bfs(List<List<Integer>>li,boolean visited[],int s,Queue<Integer>q)
    {
        int countEdge=0;
        int countNode=0;
        q.add(s);
        visited[s]=true;
        while(!q.isEmpty())
        {
            int u=q.poll();
            countNode++;
            for(int v:li.get(u))
            {
               countEdge++;
                if(!visited[v])
                {
                    visited[v]=true;
                    q.add(v);
                    
                }
            }
        }
//since it is undirected graph hence countEdge should be divide by 2
        if(countEdge/2==(countNode*(countNode-1))/2){
            result++;
        }


    }
}