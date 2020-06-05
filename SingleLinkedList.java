class Main {
  public static void main(String[] args) {
    System.out.println("Hello world! Linked List ");
    SingleLinkedList sll = new SingleLinkedList();
    sll.addNode(10);
    sll.addNode(20);
    sll.addNode(30);
    sll.addNode(40);
    sll.addNode(50);
    sll.addNode(60);
    

    sll.display();

    sll.insertAtEnd(11);

    sll.display();

  }
}

class SingleLinkedList{

    class Node{
      public int data;
      public Node next;

      Node (int data){
        this.data = data;
        this.next = next;
      }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){

      // create a new node 
      Node node = new Node(data);

      if (head == null){
        head = node;
        tail = node;
        //created pointer to head and tail
        //both are assigned to node as this the first node        
      }
      else {
        tail.next = node;
        tail = node;
        //placing the head at its orginal place and moving the tail //pointer for our convinence        
      }
    }

    //display the data in node

    public void display(){
      //create a variable for temp movement 
      Node current = head;
      //check for list empty
      if(head == null){
        System.out.print("List Empty");
      }
      while(current!=null){
        System.out.print(current.data+"->");
        //Current next value is assigned to current
        current = current.next;
      }
      System.out.println();

    }


    public void insertAtEnd(int data){
      Node node = new Node(data);
      if (head == null){
        //System.out.print("Empty List");
        head = node;
        tail = node;
        return ;
      }
      node.next = null;
      Node current = head;      
      while(current.next!=null){
        current = current.next;
      }
      current.next = node;
      return;
    }

}
