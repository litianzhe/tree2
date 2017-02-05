
import java.util.Date;
import java.util.Iterator;

/**
 * Created by user on 2017/2/4.
 */
public class Se_02_2chashu {

    public static void main(String[] arg) {
        TreeNode treeNode = new TreeNode(7);
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(10);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(6);
        TreeNode treeNode5 = new TreeNode(9);
        TreeNode treeNode6 = new TreeNode(20);
        TreeNode treeNode7 = new TreeNode(1);
        TreeNode treeNode8 = new TreeNode(4);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode3.left = treeNode7;
        treeNode3.right = treeNode8;
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;
        itera(treeNode);
        System.out.print("Hello ");
    }

    static void itera(TreeNode root) {
        if (root == null) return;
        itera(root.left);
        System.out.println(root.value);
        itera(root.right);
    }
}
