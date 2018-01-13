public class CircularQueue {
	int[] arr = new int[5];
	int front = -1;
	int rear = -1;
	CircularQueue(){
		arr = new int[10];
		front = -1;
		rear = -1;
	}
	CircularQueue(int size){
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	public void print(){
		if(front == -1 && rear == -1)
			System.out.println("Queue is empty!");
		else if(rear < front){
			for(int i=front;i<arr.length;i++){
				System.out.print(arr[i] + " ");
			}
			for(int i=0;i<=rear;i++){
				System.out.print(arr[i] + " ");
			}
		}
		else
		{
			for(int i=front;i<=rear;i++){
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
	public void enqueue(int key){
		if(front == -1 && rear == -1){
			front = 0;
			rear = 0;
			arr[rear] = key;
		}
		else{
			rear = (rear + 1)%(arr.length);
			arr[rear] = key;
		}
	}
	public int getFront(){
		return arr[front];
	}
	public int dequeue(){
		if(front == -1 && rear == -1)
			return 0;
		else if(front == rear){
			int temp = front;
			front = -1;
			rear = -1;
			return arr[temp];
		}
			else
			{
				int temp = front;
				front  = (front+1)%arr.length;
				return arr[temp];
			}
	}
	public void splitq(CircularQueue q1, CircularQueue q2){
		for(int i=0;i<arr.length;i++){
			if((i+1)%2 == 0)
				q1.enqueue(arr[i]);
			else
				q2.enqueue(arr[i]);
		}
	}
	public int getminElement(){
		int min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}

}
