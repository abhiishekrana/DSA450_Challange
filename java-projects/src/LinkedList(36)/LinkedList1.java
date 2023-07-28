// Reverse a LinkedList
public class LinkedList1 {
    static Node head;
    static class Node{
        int data;
        Node next;  
        Node(int data){
            this.data=data;
            next=null;
        }

}
Node reversNode(Node node){
    Node current=node;
    Node prev=null;
    Node nexNode = null;
    while(current!=null){
        nexNode=current.next;
        current.next=prev;
        prev=current;
        current=nexNode;
    

}
node =prev;
return node;
}
void printList(Node node){
    while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
}
public static void main(String[] args){
    LinkedList1 list = new LinkedList1();
    list.head=new Node(85);
    list.head.next = new Node(15);
    list.head.next.next = new Node(4);
    list.head.next.next.next = new Node(20);

    System.out.println("Given linked list");
    list.printList(head);
    head = list.reversNode(head);
    System.out.println("");
    System.out.println("Reversed linked list ");
    list.printList(head);


}
}
