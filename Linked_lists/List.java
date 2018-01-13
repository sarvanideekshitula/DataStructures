public class List{
  public Node head = null;
  public void insert(int value){
    Node newnode = new Node(value);
    if(head == null){
      head = newnode;
    }
    else{
      Node temp = head;
      while(temp.next != null){
        temp = temp.next;
      }
      temp.next = newnode;
    }
    }
    public void print(){
      if(head == null){
        System.out.println("Empty List");
      }
      else{
        Node temp = head;
        while (temp!=null) {
          System.out.print(temp.data);
          System.out.print(" ");
          temp = temp.next;
        }
        System.out.println();
      }
    }
    public void insert_at_pos(int value, int k){

      Node temp=head;
      Node newnode = new Node(value);
      int cnt = 1;
      while(cnt!=k-1){
        temp =temp.next;
        cnt++;
      }
      newnode.next = temp.next;
      temp.next = newnode;
    }
    public void delete(int pos){
      if(head == null){
        System.out.println("Empty List");
      }
      else if(pos==1){
        head = head.next;
      }
      else{
        Node temp = head;
        int cnt = 1;
        while(cnt != pos-1){
          temp = temp.next;
          cnt++;
        }
        temp.next = temp.next.next;
      }
    }
    public void reverse(Node root){
      if(root!=null){
        reverse(root.next);
        System.out.print(root.data);
        System.out.print(" ");
      }
    }
    public void delete_next_node(Node key){
      Node temp = head;
      while(temp!=key){
        temp= temp.next;
      }
      if(temp.next == null){
        temp = null;
      }
      else{
        temp.next = temp.next.next;
      }

    }
    public void newList(List l1){
      List l3 = new List();
      Node temp1 = l1.head;
      Node temp2 = this.head;
      while(temp1!=null && temp2!=null){
          if(temp1.data< temp2.data){
            l3.insert(temp1.data);
            temp1 = temp1.next;
          }
          else if(temp1.data> temp2.data){
            l3.insert(temp2.data);
            temp2 = temp2.next;
          }
          else{
            l3.insert(temp1.data);
            l3.insert(temp2.data);
            temp1 = temp1.next;
            temp2 = temp2.next;
          }
      }
      if(temp1==null){
        while(temp2!=null){
          l3.insert(temp2.data);
          temp2 = temp2.next;
        }
      }
      if(temp2==null){
        while(temp1!=null){
          l3.insert(temp1.data);
          temp1 = temp1.next;
        }
      }
      l3.print();
      l3.reverse(l3.head);
    }
    public void alter(List l1){
      int cnt = 2;
      Node temp2 = this.head;
      while(temp2!=null){
          l1.insert_at_pos(cnt, temp2.data);
          temp2 = temp2.next;
          cnt=cnt+2;
      }
      this.head = null;
      l1.print();
    }
    public void SpecialDelete(int p, int d){
      Node temp = head;

      while(temp!=null){
        int cnt = 1, cnt2=1;
        while(cnt!=p){
          temp=temp.next;
          if(temp == null){
            break;
          }
          cnt++;
        }
        while(cnt2!=d+1){
          if(temp == null){
            break;
          }
          else if(temp.next == null){
            temp = null;
          }
          else{
            temp.next = temp.next.next;
          }
          cnt2++;
        }
        if(temp == null){
          break;
        }
        else if(temp.next == null){
          temp = null;
        }
        else{
          temp = temp.next;
        }
      }
    }
    public void swap(){
      Node temp = head;
      while(temp.next!=null){
        
      }
    }
}
