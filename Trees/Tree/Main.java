package Trees.Tree;

public class Main {
    public static void main(String[] args) {
        TreeNode Drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffe = new TreeNode("Coffee");
        TreeNode wine = new TreeNode("Wine");
        TreeNode beer = new TreeNode("Beer");
        Drinks.addChild(cold);
        Drinks.addChild(hot);
        hot.addChild(tea);
        hot.addChild(coffe);
        cold.addChild(beer);
        cold.addChild(wine);
        System.out.println(Drinks.print(0));
    }
}
