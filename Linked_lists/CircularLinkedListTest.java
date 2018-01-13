public class CircularLinkedListTest{
  public static void main(String[] args) {
    CircularLinkedList c1 = new CircularLinkedList();
    CircularLinkedList c2 = new CircularLinkedList();
    Node n = new Node(1);
    c1.insert_At_Head(5);
    c1.insert_At_Head(50);
    c1.insert_At_Head(500);
    c1.print();
    c1.insert_At_Tail(6);
    c1.insert_At_Tail(60);
    c1.insert_At_Tail(600);
    c1.print();
    c1.insert_after_node(n, 7);
    c1.print();
    c1.delete_value(5);
    c1.delete_value(6);
    c1.print();
    c1.Delete_At_pos(1);
    c1.print();
    c2.insert_At_Head(100);
    c2.insert_At_Head(200);
    c2.insert_At_Head(300);
    c1.merge(c2);
    c1.print();
  }
}
