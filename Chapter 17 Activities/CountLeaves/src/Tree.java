import java.util.List;
import java.util.ArrayList;
/**
    A tree in which each node has an arbitrary number of children.
    Modify the Tree class from Section 16.1 (below) to add
    a method that counts the number of leaves in the tree.
*/
public class Tree
{
    private Node root;
    private int leaves = 0;

    class Node
    {
        public Object data;
        public List<Node> children;

        /**
            Computes the size of the subtree whose root is this node.
            @return the number of nodes in the subtree
        */
        public int size()
        {
            int sum = 0;
            for (Node child : children) { sum = sum + child.size(); }
            return 1 + sum;
        }
    }

    /**
        Constructs an empty tree.
    */
    public Tree()
    {
        root = null;
    }


    /**
        Constructs a tree with one node and no children.
        @param rootData the data for the root
    */
    public Tree(Object rootData)
    {
        root = new Node();
        root.data = rootData;
        root.children = new ArrayList<>();
    }

    /**
        Adds a subtree as the last child of the root.
    */
    public void addSubtree(Tree subtree)
    {
        root.children.add(subtree.root);
    }

    /**
        Computes the size of this tree.
        @return the number of nodes in the tree
    */
    public int size()
    {
        if (root == null) { return 0; }
        else { return root.size(); }
    }

    // Additional methods will be added in later sections.
    public int leafCount()
    {
        int sum = 0;
        if(this.root.children.size() == 0)
            sum = 1;
        else
        {
            for(Node child: this.root.children)
            {
                    sum += new Tree(child).leafCount();
            }
        }
            
        
        return sum;
    }
}
