public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int N = A.size();
        int i = N - 1;
        while(i>=0){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            int row = 0, col = N-i-1;
            for(int j=0;j<N-i;j++){
                tmp.add(A.get(row).get(col));
                row++;
                col--;
            }
            ans.add(tmp);
            i--;
        }
        i = N-2;
        while(i>=0){
            int row = N-i-1, col = N-1;
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                tmp.add(A.get(row).get(col));
                row++;
                col--;
            }
            ans.add(tmp);
            i--;
        }
        return ans;
    
    }
}
