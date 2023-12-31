package Trees.Tree;
import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> children;
    
    public TreeNode(String Data) {
        this.data = Data;
        this.children = new ArrayList<TreeNode>();
    }

    public void addChild(TreeNode node) {
        this.children.add(node);
    }

    public String print(int level) {
        String res;
        res = " ".repeat(level)+data+"\n";
        for (TreeNode node : this.children) {
            res += node.print(level+1);
        }
        return res;
    }
}

