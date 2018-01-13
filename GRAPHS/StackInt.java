public class StackInt {
	int[] arr;
	public int top;
	StackInt(int sz){
		arr = new int[sz];
		top = -1;
	}
	public void print(){
		for(int i=0;i<=top;i++){
			System.out.print(arr[i]+"	");
		}
		System.out.println();
	}
	public void push(int item){
		top++;
		if(top!=arr.length){
			arr[top]=item;
		}
		else{
			System.out.println("Cannot push. Array full");
		}
	}
	public int isEmpty(){
		if(top == -1){
			return 1;
		}
		else {
			return 0;
		}
	}
	public int getTop(){
		if(top!=-1){
			return top;
		}
		else{
			System.out.println("Stack empty");
			return 0;
		}
	}
	public int pop(){
		int temp = arr[top];
		if(top!=-1){
			top--;
			return temp;
		}
		else{
			System.out.println("Cannot pop");
			return 0;
		}

	}
	public int peek(){
		return arr[top];
	}
	public boolean equals(StackInt si){
		for(int i=0;i<arr.length;i++){
			if(this.arr[i] != si.arr[i]){
				return false;
			}
		}
		return true;
	}
	public int getminElement(){
		int small=arr[0];
		for(int i=0;i<=top;i++){
			if(arr[i]<small){
				small = arr[i];
			}
		}
		return small;
	}
	public StackInt copyStack(){
		StackInt copy = new StackInt(6);
		copy.top = this.top;
		for(int i=0;i<=top;i++){
			copy.arr[i]=this.arr[i];
		}
		return copy;
	}
}
