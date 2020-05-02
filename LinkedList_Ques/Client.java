package LinkedList_Ques;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list =new LinkedList();

		list.addFirst(20);
		list.addFirst(10);
		list.addLast(40);
		list.addLast(50);
		list.addAt(2, 30);
		list.addAt(0, 5);
		list.addAt(6, 60);
		//list.display();

		list.removeFirst();
		//list.display();
		
		list.removeLast();
		//list.display();

		list.removeAt(3);// 40
		//list.display();

		list.reversePR();
		list.display();

		list.reversePIL();
		list.display();

	}

}
