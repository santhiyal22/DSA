class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    // Set<List<Integer>> two = new HashSet<>();
    // Arrays.sort(nums);
    //  int n = nums.length;
    //  for(int i=0;i<n-2;i++) {
    //     for(int j=i+1;j<n-1;j++) {
    //         for(int k=j+1;k<n;k++) {
    //                 if(nums[i]+nums[j]+nums[k] == 0) {
    //                     List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
    //                   two.add(triplet);
    //             }
    //         }
    //     }
    //  }
    //  return new ArrayList<>(two);

     List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Must sort first

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for 'i'
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Skip duplicates for left and right pointers
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Need a larger sum
                } else {
                    right--; // Need a smaller sum
                }
            }
        }
        return result;
    } 
}