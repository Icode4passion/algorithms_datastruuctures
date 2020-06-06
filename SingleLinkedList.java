class Node :
    def __init__(self,data):
        self.data = data
        self.next = None

#Modify the Linked List eleminating tail node
class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.count = 0
    def addNode(self,data):
        node = Node(data)
        self.count +=1        
        if not self.head:
            self.head = node
            self.tail = node
        else:
            self.tail.next = node
            self.tail = node
    def insertAtstart(self,data):
        node = Node(data)
        if not self.head:
            self.head=node            
        else:
            node.next = self.head
            self.head = node

    def countLinkedList(self):
        count = 0
        current = self.head
        while current is not None:
            count +=1
            current = current.next
        return count

    def countInLinkedList(self):
        return self.count

    def insertAtEnd(self,data):
        node = Node(data)
        if self.head is None:
            self.head = node
            return
        current = self.head
        while current.next is not None:
            current = current.next
        current.next = node

    def display(self):
        current = self.head
        if self.head is None:
            print("List is Empty")
        while current is not None:
            print(current.data , end="" + "->")
            current = current.next
        print()

    def remove(self,data):
          if self.head is None:
                return
          current = self.head
          prev = None
            #runs iterartion and pointers stop at current aand prev values
          while current.data != data:
                prev = current
                current = current.next

          if prev is None:
                self.head = current.next
          else:
                prev.next = current.next
                
         
        
            
        
            

        
ll =  LinkedList()

ll.addNode(10)
ll.addNode(20)
ll.addNode(30)
ll.addNode(40)
ll.insertAtstart(1)
ll.insertAtEnd(11)
ll.insertAtEnd(21)
ll.display()
ll.remove(21)
ll.display()
ll.remove(1)
ll.display()
print("Below count prints all the nodes values, since it loops in all the nodes Time complexity is O(N)")
print("Count" ,ll.countLinkedList())
print("Below Count prints Nodes that are inserted in the addNode method but not in the insertAtStart its time Complexity is O(1)")
print("Count" ,ll.countInLinkedList())
