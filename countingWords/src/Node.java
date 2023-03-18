public class Node {
	public String data;
	public Node next;
	public int freq;
	public Node() {
		freq=0;
		next=null;
	}
	public Node(String d){
		data=d;
		next=null;
		freq=1;
	}

}
