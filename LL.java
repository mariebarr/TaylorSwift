import java.util.NoSuchElementException;
//DOUBLY LINKED LIST to hold t swift questions
public class LL<T>{
	private Node head;
	private Node tail;
	private int size;

	public LL(){
		size=0;
	}

	private class Node{
		T element;
		Node next;
		Node prev;

		public Node(T element, Node next, Node prev){
			this.element=element;
			this.next=next;
			this.prev=prev;
		}
	}
	//get Nth element of LL!
	public T GetNth(int index){
		Node current=head;
		int count=0;
		while(current!=null){
			if(count==index)
				return(current.element);
			count++;
			current=current.next;
		}
	return head.element;	
	}

	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public void addFirst(T element){
		//next is head, its prev is null now
		Node tmp=new Node(element, head, null);
		//there's stuff in the list already...put the item before the first item
		if(head!=null){
			head.prev=tmp;
			head=tmp;
		}
		//list was empty. insert first item
		else{
			tail=tmp;
			head=tmp;
		}
		//increment size
		size++;
	//	System.out.println("adding: "+element);
	}
	public void addLast(T element){
		//next is null, prev is tail now
		Node tmp=new Node(element, null, tail);
		//if list has stuff in it already...set tail's next to tmp
		if(tail!=null){
			tail.next=tmp;
			tail=tmp;
		}
		//if list is empty...set inserted value to head
		else{
			head=tmp;
			tail=tmp;
		}
		//increment size
		size++;
	//	System.out.println("adding: "+element);
	}
	
	public void iterateForward(){
	//	System.out.println("iterating forward...");
		Node tmp=head;
		while(tmp!=null){
			System.out.println(tmp.element);
			tmp=tmp.next;
		}
	}
	public void iterateBackward(){
	//	System.out.println("iterating backward...");
		Node tmp=tail;
		while(tmp!=null){
			System.out.println(tmp.element);
			tmp=tmp.prev;
		}
	}
	public T removeFirst(){
		if(size==0) throw new NoSuchElementException();
		Node tmp=head;
		head=head.next;
		head.prev=null;
		size--;
	//	System.out.println("deleted: "+tmp.element);
		return tmp.element;
	}
	public T removeLast(){
		if(size==0) throw new NoSuchElementException();
		Node tmp=tail;
		tail=tail.prev;
		tail.next=null;
		size--;
	//	System.out.println("deleted: "+tmp.element);
		return tmp.element;
	}
	public T removeMid(T delete_me){
		T element=delete_me;
	//	Node tmp=head;
		if(head==null)
			return null;
		if(head.next==null&&head.element.equals(element)){
			head=null;
			tail=null;
		}
		Node tmp=head;
		
		while(tmp!=null){//&&!tmp.element.equals(element)){
			if(tmp.element.equals(element)){
			tmp.prev.next=tmp.next;
			tmp.next.prev=tmp.prev;
			tmp=null;
			return element;
			}
			else
				tmp=tmp.next;
		}
			return element;
	}

			


/*	public static void main(String a[]){
	//	LL<String> list=new LL<String>();
	//	//add questions last always,thus they will be in order.
	//	list.addLast("Taylor's family heard: \"All the lonely Starbucks lovers\" in this song.");
	//	list.addLast("Bye.");
	//	list.iterateForward();
			LL<Integer> list=new LL<Integer>();
	//	list.addFirst(10);
	//	list.addFirst(34);
		list.addLast(56);
		list.addLast(364);
		list.addLast(211);
		list.addLast(5);
		list.iterateForward();
		list.iterateForward();
	//	list.removeFirst();
	//	list.removeLast();
	//	list.iterateBackward();
//	}*/
//}
}


















