import java.util.*;
import java.io.*;
public class StronglyConnected{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int v, e;
    v = sc.nextInt();
    e = sc.nextInt();
    StackInt s = new StackInt(v);
    Vertex[] a = new Vertex[v];
    int[][] array = new int[v][v];
    for(int i=0;i<v;i++){
      a[i] = new Vertex();
    }
    for(int i=0;i<e;i++){
      int n, m;
      n = sc.nextInt();
      m = sc.nextInt();
      array[n][m] = 1;
    }
    for(int i=0;i<v;i++){
      for(int j=0;j<v;j++){
        System.out.print(array[i][j]);
      }
      System.out.println();
    }
    ArrayList<Integer> visited = new ArrayList<Integer>();
    StackInt stack = new StackInt(v);
    s.push(1);
    a[1].color = "grey";
    visited.add(1);

    while(s.isEmpty() != 1){
      int q = s.peek();
      int cnt=0;
      for(int i=0;i<v;i++){
        if(array[q][i] == 1 && a[i].color == "white"){
          s.push(i);
          a[i].color = "grey";
          visited.add(i);
          cnt++;
        }
      }
      if(cnt == 0){
        System.out.print(q + " ");

        stack.push(s.pop());
      }
    }
    System.out.println();
    for(int i=0;i<v;i++){
      System.out.print(stack.arr[i] + " ");
    }
    System.out.println();
    for(int i=0;i<v;i++){
      System.out.print(visited.get(i) + " ");
    }
  }
}
