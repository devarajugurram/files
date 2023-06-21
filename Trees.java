import com.programs.TreeNode;
public class Trees {
    public static void main(String[] args) {
      TreeNode Drinks = new TreeNode("Drinks");
      TreeNode hot = new TreeNode("Hot");
      TreeNode cold = new TreeNode("Cold");
      Drinks.addChildren(hot);
      Drinks.addChildren(cold);
      TreeNode coffee = new TreeNode("Coffee");
      TreeNode tea = new TreeNode("Tea");
      TreeNode fruitjuice = new TreeNode("Fruitjuice");
      TreeNode colddrinks = new TreeNode("ColdDrinks");
      hot.addChildren(coffee);
      hot.addChildren(tea);
      cold.addChildren(fruitjuice);
      cold.addChildren(colddrinks);
      System.out.println(Drinks.print(0));
    }
}
