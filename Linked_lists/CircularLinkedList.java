public class CircularLinkedList{
  public Node head = null;
  public CircularLinkedList(){
    ;
  }
  public void insert_At_Head(int value){
    Node newnode = new Node(value);
    if(head==null){
      head=newnode;
      newnode.next=head;
    }
    else{
      Node temp = head;
      while(temp.next != head){
        temp = temp.next;
      }
      temp.next = newnode;
      newnode.next = head;
      head = newnode;
    }
  }
  public void insert_At_Tail(int value){
    Node newnode = new Node(value);
    if(head==null){
      head=newnode;
      newnode.next = head;
    }
    else{
      Node temp = head;
      while(temp.next!=head){
        temp=temp.next;
      }
      temp.next = newnode;
      newnode.next = head;
    }
  }
  public void insert_after_node(Node n1, int value){
    Node newnode = new Node(value);
    Node temp = head;
    while(temp.data!=n1.data){
      temp = temp.next;
      if(temp==head){
        System.out.println("Not found");
        break;
      }
    }
    if(temp.next==head){
      temp.next = newnode;
      newnode.next = head;
    }
    else{
      newnode.next = temp.next;
      temp.next = newnode;
    }
  }
  public void delete_value(int value){
    if(head==null){
      System.out.println("Empty List");
    }
    else{
      Node temp = head;
      if(temp.data==value){
        head=head.next;
      }
      else{
        while(temp.next.data!=value){
          temp=temp.next;
        }
        if(temp.next.next==head){
          temp.next = head;
        }
        else{
          temp.next = temp.next.next;
        }
      }
    }
  }
  public void Delete_At_pos(int i){
    if(head==null){
      System.out.println("Empty List");
    }
    else if(i==1){
      head = head.next;
    }
    else{
      Node temp = head;
      int cnt = 1;
      while(cnt!=i-1){
        temp=temp.next;
      }
      if(temp.next.next==head){
        temp.next = head;
      }
      else{
        temp.next = temp.next.next;
      }
    }
  }
  public void print(){
    if(head==null){
      System.out.println("Empty List");
    }
    else{
      Node temp = head;
      while(temp.next!=head){
        System.out.print(temp.data+" ");
        temp=temp.next;
      }
      System.out.print(temp.data+" ");
        System.out.println();
    }
  }
  public void merge(CircularLinkedList c1){
    Node temp = head;
    while(temp.next!=head){
      temp=temp.next;
    }
    Node temp1 = c1.head;
    while(temp1.next!=c1.head){
      temp1=temp1.next;
    }
    temp.next = c1.head;
    temp1.next = head;
  }
}
