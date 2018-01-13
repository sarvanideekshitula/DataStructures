import java.util.Scanner;
public class ListTest{
  public static void main(String[] args) {
    List l1 = new List();
    List l2 = new List();
    l1.insert(1);
    l1.insert(3);
    l1.insert(5);
    l1.insert(7);
    l1.insert(9);
    l2.insert(2);
    l2.insert(4);
    l2.insert(6);
    l2.insert(8);
    l2.insert(10);
    l1.print();
    l2.print();
    l2.newList(l1);
    /*Scanner sc = new Scanner(System.in);
    List l4 = new List();
    List l5 = new List();
    System.out.println("No.of nodes");
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
      int element = sc.nextInt();
      l4.insert(element);
    }
    System.out.println("second List");
    for(int i=1;i<=n;i++){
      int element = sc.nextInt();
      l5.insert(element);
    }*/
    System.out.println("Altering");
    l2.alter(l1);
    l1.SpecialDelete(2, 1);
    l1.print();
  }
}
