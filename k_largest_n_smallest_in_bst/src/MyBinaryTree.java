import java.util.Stack;

public class MyBinaryTree
{
    private Node theRoot;

    public MyBinaryTree(Node inputRoot)
    {
        theRoot = inputRoot;
    }

    public MyBinaryTree()
    {
        this(null);
    }

    public void insert(Node aNode)
    {
        insert(aNode.getTheData());
    }

    public void insert(int aValue)
    {

        Node newNode = new Node(aValue);
        if (getTheRoot() == null)
        {
            this.theRoot = newNode;
        } else
        {
            Node current = getTheRoot();
            Node parent;
            while (true)
            {
                parent = current;
                if (aValue < current.getTheData())
                {
                    current = current.getLeft();
                    if (current == null)
                    {
                        parent.setLeft(newNode);
                        return;
                    }
                } else
                {
                    current = current.getRight();
                    if (current == null)
                    {
                        parent.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }

    public void inOrderPrint(Node cursor)
    {
        if (cursor == null)
            return;
        inOrderPrint(cursor.getLeft());
        System.out.print(cursor.getTheData() + "-->>");
        inOrderPrint(cursor.getRight());
    }


    public Node getTheRoot()
    {
        return theRoot;
    }


    public int theKthSmallest(Node input, int k)
    {
        int count = 0;
        Stack<Node> theNodes = new Stack<>();
        Node temp = input;

        while (!theNodes.empty() || temp != null)
        {
            if (temp != null)
            {
                theNodes.push(temp);
                temp = temp.getLeft();
            } else
            {
                temp = theNodes.pop();
                count++;

                if (count == k)
                    break;

                temp = temp.getRight();
            }
        }

        return temp.getTheData();

    }

    public int theNthLargest(Node input, int n)
    {
        // just like previous method, but everything is reversed
        int count = 0;
        Stack<Node> theNodes = new Stack<>();
        Node temp = input;

        while (!theNodes.empty() || temp != null)
        {
            if (temp != null)
            {
                theNodes.push(temp);
                temp = temp.getRight();
            } else
            {
                temp = theNodes.pop();
                count++;

                if (count == n)
                    break;

                temp = temp.getLeft();
            }
        }

        return temp.getTheData();


    }


// this works but doesn't terminate when condition is met, uhhhhhhhh :(

    public int kthSmallestRecursive(Node treeRoot, int k, int count) throws Exception
    {

        if (treeRoot == null)
        {
            ++count;
        } else
        {
            count = kthSmallestRecursive(treeRoot.getLeft(), k, count);
//            System.out.println(treeRoot.toString() + count);

            if (count == k)
            {
                System.out.println("The " + k + "th smallest Node:\n" +
                        treeRoot.toString());
//                System.exit(0);
                treeRoot = null;
            }
            count = kthSmallestRecursive(treeRoot.getRight(), k, count);
            return count;
        }
        return count;
    }


    public int kthLargestRecursive(Node treeRoot, int k, int count)
    {
        if (treeRoot == null)
        {
            ++count;
        }
        else
        {
            count = kthLargestRecursive(treeRoot.getRight(), k, count);
            if (count == k)
            {
                System.out.println("The " + k + "th LARGEST Node:\n" +
                        treeRoot.toString());
                treeRoot = null;
            }
            count = kthLargestRecursive(treeRoot.getLeft(), k, count);
            return count;
        }
        return count;
    }
}


