public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueInt qi = new QueueInt();
		QueueInt qi2 = new QueueInt(1);
		System.out.println("Front:" + qi.front + "Rear:" + qi.rear);
		System.out.println(qi.arr.length);
		System.out.println(qi2.arr.length);
		qi.enqueue(100);
		qi.print();
		qi2.enqueue(200);
		qi2.print();
		qi2.enqueue(900);
		qi2.print();
		System.out.println(qi2.getFront());
		int item = qi2.dequeue();
		System.out.println("item:"+ item);
		qi2.print();
		QueueInt  qi3 = new QueueInt ();
		QueueInt  qi4 = new QueueInt ();
		qi4.enqueue(100);
		qi3.enqueue(100);
		qi4.enqueue(200);
		qi3.enqueue(200);
		System.out.println(qi3.equals(qi4));

		CircularQueue c1 = new CircularQueue(3);
		c1.enqueue(100);
		c1.enqueue(200);
		c1.enqueue(300);
		c1.print();
		c1.dequeue();
		c1.enqueue(400);
		c1.print();
	}

}
