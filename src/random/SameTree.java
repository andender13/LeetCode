package random;

public class SameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(2);
        q.left = new TreeNode(1);
        System.out.println(isSameTree(p, q));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        boolean result;
        if ((p == null && q != null) || (p != null && q == null)) {
            result = false;
        } else {
            if (p == null) {
                return true;
            } else {
                if (p.val == q.val) {
                    result = isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}
