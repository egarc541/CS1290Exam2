public class RangeSumofBST {
    int ans;
    public int rangeSumBST(TreeNode root, int left, int right) {
        ans = 0;
        dfs(root, left, right);
        return ans;
    }

    public void dfs(TreeNode node, int left, int right) {
        if (node != null) {
            if (left <= node.val && node.val <= right)
                ans += node.val;
            if (left < node.val)
                dfs(node.left, left, right);
            if (node.val < right)
                dfs(node.right, left, right);
        }
    }
}
