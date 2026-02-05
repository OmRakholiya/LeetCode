// class NumArray {
//     int nums[];
//     public NumArray(int[] nums) {
//         this.nums=nums;
//     }
    
//     public void update(int index, int val) {
//         nums[index]=val;
//     }
    
//     public int sumRange(int left, int right) {
//         int sum=0;
//         for(int i=left;i<=right;i++){
//             sum+=nums[i];
//         }
//         return sum;
//     }
// }


// class NumArray {
//     int nums[];
//     int [] prefix;
//     public NumArray(int[] nums) {
//         this.nums=nums;
//         prefix = new int[nums.length+1];
//         Buildprefix();
//     }

//     public void Buildprefix(){
//         for(int i=0;i<nums.length;i++){
//             prefix[i+1]=prefix[i]+ nums[i];
//         }
//     }
    
//     public void update(int index, int val) {
//         nums[index] = val;
//         Buildprefix();
//     }    
    
//     public int sumRange(int left, int right) {
//         return prefix[right+1] - prefix[left];
//     }
// }



class NumArray {
    int[] bit;
    int[] nums;
    int n;

    public NumArray(int[] nums) {
        this.nums = nums;
        n = nums.length;
        bit = new int[n + 1];

        // build Fenwick Tree
        for (int i = 0; i < n; i++) {
            add(i + 1, nums[i]);
        }
    }

    // Add value to Fenwick Tree
    private void add(int index, int value) {
        while (index <= n) {
            bit[index] += value;
            index += index & (-index);
        }
    }

    // Update element
    public void update(int index, int val) {
        int diff = val - nums[index];
        nums[index] = val;
        add(index + 1, diff);
    }

    // Prefix sum
    private int prefixSum(int index) {
        int sum = 0;
        while (index > 0) {
            sum += bit[index];
            index -= index & (-index);
        }
        return sum;
    }

    // Range sum
    public int sumRange(int left, int right) {
        return prefixSum(right + 1) - prefixSum(left);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */