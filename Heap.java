import java.lang.*;
import java.math.*;
import java.io.*; 
import java.util.*; 

//HEAP MEANT TO SEARCH FOR WINNER OF TWSIFT GAME 


public class Heap {//Heap class must be the same name as java file! 
	int heap[]; //arrays are default zero in java! 
	int size = 0; 

public Heap() {
	size = 0; // default constructor
}

private void heapie(int value) { //heapie will make heap and organize it 
	int index = size+1;

	while (index>1 && heap[index/2]<value) {
		int temp = heap[index/2];
		heap[index/2] = heap[index];
		heap[index] = temp;
		index /= 2; //divide index by 2 and put result in index 
	}
}


private void max_heap(int[] input) {
	heap = new int[input.length+1];//store in heap starting from index 1 to avoid off by one error
	
	for (int i=0; i<input.length; i++) {
		heap[size+1]=input[i];

		heapie(input[i]);
		size++; 
	}
}



public static void main(String[] args) {

Heap heap_tester = new Heap();
heap_tester.max_heap(new int [] {2,1,3,56,5}); 
System.out.println("max element is ="+ heap_tester.heap[1]); 


	}	
}

