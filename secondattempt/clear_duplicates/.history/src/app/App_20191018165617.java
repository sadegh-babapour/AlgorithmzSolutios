package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Node one = new Node(29);
        Node two = new Node(29);
        Node three = new Node(29);
        Node four = new Node(37);
        Node five = new Node(67);
        Node six = new Node(76);
        Node seven = new Node(76);
        Node eight = new Node(88);
        Node nine = new Node(88);
        Node ten = new Node(99);
        Node elev = new Node(100);

        one.setNext(two);
        two.setNext(three);
        three.setNext(four);
        four.setNext(five);
        five.setNext(six);
        six.setNext(seven);
        seven.setNext(eight);
        eight.setNext(nine);
        nine.setNext(ten);
        ten.setNext(elev);

        MyLinkedList chain = new MyLinkedList(one);
        chain.display();
    }


    public static MyLinkedList removeDuplicatesSortedList(MyLinkedList incoming)
    {
        if(incoming.getRoot() == null)
        {
            return null;
        }
        else if (incoming.getRoot().getNext() == null)
        {
            return incoming;
        }
        else
        {
            // since this is sorted, we need two pointers
            Node fast = incoming.getRoot();
            Node slow = fast;

            while (fast != null)
            {
                slow = fast;
                fast = fast.getNext();
                while(fast.getData() == slow.getData())
                {
                    fast = fast.getNext();
                }
                slow.setNext(fast);
            }
            return incoming;
        }
    }


    
}