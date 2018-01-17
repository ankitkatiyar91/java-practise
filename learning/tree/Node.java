package learning.tree;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>>
{

    private Node<T> leftNode;
    private Node<T> rightNode;
    private Node<T> parent;
    private T value;

    public Node(Node<T> leftNode, Node<T> rightNode, Node<T> parent, T value)
    {
        super();
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.parent = parent;
        this.value = value;
    }

    public Node(Node<T> parent, T value)
    {
        super();
        this.parent = parent;
        this.value = value;
    }

    public Node()
    {
        super();
    }

    public void addLeftNode(Node<T> node)
    {
        this.leftNode = node;
    }

    public void addRightNode(Node<T> node)
    {
        this.rightNode = node;
    }

    public Node<T> getLeftNode()
    {
        return leftNode;
    }

    public Node<T> getRightNode()
    {
        return rightNode;
    }

    public T getValue()
    {
        return value;
    }

    public Node<T> getParent()
    {
        return parent;
    }

    @Override
    public String toString()
    {
        return String.format("{Head:%s[Left: %s, Right: %s]} ", value, leftNode != null ? leftNode.value : null,
                rightNode != null ? rightNode.value : null);
    }

    @Override
    public int compareTo(Node<T> o)
    {
        return this.getValue().compareTo(o.getValue());
    }
}
