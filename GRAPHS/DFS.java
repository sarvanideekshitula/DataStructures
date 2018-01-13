import java.util.*;
import java.io.*;
public class DFS{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int v, e;
    v = sc.nextInt();
    e = sc.nextInt();
    StackInt s = new StackInt(v);
  //  StackInt s1 = enw StackInt(v);
    int[] visited = new int[v];
    Vertex[] a = new Vertex[v];
    int[][] array = new int[v][v];
    for(int i=0;i<v;i++){
      a[i] = new Vertex();
      visited[i] = 0;
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
    //dfs(1, v, array, visited);
    s.push(1);
    a[1].color = "grey";

    while(s.isEmpty() != 1){
      int q = s.peek();
      int cnt=0;
      for(int i=0;i<v;i++){
        if(array[q][i] == 1 && a[i].color == "white"){
          s.push(i);
          a[i].color = "grey";
          cnt++;
        }
        q = s.peek();
      }
      if(cnt == 0){
        System.out.print(q + " ");
        s1.push(s.pop());
      }
    }
    System.out.println();
  }
}
