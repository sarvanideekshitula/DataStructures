public class TestQueueList{
  public static void main(String[] args) {
    QueueList q1 = new QueueList();
    q1.Enqueue(10);
    q1.Enqueue(20);
    q1.Enqueue(30);
    q1.print();
    q1.Dequeue();
    q1.print();
  }
}
