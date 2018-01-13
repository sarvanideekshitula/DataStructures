public class DoublyLinkedList{
  public DoubleNode head = null;
  public void insert_At_Head(int value){
    DoubleNode newnode = new DoubleNode(value);
    if(head==null){
      head=newnode;
    }
    else{
      newnode.next=head;
      head.prev=newnode;
      head=newnode;
    }
  }
  public void insert_at_pos(int i, int value){
    DoubleNode newnode = new DoubleNode(value);
    if(head==null){
      head=newnode;
    }
    else if(i==1){
      insert_At_Head(value);
    }
    else{
      DoubleNode temp = head;
      int cnt=1;
      while(cnt!=i-1){
        temp=temp.next;
        cnt++;
      }
      if(temp.next==null){
        newnode.prev = temp;
        temp.next=newnode;
      }
      else{
        newnode.next=temp.next;
        newnode.prev= temp;
        temp.next.prev=newnode;
        temp.next=newnode;
      }
    }
  }
  public void insert_after_node(DoubleNode n1, int value){
    DoubleNode newnode = new DoubleNode(value);
    DoubleNode temp = head;
    while(temp.data!=n1.data){
      temp=temp.next;
    }
    if(temp.next==null){
      newnode.prev=temp;
      temp.next=newnode;
    }
    else{
      newnode.prev=temp;
      newnode.next=temp.next;
      temp.next.prev=newnode;
      temp.next=newnode;
    }
  }
  public void delete_value(int value){
    DoubleNode newnode = new DoubleNode(value);
    if(head==null){
      System.out.println("Empty List");
    }
    else{
      DoubleNode temp = head;
      while(temp.data!=value){
        temp=temp.next;
      }
      if(temp==head){
        head.next.prev=null;
        head=head.next;
      }
      else if(temp.next==null){
        temp.prev.next=null;
        temp.prev=null;
      }
      else{
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp.next=null;
        temp.prev=null;
      }
    }
  }
  public void print(){
    if(head==null){
      System.out.println("Empty List");
    }
    else{
      DoubleNode temp = head;
      while(temp.next!=null){
        System.out.print(temp.data);
        System.out.print(" ");
        temp = temp.next;
      }
      System.out.print(temp.data);
      System.out.println("");
    }
  }
}
