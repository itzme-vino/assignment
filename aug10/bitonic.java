import java.util.ArrayList;

public class Solution {
    public static int bitonicSearch(ArrayList<Integer> A, int B) {
        int peakIndex = findPeak(A);

        int increasingResult = binarySearch(A, 0, peakIndex, B, true);
        if (increasingResult != -1) {
            return increasingResult;
        }

        int decreasingResult = binarySearch(A, peakIndex + 1, A.size() - 1, B, false);
        return decreasingResult;
    }

    private static int findPeak(ArrayList<Integer> A) {
        int low = 0, high = A.size() - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) > A.get(mid + 1)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int binarySearch(ArrayList<Integer> A, int start, int end, int target, boolean increasing) {
        int low = start, high = end;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == target) {
                return mid;
            } else if (A.get(mid) < target) {
                if (increasing) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (increasing) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}

  