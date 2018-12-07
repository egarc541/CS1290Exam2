public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }
    public TreeNode construct(int[] nums, int left, int right) {
        if (left == right)
            return null;
        int max_i = max(nums, left, right);
        TreeNode root = new TreeNode(nums[max_i]);
        root.left = construct(nums, left, max_i);
        root.right = construct(nums, max_i + 1, right);
        return root;
    }
    public int max(int[] nums, int l, int r) {
        int max_i = left;
        for (int i = left; i < right; i++) {
            if (nums[max_i] < nums[i])
                max_i = i;
        }
        return max_i;
    }
}
