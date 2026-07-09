class Solution {

    void pushLeft(TreeNode root, Stack<TreeNode> st) {
        while (root != null) {
            st.push(root);
            root = root.left;
        }
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        List<Integer> ans = new ArrayList<>();

        pushLeft(root1, s1);
        pushLeft(root2, s2);

        while (!s1.isEmpty() || !s2.isEmpty()) {

            Stack<TreeNode> st;

            if (s1.isEmpty())
                st = s2;
            else if (s2.isEmpty())
                st = s1;
            else if (s1.peek().val < s2.peek().val)
                st = s1;
            else
                st = s2;

            TreeNode node = st.pop();

            ans.add(node.val);

            pushLeft(node.right, st);
        }

        return ans;
    }
}