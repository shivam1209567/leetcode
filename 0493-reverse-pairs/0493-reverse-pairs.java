class Solution {

    int count = 0;

    public int reversePairs(int[] nums) {

        mergeSort(nums, 0, nums.length - 1);

        return count;
    }

    public void mergeSort(int[] nums,
                          int si,
                          int ei){

        if(si >= ei){
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(nums, si, mid);

        mergeSort(nums, mid + 1, ei);

        countPairs(nums, si, mid, ei);

        merge(nums, si, mid, ei);
    }

    public void countPairs(int[] nums,
                           int si,
                           int mid,
                           int ei){

        int right = mid + 1;

        for(int i = si; i <= mid; i++){

            while(right <= ei &&
                  nums[i] > 2L * nums[right]){

                right++;
            }

            count += right - (mid + 1);
        }
    }

    public void merge(int[] nums,
                      int si,
                      int mid,
                      int ei){

        int[] merged = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while(idx1 <= mid && idx2 <= ei){

            if(nums[idx1] <= nums[idx2]){

                merged[x++] = nums[idx1++];

            } else {

                merged[x++] = nums[idx2++];
            }
        }

        while(idx1 <= mid){
            merged[x++] = nums[idx1++];
        }

        while(idx2 <= ei){
            merged[x++] = nums[idx2++];
        }

        // copy back
        for(int i = 0, j = si;
            i < merged.length;
            i++, j++){

            nums[j] = merged[i];
        }
    }
}