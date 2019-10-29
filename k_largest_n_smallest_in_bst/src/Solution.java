/***
 * @author Sadegh
 */

public class Solution
{
    public static void main(String[] args)
    {
        Node a01 = new Node(32);
        Node a02 = new Node(16);
        Node a03 = new Node(8);
        Node a04 = new Node(24);
        Node a05 = new Node(4);
        Node a06 = new Node(12);
        Node a07 = new Node(20);
        Node a08 = new Node(28);
        Node a09 = new Node(2);
        Node a10 = new Node(6);
        Node a11 = new Node(10);
        Node a12 = new Node(14);
        Node a13 = new Node(18);
        Node a14 = new Node(22);
        Node a15 = new Node(26);
        Node a16 = new Node(30);
        Node a17 = new Node(1);
        Node a18 = new Node(3);
        Node a19 = new Node(5);
        Node a20 = new Node(7);
        Node a21 = new Node(9);
        Node a22 = new Node(11);
        Node a23 = new Node(13);
        Node a24 = new Node(15);
        Node a25 = new Node(17);
        Node a26 = new Node(19);
        Node a27 = new Node(21);
        Node a28 = new Node(23);
        Node a29 = new Node(25);
        Node a30 = new Node(27);
        Node a31 = new Node(29);
        Node a32 = new Node(31);
        Node a33 = new Node(48);
        Node a34 = new Node(40);
        Node a35 = new Node(56);
        Node a36 = new Node(36);
        Node a37 = new Node(44);
        Node a38 = new Node(52);
        Node a39 = new Node(60);
        Node a40 = new Node(34);
        Node a41 = new Node(38);
        Node a42 = new Node(42);
        Node a43 = new Node(46);
        Node a44 = new Node(50);
        Node a45 = new Node(54);
        Node a46 = new Node(58);
        Node a47 = new Node(62);
        Node a48 = new Node(33);
        Node a49 = new Node(35);
        Node a50 = new Node(37);
        Node a51 = new Node(39);
        Node a52 = new Node(41);
        Node a53 = new Node(43);
        Node a54 = new Node(45);
        Node a55 = new Node(47);
        Node a56 = new Node(49);
        Node a57 = new Node(51);
        Node a58 = new Node(53);
        Node a59 = new Node(55);
        Node a60 = new Node(57);
        Node a61 = new Node(59);
        Node a62 = new Node(61);
        Node a63 = new Node(63);






        MyBinaryTree tree = new MyBinaryTree(a01);
        tree.insert(a02);
        tree.insert(a03);
        tree.insert(a04);
        tree.insert(a05);
        tree.insert(a06);
        tree.insert(a07);
        tree.insert(a08);
        tree.insert(a09);
        tree.insert(a10);
        tree.insert(a11);
        tree.insert(a12);
        tree.insert(a13);
        tree.insert(a14);
        tree.insert(a15);
        tree.insert(a16);
        tree.insert(a17);
        tree.insert(a18);
        tree.insert(a19);
        tree.insert(a20);
        tree.insert(a21);
        tree.insert(a22);
        tree.insert(a23);
        tree.insert(a24);
        tree.insert(a25);
        tree.insert(a26);
        tree.insert(a27);
        tree.insert(a28);
        tree.insert(a29);
        tree.insert(a30);
        tree.insert(a31);
        tree.insert(a32);
        tree.insert(a33);
        tree.insert(a34);
        tree.insert(a35);
        tree.insert(a36);
        tree.insert(a37);
        tree.insert(a38);
        tree.insert(a39);
        tree.insert(a40);
        tree.insert(a41);
        tree.insert(a42);
        tree.insert(a43);
        tree.insert(a44);
        tree.insert(a45);
        tree.insert(a46);
        tree.insert(a47);
        tree.insert(a48);
        tree.insert(a49);
        tree.insert(a50);
        tree.insert(a51);
        tree.insert(a52);
        tree.insert(a53);
        tree.insert(a54);
        tree.insert(a55);
        tree.insert(a56);
        tree.insert(a57);
        tree.insert(a58);
        tree.insert(a59);
        tree.insert(a60);
        tree.insert(a61);
        tree.insert(a62);
        tree.insert(a63);
        tree.inOrderPrint(tree.getTheRoot());
        System.out.println();
        System.out.println("*******************************************");

        System.out.println(tree.theKthSmallest(tree.getTheRoot(),4));
        System.out.println(tree.theNthLargest(tree.getTheRoot(),4));

    }
}
