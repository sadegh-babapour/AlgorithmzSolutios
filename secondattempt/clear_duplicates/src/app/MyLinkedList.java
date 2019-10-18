package app;

public class MyLinkedList
{
    private Node root;

    public MyLinkedList()
    {
        this.root = null;
    }

    public MyLinkedList(Node inRoot)
    {
        this.root = inRoot;
    }


    public void display()
    {
        if(this.root == null)
            System.out.println("Empty list.");

        else
        {
            Node temp = this.root;
            while(temp.getNext()!=null)
            {
                System.out.print(temp.getData() + "-->");
                temp = temp.getNext();
            }
            System.out.printf(temp.getData() + "-->null");
        }
    }

    public void insert(Node theNewNode)
    {
        if(this.root == null)
            this.root = theNewNode;
        else
        {
            Node cursor = this.root;
            while (cursor.getNext() != null)
            {
                cursor = cursor.getNext();
            }
            cursor.setNext(theNewNode);

        }
    }

    public Node getRoot()
    {
        return root;
    }
}
