public class Deque_CircularArray {
	int front =-1,rear=-1;
	int[] a = new int[5];
	Deque_CircularArray()
	{
		a=new int[10];
		front=-1;
		rear=-1;
	}
	Deque_CircularArray(int n)
	{
		a = new int[n];
		front=-1;
		rear=-1;
	}
	public boolean isEmpty()
	{
		if((front==-1) && (rear==-1))
			return true;
		else
			return false;
	}
	public boolean isFull()
	{
		if(front==((rear+1)%a.length))
			return true;
		else
			return false;
	}
	public void display()
	{
		if((front==-1) && (rear==-1))
			System.out.println("Queue is empty");
		if (front>rear)
		{
			for(int i=0;i<=rear;i++)
				System.out.print(a[i]+" ");
			for(int i=front;i<a.length;i++)
				System.out.print(a[i]+" ");
		}
		else
		{
			for(int i=front;i<=rear;i++)
				System.out.print(a[i]+" ");
		}
	}
	public void insertLast(int x)
	{
		if(front==((rear+1)%a.length))
			System.out.println("Can't Insert element");
		else
		{
			if(rear==(a.length-1))
			{
				rear=((rear+1)%a.length);
				a[rear]=x;
			}
			else if((rear==-1)&& (front==-1))
			{
				rear=0;
				front=0;
				a[rear]=x;
			}
			else
			{
				rear=rear+1;
				a[rear]=x;
			}

		}
	}
	public void insertFront(int x)
	{
		if(front==((rear+1)%a.length))
			System.out.println("Can't Insert element");
		else
		{

			if((rear==-1)&& (front==-1))
			{
				rear=0;
				front=0;
				a[front]=x;
			}
			else if(front == 0)
			{
				front=a.length-1;
				a[front]=x;
			}
			else
			{
				front=front-1;
				a[front]=x;
			}

		}
	}
	public int getFront()
	{
		if(front==-1)
		{
			System.out.println("Queue is Empty");
			return 0;
		}
		else
			return a[front];
	}
	public int getRear()
	{
		if(front==-1)
		{
			System.out.println("Queue is Empty");
			return 0;
		}
		else
			return a[rear];
	}
	public void deleteFront()
	{
		if((front==-1)&& (rear==-1))
			System.out.println("Can't Perform Dequeue");
		else if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else
		{
			if(front==(a.length-1))
				front=0;
			else
				front++;
		}
	}
	public void deleteLast()
	{
		if((front==-1)&& (rear==-1))
			System.out.println("Can't Perform Deletion");
		else if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else
		{
			if(rear==0)
				rear=(a.length-1);
			else
				rear--;
		}
	}
}
