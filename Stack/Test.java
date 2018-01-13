public class Test {
	public static void main(String[] args){
		StackInt si = new StackInt();
		StackInt si2 = new StackInt(15);
		System.out.println(si.peek());
		si.push(100);
		System.out.println(si.peek());
		si.print();
		si.push(200);
		System.out.println(si.peek());
		si.print();
		int item = si.pop();
		si.print();
		int item1 = si.pop();
		si.print();
		boolean code = si.equals(si2);
		if(code){
			System.out.println("si and si2 are equal");
		}
		else
			System.out.println("si and si2 are not equal");
		System.out.print("Stack top is " + si.top);
		System.out.println(si2.arr.length);
		System.out.println(si2.getTop());
		String s = new String();
		s.push('a');
		s.push('b');
		s.print();
		s.reverse();
	}
}
