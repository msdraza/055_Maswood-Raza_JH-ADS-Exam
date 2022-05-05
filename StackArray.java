class StackArray{
	int arr[];
	int size;
	int top1;
	int top2;
	
	StackArray(int n){
	size = n;
	arr = new int[n];
	top1 = -1;
	top2 = size;
	}
	void push1(int x){
		if(top1 < top2-1){
			top1++;
			arr[top1] = x;
		}
		else{
			System.out.println("Stack Overflow");
			return ; 
		}
	}
	
	void push2(int x){
		if(top1 < top2-1){
			top2--;
			arr[top2] = x;
		}
		else{
			System.out.println("Stack Overflow");
			return ; 
		}
	}
	public void display1(){
		
		for(int i =0; i<1; i++){
			System.out.println("Popped element from stack1 is "+arr[top1]);
		}
	}
	public void display2(){
		
		for(int j =0; j<1; j++){
			System.out.println("Popped element from stack2 is "+arr[top2]);
		}
	}
	
	public static void main(String args[]){
		StackArray sa = new StackArray(10);
		sa.push1(5);
		sa.display1();
		sa.push2(10);
		sa.display2();
		sa.push2(15);
		sa.display2();
		sa.push1(11);
		sa.display1();
		sa.push2(7);
		sa.display2();
		sa.push2(40);
		sa.display2();
	}
}