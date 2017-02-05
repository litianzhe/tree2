import javax.swing.tree.TreeNode;
import java.util.Iterator;

/**
 * Created by user on 2017/2/4.
 */
public class Se_02_2chashu {
    public static void main(String[] arg){
        TreeNode treeNode;
        //treeNode = new TreeNode(7);
        System.out.print("Hello ");
    }
    void itera(TreeNode root){
        if (root==null)return;
        System.out.println(root);
        itera(root.left);
        itera(root.right);
    }
}
