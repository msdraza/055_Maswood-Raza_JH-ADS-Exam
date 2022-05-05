class LL{
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			data = d;
			next = null;
		}
	}
	
	void display(){
		Node n = head;
		while(n!=null){
			System.out.println(n.data)
		}
	}
	public static void main(String args[]){
		LL l1 = new LL();
		l1.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		l1.head.next = second;
		second.next = third;
	}
}