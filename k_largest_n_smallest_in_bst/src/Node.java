public class Node
{
    private int theData;
    private Node left;
    private Node right;

    public Node(int inputData)
    {
        theData = inputData;
        left = right = null;
    }
    public Node(int inputData, Node left, Node right)
    {
        theData = inputData;
        this.left = left;
        this.right = right;
    }
    public Node(int inputValue, int leftValue, int rightValue)
    {
        this(inputValue, new Node(leftValue), new Node(rightValue));
    }

    public int getTheData()
    {
        return theData;
    }

    public void setTheData(int theData)
    {
        this.theData = theData;
    }

    public Node getLeft()
    {
        return left;
    }

    public void setLeft(Node left)
    {
        this.left = left;
    }

    public Node getRight()
    {
        return right;
    }

    public void setRight(Node right)
    {
        this.right = right;
    }

    @Override
    public String toString()
    {
        return "Node: " +theData +'}';
    }
}
