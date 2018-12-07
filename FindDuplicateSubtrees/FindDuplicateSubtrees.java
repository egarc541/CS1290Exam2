public class FindDuplicateSubtrees {
    private int t = 0;
    private Map<String, int[]> trees; // serialized subtree -> {index, count}
    List<TreeNode> ans;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        trees = new HashMap<>();
        ans = new ArrayList<>();
        getIndex(root);
        return ans;
    }

    private int getIndex(TreeNode root) {
        if (root == null) return -1;
        String serial = root.val + "," + getIndex(root.left) + "," + getIndex(root.right);
        int[] arr = trees.computeIfAbsent(serial, x -> new int[]{t++, 0});
        if (++arr[1] == 2) ans.add(root);
        return arr[0];
    }
}
