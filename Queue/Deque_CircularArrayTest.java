
public class Deque_CircularArrayTest {
	public static void main(String[] args)
	{
		Deque_CircularArray D=new Deque_CircularArray(5);
		D.insertFront(10);
		D.insertLast(20);
		D.insertFront(30);
		D.deleteFront();
		D.deleteLast();
		D.insertLast(25);
		D.insertFront(40);
		D.insertFront(50);
		System.out.println(D.getRear());
		System.out.println(D.getFront());
	}
}
