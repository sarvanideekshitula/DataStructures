public class QueueNode {
	DoubleNode[] arr = new DoubleNode[5];
	int front = -1;
	int rear = -1;
	QueueNode(){
		arr = new DoubleNode[10];
		front = -1;
		rear = -1;
	}
	QueueNode(int size){
		arr = new DoubleNode[size];
		front = -1;
		rear = -1;
	}
	public void print(){
		if(front == -1 && rear == -1)
			System.out.println("Queue is empty!");
		else
		{
			for(int i=front;i<=rear;i++){
				System.out.print(arr[i].data + " ");
			}
			System.out.println();
		}
	}
	public void enqueue(DoubleNode key){
		if(rear == arr.length-1)
			System.out.println("Queue is full");
		else if(front == -1 && rear == -1){
			front = 0;
			rear = 0;
			arr[rear] = key;
		}
		else{
			rear = rear + 1;
			arr[rear] = key;
		}
	}
	public int isEmpty(){
		if(rear == -1 && front == -1){
			return 1;
		}
		else{
			return 0;
		}
	}
	public DoubleNode getFront(){
		return arr[front];
	}
	public DoubleNode dequeue(){
		if(front == -1 && rear == -1)
			return null;
		else if(front == rear){
			int temp = front;
			front = -1;
			return arr[front];
		}
		else{
			int temp = front;
			front++;
			return arr[front];
		}
	}
	/*public boolean equals(QueueInt q){
		int flag = 1;
		if(this.front == q.front && this.rear == q.rear){
			for(int i=front;i<=rear;i++){
				if(this.arr[i] != q.arr[i])
					flag = 0;
			}
			if(flag == 0)
				return false;
			else
				return true;
		}
		else
			return false;
	}*/
}
