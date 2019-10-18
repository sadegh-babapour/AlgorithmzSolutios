public class Demo
{
    public static void main(String[] args)
    {
        Node one = new Node(29);
        Node two = new Node(26);
        Node three = new Node(23);
        Node four = new Node(19);
        Node five = new Node(11);
        Node six = new Node(7);
        Node seven = new Node(5);
        Node eight = new Node(4);
        Node nine = new Node(3);

        one.setNext(two);
        two.setNext(three);
        three.setNext(four);
        four.setNext(five);
        five.setNext(six);
        six.setNext(seven);
        seven.setNext(eight);
        seven.setNext(nine);

        MyLinkedList chain = new MyLinkedList(one);

//        System.out.println(chain.getRoot().toString());
        chain.display();
        System.out.println();
        MyLinkedList sorted = chop(chain);
        sorted.display();
    }


    public static MyLinkedList chop(MyLinkedList inputList)
    {
        if(inputList.getRoot() == null)
            return null;
        else if (inputList.getRoot().getNext() == null)
        {
//            System.out.print(inputList.getRoot().getData());
            return inputList;
        }
        else
        {
            MyLinkedList finalList = new MyLinkedList();

            Node leftHead = inputList.getRoot();
            Node beforeTheSlow = inputList.getRoot();
            Node slow = inputList.getRoot();
            Node fast = inputList.getRoot();

            while (fast!= null)
            {
                beforeTheSlow = slow;
                slow = slow.getNext();
                fast = fast.getNext().getNext();
            }
            beforeTheSlow.setNext(null);

            MyLinkedList leftList = new MyLinkedList(leftHead);
            MyLinkedList rightList = new MyLinkedList(slow);

            MyLinkedList newLeft = chop(leftList);
            MyLinkedList newRight = chop(rightList);

            return combine(newLeft, newRight);
        }

    }
    static MyLinkedList combine(MyLinkedList firstOne, MyLinkedList secondOne)
    {
        Node firstCursor = firstOne.getRoot();
        Node secondCursor = secondOne.getRoot();
        Node newListCursor = null;

//        if (firstCursor.getValue() < secondCursor.getValue())
//            newListCursor = firstCursor;
//        else
//            newListCursor = secondCursor;
//
//        newListCursor.setNext(null);
        MyLinkedList finalList = new MyLinkedList(newListCursor);

        while (firstCursor != null && secondCursor!= null)
        {
            if (firstCursor.getData() < secondCursor.getData())
            {
                newListCursor = firstCursor;
                firstCursor = firstCursor.getNext();


            } else
            {
                newListCursor = secondCursor;
                secondCursor = secondCursor.getNext();

            }
            newListCursor.setNext(null);
            finalList.insert(newListCursor);
        }

        if (firstCursor == null)

        {
            while (secondCursor != null)
            {
                newListCursor = secondCursor;
                secondCursor = secondCursor.getNext();
                newListCursor.setNext(null);
                finalList.insert(newListCursor);
            }
        }
        if (secondCursor == null)

        {
            while (firstCursor != null)
            {
                newListCursor = firstCursor;
                firstCursor = firstCursor.getNext();
                newListCursor.setNext(null);
                finalList.insert(newListCursor);
            }
        }
        return finalList;

    }
}
