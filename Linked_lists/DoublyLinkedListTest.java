public class DoublyLinkedListTest{
  public static void main(String[] args) {
    DoublyLinkedList d1 = new DoublyLinkedList();
    DoubleNode n1 = new DoubleNode(1);
    d1.insert_At_Head(2);
    d1.insert_At_Head(20);
    d1.insert_At_Head(200);
    d1.print();
    d1.insert_at_pos(1, 2000);
    d1.insert_at_pos(5, 1);
    d1.insert_at_pos(3, 4);
    d1.print();
    d1.insert_after_node(n1, 5);
    d1.print();
    d1.delete_value(5);
    d1.print();
    d1.delete_value(2000);
    d1.print();
  }
}
