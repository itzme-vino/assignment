class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
           int count = 0;
    for (int i = 0; i < N - 1; i++)
      for (int j = i + 1; j < N ; j++)
        if (arr[i] > arr[j]) {
         count++;
        }
    return count;
    }
}