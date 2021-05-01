package br.com.acbueno.exercices.teste12;

public class AddNode {

	public Node head = null;
	public Node tail = null;

	public void addStartList(int data) {
		Node newNodeAdd =new Node(data);

		if(head == null) {
			head=newNodeAdd;
			tail=newNodeAdd;
		} else {
			Node temp = head;
			head = newNodeAdd;
			head.next = temp;
		}
	}

    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Adding nodes start list ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


}
