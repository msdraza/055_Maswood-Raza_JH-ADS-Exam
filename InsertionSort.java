import java.util.*;
class InsertionSort{
	
	void insertionsort(int a[]){
		int len =a.length;
		
		for(int i=1; i<len; i++){
			int j = a[i];
			int k = i-1;
			while(k>=0 && a[k]>j){
				a[k+1] = a[k];
				k=k-1;
			}
			a[k+1] = k;
		}
	}
	public void display(int a[]){
		int len =a.length;
		for(int j =0; j<len; j++){
			System.out.println(a[j]+" ");
		}
	}
	
	public static void main(String args[]){
		//int n;
		InsertionSort is = new InsertionSort();
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
	     //n = sc.nextInt();
		 System.out.println("Enter Array Elements");
		for(int i=0; i<5;i++){
			
	    a[i] = sc.nextInt();
		}
		is.insertionsort(a);
		is.display(a);
	}
}