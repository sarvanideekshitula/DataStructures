public class Vertex{
  int value;
  String color;
  public Vertex(){
    value = 0;
    color = "white";
  }
  public Vertex(int a){
    value = a;
    color = "white";
  }
  public String toString(){
    return value + " " + color;
  }
}
