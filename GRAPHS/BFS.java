import java.util.*;
import java.io.*;
public class BFS{
  public static void dfs(int root, int v,int[][] array, int[] visited, StackInt st){
    if(visited[root] == 0){
      visited[root] = 1;
    }
    for(int i=0;i<v;i++){
      if(array[root][i] == 1 && visited[i] == 0){
        dfs(i, v, array, visited);
      }
    }
    st.push(root);
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int v, e;
    v = s.nextInt();
    e = s.nextInt();
    QueueInt q = new QueueInt(v);
    Vertex[] a = new Vertex[v];
    int[] visited = new int[v];
    int[][] array = new int[v][v];
    ArrayList<Integer> a = new ArrayList<Integer>();
    for(int i=0;i<v;i++){
    a[i] = new Vertex();
    visited[i] = 0;
    }
    for(int i=0;i<e;i++){
      int n, m;
      n = s.nextInt();
      m = s.nextInt();
      array[n][m] = 1;
    //  array[m][n] = 1;
    }
    for(int i=0;i<v;i++){
      for(int j=0;j<v;j++){
        System.out.print(array[i][j]);
      }
      System.out.println();
    }
    System.out.println("1. dfs");
    System.out.println("2. bfs");
    System.out.println("3. strongly connected");
    int index = s.nextInt();

    if(index == 1){
      dfs(1, v, array, visited);
    }
    if(index == 2){
      q.enqueue(1);
      a[1].color = "grey";
      while(q.isEmpty() != 1){
        int p = q.dequeue();
        System.out.print(p + " ");
        for(int i=0;i<v;i++){
          if(array[p][i] == 1 && a[i].color == "white"){
            q.enqueue(i);
            a[i].color = "grey";
          }
        }
      }
      System.out.println();
    }
    if(index == 3){
      StackInt st = new StackInt(20);
      int[][] array1 = new int[v][v];

      dfs(1, v, array, visited, st);
      for(int i=0;i<v;i++){
        for(int j=0;j<v;j++){
          array1[i][j] = array[j][i];
        }
      }
      for(int i=0;i<v;i++){
        visited[i] = 0;
      }
      StackInt st1 = new StackInt(20);
      while(st.isEmpty()!=1){
        
      }
    }
  }
}
