public class Solution {
    public int books(ArrayList<Integer> A, int B) {
        int n = A.size();
        if (n < B) {
            return -1;
        }

        int totalPages = 0;
        for (int pages : A) {
            totalPages += pages;
        }

        int low = 0;
        int high = totalPages;
        int result = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(A, B, mid)) {
                result = Math.min(result, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
        
    }
       private boolean isPossible(ArrayList<Integer> A, int B, int maxPages) {
        int students = 1;
        int currentPages = 0;

        for (int pages : A) {
            if (currentPages + pages > maxPages) {
                students++;
                currentPages = 0;
            }
            currentPages += pages;
        }

        return students <= B;
    }
}

