public class LinkedList{
  Node head = null;
  public void insert(int a){
    Node newnode = new Node(a);
    if(head == null){
      head = newnode;
    }
    else{
      newnode.next = head;
      head = newnode;
    }
  }
  public void delete(){
    if(head == null){
      System.out.println("Empty list!");
    }
    else if(head.next == null){
      head = null;
    }
    else{
      head = head.next;
    }
  }
  public void insert_At_Tail(int value){
    Node newnode = new Node(value);
    if(head == null){
      newnode = head;
    }
    else{
      Node temp = head;
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = newnode;
    }
  }
  public boolean isEmpty(){
    if(head == -1){
      return true;
    }
    else{
      return false;
    }
  }
  public void print(){
    if(head == null){
      System.out.println("Empty list");
    }
    else{
      Node temp = head;
      while(temp!=null){
        System.out.print(temp.vertex.value);
        temp = temp.next;
      }
    }
    System.out.println();
  }
}
