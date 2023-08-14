public class Solution {
    private boolean isPossible(int A, int B, ArrayList<Integer> C, long maxTime) {
        int n = C.size();
        int painters = 1;
        long currentPainterTime = 0;
        
        for (int i = 0; i < n; i++) {
            if (currentPainterTime + (long) C.get(i) * B > maxTime) {
                painters++;
                currentPainterTime = 0;
            }
            currentPainterTime += (long) C.get(i) * B;
        }
        
        return painters <= A;
    }


    public int paint(int A, int B, ArrayList<Integer> C) {
        int mod = 10000003;
        int n = C.size();
        
        long low = 0;
        long high = 0;
        for (int i = 0; i < n; i++) {
            high += (long) C.get(i) * B;
        }
        
        while (low < high) {
            long mid = low + (high - low) / 2;
            if (isPossible(A, B, C, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return (int) (low % mod);
}
}
