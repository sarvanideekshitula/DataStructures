package InfixEvaluation;
import java.util.Scanner;
public class StackChar {
	public int top;
	Scanner in = new Scanner(System.in);
	char[] a= new char[12];
	StackChar(int sz)
	{
		top=-1;
		a = new char[sz];

	}
	public void push(char x)
	{
		if(top>=(a.length-1))
			System.out.println("Stack is Full");
		else
		{
			top++;
			a[top]=x;
		}
	}
	public char pop()
	{
		if(top==(-1))
		{
			System.out.println("Can't pop. Stack is empty");
			return 0;
		}
		else
		{
			return a[top--];
		}
	}
	public int getTop()
	{
		return top;
	}
	public char peek()
	{
		if(top==-1)
		{
			return 0;
		}
		else
			return a[top];
	}
}
