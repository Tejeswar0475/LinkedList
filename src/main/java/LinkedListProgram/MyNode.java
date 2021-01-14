package LinkedListProgram;

public class MyNode<K> {
	
	private K key;
	private MyNode next;
	
	MyNode(K key)
	{
		this.key=null;
		this.next=null;	
	}
	
	public void setNext(MyNode next)
	{
		this.next=next;
	}
	
	public MyNode getNext()
	{
		return next;	
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to linked list program");
	}
}
