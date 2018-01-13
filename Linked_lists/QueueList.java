public class QueueList{
  public Node front = null;
  public Node rear = null;
  public QueueList(){
    ;
  }
  public void Enqueue(int value){
    Node newnode = new Node(value);
    if(front==null && rear==null){
      front = newnode;
      rear = newnode;
    }
    else{
      rear.next = newnode;
      rear = newnode;
    }
  }
  public void Dequeue(){
    if(front==null && rear==null){
      System.out.println("Empty List");
    }
    else if(front==rear){
      front = null;
      rear = null;
    }
    else{
      front = front.next;
    }
  }
  public int getFront(){
    if(front==null && rear==null){
      System.out.println("Empty List");
      return 0;
    }
    else{
      return front.data;
    }
  }
  public void print(){
    if(front==null && rear==null){
      System.out.println("Empty List");
    }
    else{
      Node temp = front;
      while(temp!=null){
        System.out.print(temp.data);
        System.out.print(" ");
        temp = temp.next;
      }
      System.out.println("");
    }
  }
}
