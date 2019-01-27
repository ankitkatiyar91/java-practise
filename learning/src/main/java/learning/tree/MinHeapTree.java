package learning.tree;

public class MinHeapTree<T extends Comparable<T>>
{
    private final Node<T> root;

    public MinHeapTree(Node<T> root)
    {
        this.root = root;
    }

    public void addNode(final Node<T> node)
    {
        Node<T> current = root;
        while (current != null)
        {
            if (current.compareTo(node) >= 0)
            {
                current = current.getRightNode();
            }
            else
            {
                current = current.getLeftNode();
            }
        }
        current = node;
        normalizeFrom(current);
    }

    private void normalizeFrom(final Node<T> node)
    {
        Node<T> current = node;
        Node<T> temp, parent;
        while (current.getValue().compareTo(current.getParent().getValue()) < 0)
        {
            temp = current;
            parent = current.getParent();
            current = current.getParent();
            current.addLeftNode(parent.getLeftNode());
            current.addRightNode(parent.getRightNode());
            parent = temp;
            parent.addLeftNode(temp.getLeftNode());
            parent.addRightNode(temp.getRightNode());

        }
    }

    public Node<T> getRoot()
    {
        return root;
    }

    @Override
    public String toString()
    {
        StringBuffer buffer = new StringBuffer();
        Node<T> current = root;
        while (current != null)
        {
            buffer.append(current.toString());
            current = current.getLeftNode();
        }
        return super.toString();
    }

}

class MinHeapTreeTest
{
    public static void main(String[] args)
    {
        MinHeapTree<Integer> heapTree = new MinHeapTree<Integer>(new Node<Integer>(null, 10));
        heapTree.addNode(new Node<Integer>(heapTree.getRoot(), 8));
        heapTree.addNode(new Node<Integer>(heapTree.getRoot(), 9));
        System.out.println("MinHeapTreeTest.main()");
    }
}