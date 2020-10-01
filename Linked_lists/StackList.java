public class StackList{
  public Node top = null;
  public StackList(){
    
  }
  public void push(int value){
    Node newnode = new Node(value);
    if(top==null){
      top = newnode;
    }
    else{
      newnode.next = top;
      top = newnode;
    }
  }
  public void pop(){
    if(top==null){
      System.out.println("Empty List");
    }
    else{
      top = top.next;
    }
  }
  public int getTop(){
    if(top==null){
      return 0;
    }
    else{
      return top.data;
    }
  }
  public void print(){
    if(top==null){
      System.out.println("Empty List");
    }
    else{
      Node temp = top;
      while(temp!=null){
        System.out.print(temp.data);
        System.out.print(" ");
        temp = temp.next;
      }
      System.out.println("");
    }
  }
}
