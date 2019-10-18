package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
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
        eight.setNext(nine);
    }
}