import java.util.*;
import java.io.*;
public class BFSList{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int v, e;
    System.out.println("Enter no.of vertices");
    v = s.nextInt();
    System.out.println("Enter no.of edges");
    e = s.nextInt();
    QueueInt q = new QueueInt(v);
    LinkedList[] a = new LinkedList[v];
    for(int i=0;i<v;i++){
      a[i] = new LinkedList();
      a[i].insert(i);
    }
    System.out.println("Enter edges");
    for(int i=0;i<e;i++){

      int n, m;
      n = s.nextInt();
      m = s.nextInt();
      a[n].insert_At_Tail(m);
      a[m].insert_At_Tail(n);
    }
    for(int i=0;i<v;i++){
      a[i].print();
    }
    q.enqueue(0);
    a[0].vertex.color = "grey";
    while(!q.isEmpty()){
      int p = q.dequeue();
      System.out.print(p + " ");
      Node temp = a[p].head;
      while(temp!=null && temp.vertex.color=="white"){
        q.enqueue(temp.vertex.value);
        temp = temp.next;

      }

    }
  }
}
