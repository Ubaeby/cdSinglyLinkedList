package ListAssignment;


public class SinglyLinkedList {
	
	public Node head;
	public SinglyLinkedList() {
		this.head = null;
	}

	public void add (int value) {
		Node newNode = new Node(value);
		if(head == null)
		{
			head = newNode;
		} else {
			Node runner = head;
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNode;
		}
	}
	
	public Integer remove() {
		Node last = head;
		int fakeNode;
		
		if(head.next == null) {
			fakeNode = head.value;
			head = null;
			return fakeNode;
		}
		
		while(last.next.next != null) {
			last = last.next;
		}
		
		fakeNode = last.next.value;
		last.next = null;
		return fakeNode;
		
	}
	
	public void printValues() {
		while (head.next != null) {  
			System.out.println(head.value);
		}
	}
	
}
