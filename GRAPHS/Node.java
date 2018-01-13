public class Node{
  Vertex vertex;
  Node next;
  public Node(int a){
    vertex = new Vertex(a);
    next = null;
  }
  public String toString(){
    return vertex.value + " " + vertex.color;
  }
}
