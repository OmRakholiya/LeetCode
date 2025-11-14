// class Solution {
//     public int[] findErrorNums(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         int dup = -1;
//         int sum = 0;

//         for (int num : nums) {
//             if (set.contains(num)) dup = num;
//             else set.add(num);
//             sum += num;
//         }

//         int n = nums.length;
//         int expectedSum = n * (n + 1) / 2;

//         int missing = expectedSum - (sum - dup);
//         return new int[]{dup, missing};
//     }
// }


class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int dup = -1, missing = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                dup = nums[i];
            }
        }

        int expected = 1;
        for (int num : nums) {
            if (num == expected) {
                expected++;
            }
        }

        missing = expected;
        return new int[]{dup, missing};
    }
}
