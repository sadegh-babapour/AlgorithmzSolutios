public class DoublyLinkedList
{
    DoublyLinkedListNode head;

    DoublyLinkedList()
    {
        this(null);
    }

    DoublyLinkedList(DoublyLinkedListNode rootNode)
    {
        this.head = rootNode;
    }


    public DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data)
    {
        if (head == null)
            head = new DoublyLinkedListNode(data);
        else if (head.getNext() == null)
        {
            DoublyLinkedListNode inputNode = new DoublyLinkedListNode(data);
            if (data > head.getData())
            {
                head.setNext(inputNode);
                inputNode.setPrev(head);
            } else
            {
                inputNode.setNext(head);
                head.setPrev(inputNode);
                head = inputNode;

            }
        } else
        {

            DoublyLinkedListNode cursor = head;
            DoublyLinkedListNode lazyCursor = cursor;
            DoublyLinkedListNode inputNode = new DoublyLinkedListNode(data);

            while (cursor != null & data >= cursor.getData())
            {
                lazyCursor = cursor;
                cursor = cursor.getNext();
            }
            if (data == cursor.getData())
            {
                return head;
            } else
            {


                lazyCursor.setNext(inputNode);
                inputNode.setPrev(lazyCursor);
                inputNode.setNext(cursor);
                cursor.setPrev(inputNode);


            }
        }
        return head;
    }
}
